package com.company;

public class Friends_Pairing_Problem {

    //Friends Pairing Problem
    //https://practice.geeksforgeeks.org/problems/friends-pairing-problem5425/1
    //https://www.youtube.com/watch?v=SHDu0Ufjyk8&ab_channel=Pepcoding

    public long countFriendsPairings(int n)
    {

        int mod= 1000000007;

        long[] dp= new long[n+1];
        dp[0]=1L;
        dp[1]=1L;
        for( int i=2; i<=n; i++){
            dp[i]= (dp[i-1]+ ((i-1) * dp[i-2])%mod)%mod;
        }

        return dp[n];
    }
}
