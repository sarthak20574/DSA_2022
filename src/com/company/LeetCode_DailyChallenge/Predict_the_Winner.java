package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Predict_the_Winner {

    //486. Predict the Winner
    //https://leetcode.com/problems/predict-the-winner/description/


    long[][] dp;
    public boolean PredictTheWinner(int[] nums) {
        dp= new long[nums.length+1][nums.length+1];

        for( int i=0;i<nums.length; i++){
            Arrays.fill( dp[i], -1L);
        }

        // 0 items chosen =1's chance +
        // 1 item chosen = 2's  chance -
        // so (i+n-1 -j)%2==0  ? +: -

        return fn( 0, nums.length-1,nums,nums.length)>=0;

    }

    long fn(int i, int j, int[] nums, int n){


        if( i>j){
            return 0;
        }
        if( dp[i][j]!=-1L) return dp[i][j];

        long s=0;

        if((i+(n-1) -j)%2==0){
            s=Math.max(nums[i]+ fn(i+1, j,nums,n ),nums[j]+ fn(i, j-1,nums, n ) );
        }
        else{
            s=Math.min(-nums[i]+ fn(i+1, j,nums, n ),-nums[j]+ fn(i, j-1,nums, n ) );
        }

        dp[i][j]=s;


        return s;
    }

}
