package com.company.LeetCode_DailyChallenge;

public class First_Unique_Character_in_a_String {

    //387. First Unique Character in a String
    //https://leetcode.com/problems/first-unique-character-in-a-string/

    // much better method
    //https://www.youtube.com/watch?v=St47WCbQa9M&ab_channel=KevinNaughtonJr.

    public int firstUniqChar(String s) {

        int[] freq= new int[26];
        int n= s.length();


        for( int i=0; i<n; i++){
            freq[s.charAt(i)-'a']++;
        }

        for( int i=0; i<n; i++){
            if( freq[s.charAt(i)-'a']==1) return i;
        }

        return -1;

    }
}
