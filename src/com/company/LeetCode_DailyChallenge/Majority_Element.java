package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Majority_Element {

    //169. Majority Element
    //https://leetcode.com/problems/majority-element/description/

    public int majorityElement(int[] nums) {

        int n= nums.length;

        Map<Integer, Long> m= new HashMap<>();

        for( int i: nums){
            m.put( i, m. getOrDefault(i, 0L)+1L);
        }

        for( int i: m.keySet()){
            if( m.get(i)>n/2) return i;
        }

        return 0;

    }
}
