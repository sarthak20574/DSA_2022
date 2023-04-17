package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Number_of_Ways_to_Form_a_Target_String_Given_a_Dictionary {

    //1639. Number of Ways to Form a Target String Given a Dictionary
    //https://leetcode.com/problems/number-of-ways-to-form-a-target-string-given-a-dictionary/description/
    // can see neetcode IO's vid

    //top down

    int mod= 1_000_000_007;
    int[][] freq;
    long[][] dp;

    public int numWays(String[] words, String target) {

        int w_n=words[0].length();
        freq= new int[w_n][];

        dp= new long[target.length()][w_n];

        for( int i=0; i<target.length(); i++){

            Arrays.fill( dp[i], -1L);
        }


        for( int i=0; i<w_n; i++){
            freq[i]= new int[26];
        }

        for( int i=0; i<w_n; i++){
            for( String x: words){
                freq[i][x.charAt(i)-'a']++;
            }
        }

        return (int) fn(target, 0, 0);
    }

    //


    long fn( String target, int i, int j){

        if( i== target.length()){
            return 1L;
        }

        if( j== freq.length){
            return 0L;
        }

        if( dp[i][j]!=-1) return (int)dp[i][j];

        long x=0 , y;

        if( freq[j][target.charAt(i)-'a']>0)
            x= (freq[j][target.charAt(i)-'a'] *  fn( target, i+1, j+1))%mod;

        y = fn( target, i, j+1)%mod;

        long total= (x+ y)%mod;

        dp[i][j]=total;


        return total;
    }

}
