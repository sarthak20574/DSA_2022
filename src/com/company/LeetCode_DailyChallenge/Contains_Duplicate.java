package com.company.LeetCode_DailyChallenge;

import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate {

    //217. Contains Duplicate
    //https://leetcode.com/problems/contains-duplicate/

    public boolean containsDuplicate(int[] nums) {

        // store all the numbers in a hash set and if we find that the number already present in the set then we have found a duplicate
        Set<Integer> s= new HashSet<>();

        for( int i: nums){
            if( s.contains(i)) return true;
            s.add(i);
        }

        return false;
    }
}