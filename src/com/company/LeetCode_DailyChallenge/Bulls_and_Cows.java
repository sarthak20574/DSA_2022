package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Bulls_and_Cows {

    //299. Bulls and Cows
    //https://leetcode.com/problems/bulls-and-cows/


    public String getHint(String secret, String guess) {


        Map<Character, Integer> m= new HashMap<>();
        Map<Character, Integer> map_g= new HashMap<>();

        // if a characters are equal at same index, then we have found a bull else we keep a count of the unmatched characters in the 2 maps
        int bulls=0, cows=0;
        for( int i=0; i<guess.length(); i++){
            if(guess.charAt(i)==secret.charAt(i)){
                bulls++;
            }
            else{
                m.put(secret.charAt(i),m.getOrDefault(secret.charAt(i), 0)+1);
                map_g.put(guess.charAt(i),map_g.getOrDefault(guess.charAt(i), 0)+1);
            }
        }

        //find the common elements in the maps of our secret word we add the minimum of the counts of the common elements
        for( Character c: map_g.keySet()){
            if( m.containsKey(c)){
                cows+=Math.min(m.get(c), map_g.get(c));
            }
        }

        return bulls+"A"+cows+"B";
    }
}
