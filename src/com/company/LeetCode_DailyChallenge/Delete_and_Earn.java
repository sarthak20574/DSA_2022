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

    public int deleteAndEarn1(int[] nums) {
        int l= 10_001;

        int[] dp= new int[10_001];

        for( int i: nums){
            dp[i]++;
        }
        // 1 2 3 4

        for( int i=2; i< l; i++){
            dp[i]= Math.max( dp[i-1], dp[i-2] + dp[i]*i);
        }
        return Math.max(dp[l-1], dp[l-2]);
    }
}
