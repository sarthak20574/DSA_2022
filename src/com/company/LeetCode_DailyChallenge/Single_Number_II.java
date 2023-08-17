package com.company.LeetCode_DailyChallenge;

public class Single_Number_II {

    //137. Single Number II
    //https://leetcode.com/problems/single-number-ii/description/
    //https://www.youtube.com/watch?v=7xJJ_42P_0U&ab_channel=AryanMittal
    public int singleNumber(int[] nums) {

        int ones=0, twos=0;
        for( int i: nums){
            ones= (ones ^i) & ( ~twos);
            twos= (twos^i) & (~ones);
        }

        return ones;
        
    }
}
