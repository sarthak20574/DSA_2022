package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Profitable_Schemes {

    //879. Profitable Schemes
    //https://leetcode.com/problems/profitable-schemes/description/
    // neetcode and //https://www.youtube.com/watch?v=MosNqLOkJ3Y&ab_channel=AryanMittal

    long[][][] dp;
    long mod=1_000_000_007;

    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {

        // int maxx=0;
        // for( int i: profit){
        //     maxx+=i;
        // }

        dp= new long[101][101][101];


        for( int i=0;i<101; i++){

            for( int j=0; j< 101; j++){
                Arrays.fill(dp[i][j], -1L);
            }
        }
        return (int) fn(n, 0, minProfit, group, profit, 0);

    }


    long fn( int n, int cur_p, int p, int[] group, int[] profit, int i){

        // if(cur_p>=p){
        //         return 1;
        //     }

        // if( n==0){
        //     if(cur_p>=p){
        //         return 1;
        //     }
        //     else return 0;
        // }

        if( i==profit.length){

            if(cur_p>=p){
                return 1;
            }
            else return 0;
        }

        if( dp[n][i][cur_p]!=-1L) return dp[n][i][cur_p];

        long ans= fn( n, cur_p, p, group, profit, i+1) %mod;

        if( n-group[i]>=0){
            ans= (ans+ fn( n-group[i], Math.min(p,cur_p+profit[i]), p, group,profit ,i+1)%mod)%mod;
        }

        dp[n][i][cur_p]= ans;
        return ans;
    }

    public int profitableSchemes1(int n, int minProfit, int[] group, int[] profit) {

        long[][][] dp = new long[101][101][101];
        long mod = 1_000_000_007;
        dp[0][0][0] = 1;

        // i= group no,  j= profit, k= ppl
        for (int i = 1; i < group.length + 1; i++) {

            for (int j = 0; j < minProfit + 1; j++) {
                for (int k = 0; k < n + 1; k++) {
                    dp[i][j][k] = dp[i - 1][j][k];
                    if (k - group[i-1] >= 0) {
                        dp[i][j][k] += (dp[i - 1][Math.max(0, j - profit[i-1])][k - group[i-1]]) % mod;

                        dp[i][j][k] %= mod;
                    }
                }
            }

        }
        long ans = 0;
        for (int i = 0; i < n + 1; i++) {
            ans += dp[group.length][minProfit][i] % mod;
        }
        ans %= mod;

        return (int) ans;

    }

}
