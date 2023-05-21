package com.company.LeetCode_DailyChallenge;

public class Solving_Questions_With_Brainpower {

    //2140. Solving Questions With Brainpower
    //https://leetcode.com/problems/solving-questions-with-brainpower/description/

    public long mostPoints(int[][] questions) {

        int n= questions.length;
        long[] dp= new long[n];

        dp[n-1]= questions[n-1][0];
        for( int i=n-2; i>=0; i--){
            dp[i]= questions[i][0];

            if( i+questions[i][1]+1<n)
                dp[i]+=dp[i+questions[i][1]+1];


            dp[i]=Math.max( dp[i], dp[i+1]);
        }


        return dp[0];
    }
}
