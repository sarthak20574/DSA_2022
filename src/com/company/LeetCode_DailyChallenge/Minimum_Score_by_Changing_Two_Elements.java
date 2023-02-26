package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Minimum_Score_by_Changing_Two_Elements {

    //2567. Minimum Score by Changing Two Elements
    //https://leetcode.com/problems/minimum-score-by-changing-two-elements/description/

    public int minimizeSum(int[] nums) {

        int n= nums.length;

        if( n<=3) return 0;
        Arrays.sort(nums);


        return Math.min(nums[n-2]-nums[1],Math.min( nums[n-1]-nums[2],nums[n-3]-nums[0]));
    }


}
