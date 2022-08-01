package com.company.LeetCode_DailyChallenge;

public class Delete_and_Earn {

    //https://www.youtube.com/watch?v=7FCemBxvGw0&ab_channel=NeetCode

    //740. Delete and Earn
    //https://leetcode.com/problems/delete-and-earn/

    public int deleteAndEarn(int[] nums) {

        int n= nums.length;

        int dp[]= new int[10001];

        for( int i=0; i<n ; i++){
            dp[nums[i]]+= nums[i];
        }


        for( int i=2; i<10001 ; i++){
            dp[i]= Math.max( dp[i-1], dp[i]+dp[i-2]);
        }

        return dp[10000];

    }
}
