package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Count_All_Possible_Routes {

    //1575. Count All Possible Routes
    //https://leetcode.com/problems/count-all-possible-routes/description/

    // can watch aryan mittal's video
    int mod= 1000_000_007;
    long[][] dp;
    public int countRoutes(int[] loc, int st, int fin, int fuel) {


        // for( int i=0; i<=fuel; i++){

        // }
        int n=loc.length;

        dp= new long[n][fuel+1];

        for( int i=0; i<n; i++){

            Arrays.fill( dp[i], -1L);
        }
        return (int)fn( loc, st, fin,fuel,n);


    }

    long fn( int[] loc,int st, int fin, int fuel , int n){

        if( fuel<0) return 0;

        if( dp[st][fuel]!=-1L) return dp[st][fuel];

        long ans=0L;

        if( fin==st) ans++;

        for( int i=0; i<n; i++){

            if( i!=st){
                ans= (ans+
                        fn( loc, i, fin,fuel-Math.abs(loc[i]-loc[st]), n))%mod;
            }
        }

        dp[st][fuel]= ans;
        return ans;

    }
}
