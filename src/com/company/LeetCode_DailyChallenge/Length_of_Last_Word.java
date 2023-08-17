package com.company.LeetCode_DailyChallenge;

public class Length_of_Last_Word {

    //58. Length of Last Word
    //https://leetcode.com/problems/length-of-last-word/description

    public int lengthOfLastWord(String s) {

        // while( )

        int len=0, n=s.length(), i=n-1;

        while( i>=0 &&  s.charAt(i)==' '){
            i--;
        }
        n=i;

        while( i>=0 && s.charAt(i)!=' '){
            i--;
        }

        return n-i;

    }


}
