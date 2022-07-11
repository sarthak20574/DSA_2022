package com.company.LeetCode_DailyChallenge;

public class Reverse_Words_in_a_String {

    //151. Reverse Words in a String
    //https://leetcode.com/problems/reverse-words-in-a-string/

    public String reverseWords(String s) {

        StringBuilder ans= new StringBuilder();
        int n= s.length();

        int i=0, j=0;

        while( i<n){
            // skip the spaces in the front
            while( i<n && s.charAt(i)==' ')i++;
            // i is one step foprward...1st have to reach index 1 ony then will check if
            // there is a space at index 1


            //if reached the end then done....
            if( i>=n) break;
            j= i+1;

            // now traverse the word
            while( j<n && s.charAt(j)!=' ')j++;

            // insert at the start of our ans
            ans.insert(0, s.substring(i, j) + " ");
            i=j+1;
        }
        return ans.toString().toString().trim();

    }
}
