package com.company.LeetCode_DailyChallenge;

public class Partitioning_Into_Minimum_Number_Of_Deci_Binary_Numbers {

    //1689. Partitioning Into Minimum Number Of Deci-Binary Numbers
    //https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/

    public int minPartitions(String n) {
        int ans=0;

        for( char x: n.toCharArray()){
            ans= Math.max(x-'0', ans);
        }

        return ans;
    }
}
