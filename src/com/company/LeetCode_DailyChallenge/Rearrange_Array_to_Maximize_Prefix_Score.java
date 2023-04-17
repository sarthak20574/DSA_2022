package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Rearrange_Array_to_Maximize_Prefix_Score {


    //2587. Rearrange Array to Maximize Prefix Score
    //https://leetcode.com/problems/rearrange-array-to-maximize-prefix-score/description/
    public int maxScore(int[] nums) {
        //[2,-1,0,1,-3,3,-3]
        // 3 2 1 0   -3 -2 -1


        Arrays.sort( nums);

        long prev=0, ans=0;

        for( int i=nums.length-1; i>=0; i--){

            prev+=nums[i];

            if( prev>0) ans++;
        }

        return (int)ans;

    }
}
