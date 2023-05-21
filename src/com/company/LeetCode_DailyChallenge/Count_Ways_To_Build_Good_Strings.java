package com.company.LeetCode_DailyChallenge;

public class Count_Ways_To_Build_Good_Strings {

    //2466. Count Ways To Build Good Strings
    //https://leetcode.com/problems/count-ways-to-build-good-strings/description/

    int mod= 1_000_000_007;

    public int countGoodStrings(int low, int high, int zero, int one) {

        long[] dp = new long[high+1];
        dp[0]= 1L;


        for( int i=0; i<high+1; i++){

            if( i+ zero <= high){
                dp[i+ zero]=  (dp[i+ zero] + dp[i])%mod;
            }
            if( i+ one <= high){
                dp[i+ one]= (dp[i+ one] + dp[i])%mod;
            }
        }

        long ans=0;


        for( int i=low ; i<=high; i++){

            ans= (ans+ dp[i])%mod;
        }

        return (int)ans;
    }


    /*

      int mod= 1_000_000_007;
    long[] dp;


    public int countGoodStrings(int low, int high, int zero, int one) {

        dp= new long[high+1];

        Arrays.fill( dp,-1L);

        return (int) fn( 0, low, high, zero, one);
    }


    long fn(int n, int low, int high, int zero, int one){

        long cur=0;

        if( n>high) return 0L;

        if( dp[n]!=-1) return dp[n];

        else if( n>=low && n<=high)
            cur++;


        cur= (cur +
        (fn( n+zero, low, high, zero, one)%mod
        + fn( n+one, low, high, zero, one) %mod)%mod)%mod;

        dp[n]= cur;

        return cur;
    }
    */
}
