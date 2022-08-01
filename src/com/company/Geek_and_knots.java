package com.company;

public class Geek_and_knots {

    //Geek and knots
    //https://practice.geeksforgeeks.org/problems/little-murph-and-knots0402/1
    //https://www.youtube.com/watch?v=Itqncmcck6k&ab_channel=Let%27sPracticeTogether
    //https://www.youtube.com/watch?v=PT_diWtJr_I&ab_channel=SagarMalhotra

    static int knots(int M, int N, int K){
        long dp[][]= new long[1001][1001];
        long mod=1000000007;

        return (int)((comb(M,K,dp,mod) * comb(N,K,dp,mod))%mod);
    }

    static long comb( int n, int k, long[][] dp, long mod){

        if( k>n)return 0;
        if( k==0 || k==n) return 1;

        if( dp[n][k]!=0)return dp[n][k];

        return dp[n][k]=(comb(n-1, k,dp,mod)%mod + comb(n-1, k-1,dp,mod)%mod)%mod;
    }
}
