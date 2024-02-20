package com.company.LeetCode_DailyChallenge;

public class K_Inverse_Pairs_Array {

    //629. K Inverse Pairs Array
    //https://leetcode.com/problems/k-inverse-pairs-array/?envType=daily-question&envId=2024-01-27
    //https://www.youtube.com/watch?v=dglwb30bUKI&ab_channel=NeetCodeIO

    long mod= 1_000_000_007L;
    //long mod=1;
    public int kInversePairs(int n, int k) {

        long[][] dp= new long[n+1][k+1];

        // 01  02 all 0s
        // 10 20 all 1
        // 0 0  0

        for( int i=0; i<=n; i++){
            dp[i][0]= 1L;
        }

        // dp[0][0]=1;// empty 0 inversion

        long sum=0L;
        for( int i=1; i<=n; i++){
            for( int j=1; j<=k; j++){
                //can form i pairs,ie,i-1,k + i-1, k-1 + i-1, k-2...k-n-1

                dp[i][j]= (dp[i][j-1]+dp[i-1][j])%mod;

                if( j-i>=0){
                    dp[i][j]= (dp[i][j]- dp[i-1][j-i]+ mod)%mod;
                }
            }
        }
        return (int)dp[n][k];
    }

}
