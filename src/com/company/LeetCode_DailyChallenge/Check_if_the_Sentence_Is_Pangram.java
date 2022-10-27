package com.company.LeetCode_DailyChallenge;

public class Check_if_the_Sentence_Is_Pangram {

    //https://leetcode.com/problems/check-if-the-sentence-is-pangram

    public boolean checkIfPangram(String sentence) {

        int[] f=new int[26];

        for( char i: sentence.toCharArray()){
            f[i-'a']++;
        }

        for( int i=0; i< 26; i++){
            if(f[i]==0) return false;
        }


        return true;
    }
}
