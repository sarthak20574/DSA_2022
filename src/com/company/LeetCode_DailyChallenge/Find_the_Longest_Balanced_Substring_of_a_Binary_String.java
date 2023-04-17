package com.company.LeetCode_DailyChallenge;

public class Find_the_Longest_Balanced_Substring_of_a_Binary_String {

    //2609. Find the Longest Balanced Substring of a Binary String
    //https://leetcode.com/problems/find-the-longest-balanced-substring-of-a-binary-string/description/
    //https://leetcode.com/problems/find-the-longest-balanced-substring-of-a-binary-string/solutions/3368491/c-one-iteration-two-counters/



    public int findTheLongestBalancedSubstring(String s) {

        // track down the successive 0s and 1s double of that will be the answer

        int ans = 0, n = s.length();

        int ones = 0, zeros = 0;

        for (int i = 0; i < n;) {

            zeros=0; ones=0;

            while( i<n && s.charAt(i)=='0'){
                zeros++;
                i++;
            }

            while( i<n && s.charAt(i)=='1'){
                ones++;
                i++;
            }
            ans= Math.max( ans, 2* Math.min(zeros, ones));

        }

        return ans;
    }
}
