package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Greatest_Sum_Divisible_by_Three {

    //1262. Greatest Sum Divisible by Three
    //https://leetcode.com/problems/greatest-sum-divisible-by-three/

    long ans=0L;
    long[][] dp;
    public int maxSumDivThree(int[] nums) {
        int n= nums.length;

        dp= new long[n+1][3];

        for( int i=0; i<n+1; i++){
            Arrays.fill(dp[i], -1);
        }

        long k=fn( 0, nums, 0);

        return (int) k;
    }

    long fn( int i, int[] nums, int cur){

        if( i==nums.length){
            if( cur==0) {
                return 0L;
            }
            return Integer.MIN_VALUE;
        }

        if( dp[i][cur]!=-1) return dp[i][cur];

        dp[i][cur]= Math.max( nums[i] + fn( i+1,nums,(cur+nums[i])%3 ),fn( i+1,nums,cur ));

        return dp[i][cur];
    }
}
