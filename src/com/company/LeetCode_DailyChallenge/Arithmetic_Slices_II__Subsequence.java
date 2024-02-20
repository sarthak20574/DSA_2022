package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Arithmetic_Slices_II__Subsequence {

    //446. Arithmetic Slices II - Subsequence
    //https://leetcode.com/problems/arithmetic-slices-ii-subsequence/submissions/1157801192/?envType=daily-question&envId=2024-01-07

    //https://www.youtube.com/watch?v=YIMwwT9JdIE&ab_channel=NeetCodeIO
    // can swee aryan mittal's vid too

    public int numberOfArithmeticSlices(int[] nums) {

        int n= nums.length, ans=0;

        Map<Long, Integer>[] dp= new HashMap[n];

        for( int i=0; i<n; i++){
            dp[i]= new HashMap<>();
        }

        for( int i=0; i<n; i++){

            long diff=0L;;
            for( int j=0; j<i; j++){
                diff= 1L*nums[i]-1L* nums[j];
                dp[i].put(diff, dp[i].getOrDefault(diff, 0)+ dp[j].getOrDefault(diff, 0)+1);
                ans+=dp[j].getOrDefault(diff, 0)+1;
            }
        }

        //-n*(n-1)
        return ans-n*(n-1)/2;
    }
}
