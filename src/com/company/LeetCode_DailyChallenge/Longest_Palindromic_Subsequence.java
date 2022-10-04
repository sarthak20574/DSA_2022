package com.company.LeetCode_DailyChallenge;

public class Longest_Palindromic_Subsequence {

    //516. Longest Palindromic Subsequence

    public int longestPalindromeSubseq(String s) {

        int n=s.length();
        StringBuilder rev= new StringBuilder(s).reverse();
        int[][] dp= new int[n+1][n+1];

        for( int i=0; i<n+1; i++){
            dp[i][0]=0;
            dp[0][i]=0;
        }

        for( int i=1;i<n+1; i++){
            for( int j=1; j<n+1; j++){
                if( s.charAt(i-1)==s.charAt(i-1)){
                    dp[i][j]= 1+ dp[i-1][j-1];
                }
                else {
                    dp[i][j]= Math.max( dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[n][n];
    }
}
