package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Unique_Number_of_Occurrences {

    //1207. Unique Number of Occurrences
    //https://leetcode.com/problems/unique-number-of-occurrences/description/

    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Long> m= new HashMap<>();

        for( int i: arr){
            m.put(i, m.getOrDefault(i,0L)+1);
        }

        Set<Long> s= new HashSet<>();
        for( long i: m.values()){
            if( s.add(i)==false) return false;
        }

        return true;
    }
}
