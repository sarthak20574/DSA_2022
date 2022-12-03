package com.company.LeetCode_DailyChallenge;

public class Single_Number {

    //136. Single Number
    //https://leetcode.com/problems/single-number/description/

    public int singleNumber(int[] nums) {

        int ans=0;

        for( int i: nums){
            ans^=i;
        }

        return ans;
    }
}
