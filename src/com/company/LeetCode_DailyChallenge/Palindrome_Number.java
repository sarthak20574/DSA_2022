package com.company.LeetCode_DailyChallenge;

public class Palindrome_Number {

    //9. Palindrome Number
    //https://leetcode.com/problems/palindrome-number/description/
    //such a good solution must see
    //https://www.youtube.com/watch?v=yubRKwixN-U&ab_channel=NeetCode

    public boolean isPalindrome(int x) {

        if( x<0) return false;
        StringBuilder a= new StringBuilder(Integer.toString(x));

        StringBuilder b= new StringBuilder(Integer.toString(x));

        b.reverse();

        //System.out.println(a.toString());


        int i=0, j=0, n=a.length();

        while(i<n){

            if( a.charAt(i++)!=b.charAt(j++)) return false;
        }

        return true;
    }

}
