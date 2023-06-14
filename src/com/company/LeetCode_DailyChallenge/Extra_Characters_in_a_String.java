package com.company.LeetCode_DailyChallenge;

public class Extra_Characters_in_a_String {

    //2707. Extra Characters in a String
    //https://leetcode.com/problems/extra-characters-in-a-string/description/

    public int minExtraChar(String s, String[] dictionary) {

        int n = s.length();
        int[] dp = new int[n+1 ];

        dp[0]=0;

        for( int i=1; i<n+1; i++){

            dp[i]= dp[i-1]+1;


            for( String x: dictionary){

                int len= x.length();

                if( i-len>=0 && s.substring(i-len, i).equals(x)){

                    dp[i]=Math.min( dp[i], dp[i-len]);
                }
            }
        }

        return dp[n];
    }
}
