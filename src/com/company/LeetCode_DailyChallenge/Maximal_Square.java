package com.company.LeetCode_DailyChallenge;

public class Maximal_Square {

    //221. Maximal Square
    //https://leetcode.com/problems/maximal-square/
    //https://www.youtube.com/watch?v=nZAyRZC8tko&ab_channel=CodewithAlisha

    public int maximalSquare(char[][] matrix) {

        int n= matrix.length;
        int m= matrix[0].length;
        int ans=0;

        int[][] dp= new int[n+1][m+1];

        for( int i=0; i<n; i++){

            for( int j=0; j<m; j++){

                if( i==0 || j==0) dp[i][j]= matrix[i][j]-'0';

                else if( matrix[i][j]=='1'){

                    dp[i][j]= Math.min(dp[i-1][j-1],Math.min(dp[i-1][j], dp[i][j-1]))+1;

                }

                ans= Math.max( dp[i][j], ans);
            }
        }
        return ans*ans;
    }


}
