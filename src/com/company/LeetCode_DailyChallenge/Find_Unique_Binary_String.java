package com.company.LeetCode_DailyChallenge;

public class Find_Unique_Binary_String {

    //1980. Find Unique Binary String
    //https://leetcode.com/problems/find-unique-binary-string/?envType=daily-question&envId=2023-11-16

    public String findDifferentBinaryString(String[] s) {

        int n= s.length;
        StringBuilder ans= new StringBuilder();

        for( int i=0; i<n; i++){
            ans.append(s[i].charAt(i)=='0'?'1':'0');
        }

        return ans.toString();
    }

}
