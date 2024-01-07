package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Minimum_Difficulty_of_a_Job_Schedule {

    //1335. Minimum Difficulty of a Job Schedule
    //https://leetcode.com/problems/minimum-difficulty-of-a-job-schedule/?envType=daily-question&envId=2023-12-29

    long[][][] dp;
    public int minDifficulty(int[] j, int d) {

        int n= j.length;

        dp= new long[n+1][d+1][1000+1];

        for( int i=0; i<n+1; i++){
            for(int k=0; k<d+1;k++){
                Arrays.fill( dp[i][k], -1L);
            }
        }

        if( d>n) return -1;
        return (int)fn(0, d, j, 0);

    }

    long fn( int i, int d, int[] j, int cur){

        if( i==j.length){
            return d==0?0:Integer.MAX_VALUE;
        }
        //if( i>j.length) return Integer.MAX_VALUE;

        if(d<=0) return Integer.MAX_VALUE;

        if( dp[i][d][cur]!=-1L) return  dp[i][d][cur];

        cur= Math.max( cur, j[i]);
        // end the day at this job
        long x=Math.min(cur+ fn( i+1, d-1,j,0), fn( i+1, d,j,cur));

        dp[i][d][cur]= x;
        return x;
    }
}
