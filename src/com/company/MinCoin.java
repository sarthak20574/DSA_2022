package com.company;

public class MinCoin {

    //Min Coin
//https://practice.geeksforgeeks.org/problems/min-coin5549/1#
    public int MinCoin(int[] nums, int amount) {
        int n= nums.length;
        int[][] dp= new int[n+1][amount+1];

        for( int i=0 ;i< n+1; i++) dp[i][0]= 0;
        for( int i=0 ; i< amount+1; i++) dp[0][i]= Integer.MAX_VALUE-1;

        for( int i=1 ; i< n+1; i++){

            for( int j=1; j< amount+1; j++){
                if( j-nums[i-1] <0){
                    dp[i][j]= dp[i-1][j];
                }
                else {
                    dp[i][j]= Math.min(dp[i-1][j], dp[i][j-nums[i-1]]+1);
                }
            }
        }
        return dp[n][amount]==Integer.MAX_VALUE-1? -1:dp[n][amount];
    }
}
