package com.company.LeetCode_DailyChallenge;

public class Detect_Capital {

    //520. Detect Capital
    //https://leetcode.com/problems/detect-capital/description/

    public boolean detectCapitalUse(String word) {

        int n= word.length();

        int cap=0;

        for( char i:word.toCharArray()){
            if( 'A'<=i && i<='Z') cap++;
        }

        if( cap==n || cap==0 ) return true;

        char first= word.charAt(0);

        if( cap==1 && 'A'<=first && first<='Z') return true;

        return false;
    }
}
