package com.company;

public class Number_of_ways {

    //Number of ways
    //https://practice.geeksforgeeks.org/problems/number-of-ways2552/1

    static long arrangeTiles(int N){

        long[] dp= new long[N+1];

        if( N<=3) return 1;

        for( int i=0; i<4; i++){
            dp[i]= 1;
        }

        for( int i=4; i<N+1; i++){
            dp[i]=dp[i-1]+dp[i-4];
        }
        return dp[N];
    }
}
