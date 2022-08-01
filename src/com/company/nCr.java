package com.company;

public class nCr {
    //nCr
    //https://practice.geeksforgeeks.org/problems/ncr1019/1
    // the fitst part of https://www.youtube.com/watch?v=Itqncmcck6k&ab_channel=Let%27sPracticeTogether


    static int nCr(int n, int r)
    {
        long mod= 1000000007;
        long dp[][] = new long[n+1][r+1];

        return (int) fn( n, r, dp, mod);


    }

    static long fn( int n, int r, long[][] dp, long mod){

        if( r>n) return 0;// choose 40 ppl form population of 10 so 0 way
        if(n==r || r==0) return 1;

        if( dp[n][r]!=0) return dp[n][r];

        dp[n][r]= (fn( n-1,r, dp, mod)%mod + fn( n-1, r-1, dp, mod)%mod)%mod;

        return dp[n][r];

    }
}
