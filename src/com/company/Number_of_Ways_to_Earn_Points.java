package com.company;

import java.util.Arrays;

public class Number_of_Ways_to_Earn_Points {
    //2585. Number of Ways to Earn Points
    //https://leetcode.com/problems/number-of-ways-to-earn-points/submissions/

    // see the dp solution too, too hard to understand
    int mod = (int)1e9 + 7;
    long[][] dp;

    public int waysToReachTarget(int target, int[][] t) {

        int n=t.length;
        dp= new long[target+1][n+1];

        for( int i=0; i<target+1; i++){
            Arrays.fill(dp[i], -1L);
        }

        // System.out.println(Arrays.deepToString(dp));

        // Arrays.stream(cache).forEach(a -> Arrays.fill(a, -1)); // init cache with -1

        return (int)fn(0, 0, target, n, t);

        //    long ans=0;
        //    for( long i: dp[0]){
        //        if( i!=-1) ans= (ans+ i)%mod;
        //    }
        // return (int)ans;
    }


    long fn(int cur, int i,int target, int n, int[][] t){


        if( cur==target) return 1L;

        if(cur>target ) return 0L;

        if( i==n) return 0L;

        if( dp[cur][i]!=-1L) return dp[cur][i];

        long res=0L;

        for( int k=0; k<=t[i][0]; k++){
            res= (res+ fn(cur+ (t[i][1]*k), i+1, target, n, t)) % mod;
        }

        dp[cur][i]=res;
        return res;
    }

}
