package com.company.LeetCode_DailyChallenge;

public class Wiggle_Subsequence {

    //376. Wiggle Subsequence
    //https://leetcode.com/problems/wiggle-subsequence/submissions/
    //https://www.youtube.com/watch?v=D8m8eWP8w4E&ab_channel=CodewithAlisha

    public int wiggleMaxLength(int[] nums) {

        int incre=1;
        int decre=1;

        for( int i=1; i<nums.length; i++){
            if( nums[i-1]>nums[i]) decre= incre+1;
            else if( nums[i-1]<nums[i]) incre= decre+1;
        }

        return Math.max( incre, decre);
    }
}
