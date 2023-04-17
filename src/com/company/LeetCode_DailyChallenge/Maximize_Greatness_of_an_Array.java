package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Maximize_Greatness_of_an_Array {

    //2592. Maximize Greatness of an Array
    //https://leetcode.com/problems/maximize-greatness-of-an-array/description/

    public int maximizeGreatness(int[] nums) {

        int i=0, j=0, n= nums.length;

        Arrays.sort( nums);

        while( j<n){

            while( j<n && nums[i]==nums[j]) j++;

            if( j<n){
                i++;
                j++;
            }

        }
        return i;

    }

}
