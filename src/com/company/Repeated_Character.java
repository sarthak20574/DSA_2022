package com.company;

import java.util.HashSet;
import java.util.Set;

public class Repeated_Character {

    char firstRep(String S)
    {
        char ans= '#';
        Set<Character> s= new HashSet<>();

        for( int i=S.length()-1; i>=0; i--){
            if( s.contains(S.charAt(i))==true) ans= S.charAt(i);
            else {
                s.add( S.charAt(i));
            }
        }

        return ans;
    }
}
