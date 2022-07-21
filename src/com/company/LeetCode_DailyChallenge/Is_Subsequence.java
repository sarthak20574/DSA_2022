package com.company.LeetCode_DailyChallenge;

public class Is_Subsequence {

    //392. Is Subsequence
    //https://leetcode.com/problems/is-subsequence/

    //much better way
    //https://www.youtube.com/watch?v=PwQnydsKk_I&ab_channel=TECHDOSE

    public boolean isSubsequence(String s, String t) {

        int i=0;

        for( int j=0; j<t.length(); j++){
            if( i==s.length()) return true;
            if( s.charAt(i)==t.charAt(j))i++;
        }
        return i==s.length();

    }
}




