package com.company.LeetCode_DailyChallenge;

import java.util.HashSet;
import java.util.Set;

public class Determine_if_String_Halves_Are_Alike {

    //1704. Determine if String Halves Are Alike
    //https://leetcode.com/problems/determine-if-string-halves-are-alike/description/

    public boolean halvesAreAlike(String s) {

        String x= "AEIOUaeiou";
        Set<Character> set= new HashSet<>();

        for( char c: x.toCharArray()){
            set.add(c);
        }

        int till=s.length()/2, lft=0, ryt=0;
        for( int i=0; i<till; i++){
            if( set.contains(s.charAt(i))==true) lft++;
        }


        for( int i=till; i<s.length(); i++){
            if( set.contains(s.charAt(i))==true) ryt++;
        }

        return ryt==lft;
    }
}
