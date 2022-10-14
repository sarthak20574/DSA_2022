package com.company.LeetCode_DailyChallenge;

public class Break_a_Palindrome {

    //1328. Break a Palindrome
    //https://leetcode.com/problems/break-a-palindrome/description/
    //https://www.youtube.com/watch?v=iXbJ1qvKg28&ab_channel=Errichto

    public String breakPalindrome(String palindrome) {

        // if we see any char other than a we change it to a 'a' then return the modified string

        //but there are some special cases

        // aabaa or odd palindrome, then got to return aabab or only change the last character of the given string
        //length of the string =1, got to return ""

        int a=0,n=palindrome.length();

        if( n==1)return "";

        char[] ans= palindrome.toCharArray();

        for( int i=0; i<n/2; i++){
            if( ans[i]!='a'){
                ans[i]='a';
                return String.valueOf(ans);
            }
        }

        ans[n-1]='b';
        return String.valueOf(ans);

    }

}
