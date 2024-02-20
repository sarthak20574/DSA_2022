package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Cherry_Pickup_II {

    //1463. Cherry Pickup II
    //https://leetcode.com/problems/cherry-pickup-ii/description/?envType=daily-question&envId=2024-02-11
    //https://www.youtube.com/watch?v=c1stwk2TbNk&ab_channel=NeetCodeIO

    // must do dp too
    //https://leetcode.com/problems/cherry-pickup-ii/?envType=daily-question&envId=2024-02-11

    long[][][] dp;
    public int cherryPickup(int[][] g) {

        int n=g.length, c=g[0].length;
        dp= new long[n][c][c];

        for( int i=0; i<n; i++){
            for( int j=0; j<c; j++){
                Arrays.fill(dp[i][j], -1L);
            }
        }

        return (int)fn(g, 0, 0,g[0].length-1);
    }

    long fn(int[][] g, int r, int c1, int c2){

        if( r==g.length){
            return 0;
        }
        if( dp[r][c1][c2]!=-1L) return  dp[r][c1][c2];

        int[] dirs= {-1, 0, 1};

        long cur=0;

        for( int d:dirs){
            if( c1+d>=0 && c1+d<g[0].length){
                for( int d1:dirs){
                    if( c2+d1>=0 && c2+d1<g[0].length &&  c2+d1!=c1+d){
                        cur= Math.max( g[r][c1]+ g[r][c2]+fn(g, r+1, c1+d, c2+d1), cur);
                    }
                }

            }
        }
        dp[r][c1][c2]=cur;

        return cur;

    }

}
