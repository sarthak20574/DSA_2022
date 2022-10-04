package com.company.LeetCode_DailyChallenge;

public class Minimum_Insertion_Steps_to_Make_a_String_Palindrome {

    //1312. Minimum Insertion Steps to Make a String Palindrome

    public int minInsertions(String s) {

        StringBuilder rev= new StringBuilder(s).reverse();
        int n= s.length();

        int[][]dp= new int[n+1][n+1];

        for( int i=0; i<n; i++){
            dp[i][0]=0;
            dp[0][i]=0;
        }

        for(int i=1; i<n+1; i++){
            for( int j=1; j<n+1; j++){
                if( s.charAt(i-1)==rev.charAt(j-1)){
                    dp[i][j]= 1+ dp[i-1][j-1];
                }
                else dp[i][j]= Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }

        return n- dp[n][n];
    }

}
