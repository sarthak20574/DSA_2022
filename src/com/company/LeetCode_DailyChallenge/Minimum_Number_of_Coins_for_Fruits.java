package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Minimum_Number_of_Coins_for_Fruits {

    //100133. Minimum Number of Coins for Fruits
    //https://leetcode.com/problems/minimum-number-of-coins-for-fruits/


    long[][] dp;
    public int minimumCoins(int[] p) {
        // can skip untill 1

        dp= new long[p.length+1][p.length+1];

        for( int i=0; i<p.length+1; i++){
            Arrays.fill(dp[i], -1L);
        }
        return (int) (p[0]+fn(1,1,p ));
    }

    long fn( int cur, int can_skip, int[] p){
        if( cur==p.length)return 0L;

        long ans= Integer.MAX_VALUE;
        if( cur>can_skip && cur!=can_skip+1 ) return Integer.MAX_VALUE;
        if( dp[cur][can_skip]!=-1) return dp[cur][can_skip];

        if( cur==can_skip+1) ans= p[cur]+fn( cur+1, Math.min(cur+ (cur+1), p.length),p);
        else {
            ans= Math.min(p[cur]+fn( cur+1, Math.min(cur+ (cur+1), p.length),p ),ans);
            ans= Math.min(ans,  fn( cur+1, can_skip, p));
        }

        dp[cur][can_skip]= ans;
        return ans;

    }
}
