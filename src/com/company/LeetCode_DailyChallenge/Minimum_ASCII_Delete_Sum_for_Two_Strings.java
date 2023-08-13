package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Minimum_ASCII_Delete_Sum_for_Two_Strings {

    //712. Minimum ASCII Delete Sum for Two Strings
    //https://leetcode.com/problems/minimum-ascii-delete-sum-for-two-strings/description/

    //LCS

    long[][] dp;
    public int minimumDeleteSum(String s1, String s2) {

        dp= new long[s1.length()+1][s2.length()+1];

        for( int i=0; i<s1.length()+1; i++){
            Arrays.fill(dp[i], -1L);
        }
        return (int)fn(s1, s2, 0, 0);

    }

    long fn(String s1, String s2, int i, int j){

        if( i==s1.length() && j==s2.length()){
            return 0;
        }

        if( dp[i][j]!=-1L) return dp[i][j];


        long ans= Integer.MAX_VALUE;

        if(i<s1.length()  && j<s2.length() && s1.charAt(i)==s2.charAt(j)){
            ans=fn( s1, s2, i+1, j+1);
        }

        if(i<s1.length() ){
            ans= Math.min(ans, s1.charAt(i)+fn( s1, s2, i+1, j));
        }

        if(j<s2.length()){
            ans= Math.min(ans,s2.charAt(j)+fn( s1, s2, i, j+1));
        }

        dp[i][j]= Math.min( Integer.MAX_VALUE, ans);

        return dp[i][j];
    }

}
