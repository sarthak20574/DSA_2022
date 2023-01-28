package com.company.LeetCode_DailyChallenge;

import java.util.List;

public class Word_Break {

    //139. Word Break
    //https://leetcode.com/problems/word-break/description/
    //https://youtu.be/Sx9NNgInc3A?t=548

    public boolean wordBreak(String s, List<String> dict) {

        int n= s.length();

        boolean[] dp= new boolean[n+1];
        dp[n]=true;

        for( int i=n-1; i>=0; i--){

            for( String x: dict){

                if( i+x.length()<=n){
                    if( s.substring(i,i+x.length()).equals(x)==true){
                        dp[i]=dp[i+x.length()];
                        if( dp[i]==true) break;
                    }
                }
            }
        }

        return dp[0];
    }

}
