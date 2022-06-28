package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Minimum_Deletions_to_Make_Character_Frequencies_Unique {


    //1647. Minimum Deletions to Make Character Frequencies Unique
    //https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique/

    public int minDeletions(String s) {

        int ans=0;

        Map<Character, Integer> map= new HashMap<Character, Integer>();

        // use map to get the array/list of the different frequencies.
        for( char x: s.toCharArray()){
            map.put(x,map.getOrDefault(x, 0)+1);
        }


        Set<Integer> set= new HashSet<>();

        for( int i: map.values()){

            if( set.contains(i)==true){

                // till we don't get a unique frequency we keep decreasing the frequencies
                while( set.contains(i)== true){

                    i--;
                    ans++;

                    // if no elements left to delete then just break
                    if( i==0) break;
                }
            }
            set.add( i);
        }
        return ans;
    }
}
