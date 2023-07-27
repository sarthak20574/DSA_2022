package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Tallest_Billboard {


    //956. Tallest Billboard
    //https://leetcode.com/problems/tallest-billboard/description/
    //see aryan mittal's video

    long[][] dp;
    public int tallestBillboard(int[] rods) {

        // diff can be from -5000 to 5000
        dp= new long[21][2 * 5000+1];

        for( int i=0; i<21; i++){
            // for( int j=0; j<5001; j++){
            Arrays.fill(dp[i], -1L);
            // }
        }

        return(int) fn( rods, rods.length, 0, 0);

        // return 0;
    }

    long fn(int[] rods, int n, int i,int diff){

        if( i==n){
            if( diff==0) return 0;
            else return Integer.MIN_VALUE;
            // return supersmall so it will ber be counted if diff not 0
        }

        if( dp[i][diff+5000]!=-1L) return dp[i][diff+5000];

        // either in a, b or none of them

        long x= Math.max(fn( rods, n, i+1, diff),
                Math.max(rods[i]+fn( rods, n, i+1, diff+rods[i]),
                        fn( rods, n, i+1, diff - rods[i]) ));

        dp[i][diff+5000]=x;

        return x;
    }


        }
