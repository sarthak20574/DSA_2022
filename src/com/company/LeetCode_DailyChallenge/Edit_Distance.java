package com.company.LeetCode_DailyChallenge;

public class Edit_Distance {

    //72. Edit Distance
    //https://leetcode.com/problems/edit-distance/description/

    public int minDistance(String word1, String word2) {

        /*
        dp[i][j] = cost to change word1(0..i) to word2(0..j).

        base case convert "" to a word1 = the length of word1( ie, delete all characters)
         */
        int n = word1.length(), m = word2.length();

        int[][] dp= new int[n+1][m+1];

        for( int i=0; i<n+1; i++){
            dp[i][0]=i;
        }

        for( int i=0; i<m+1; i++){
            dp[0][i]=i;
        }

        for( int i=1; i<n+1; i++){

            for( int j=1; j<m+1; j++){

                if( word1.charAt(i-1)== word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    dp[i][j]= Math.min( dp[i-1][j],
                            Math.min(dp[i][j-1], dp[i-1][j-1]) ) +1;
                }
            }
        }

        return dp[n][m];
    }

}
