package com.company.LeetCode_DailyChallenge;

public class Minimum_Size_Subarray_Sum {

    //209. Minimum Size Subarray Sum
    //https://leetcode.com/problems/minimum-size-subarray-sum/description/

    public int minSubArrayLen(int aim, int[] nums) {

        int ans= Integer.MAX_VALUE, cur=0, n= nums.length, j=0;

        for( int i=0; i<n; i++){
            cur+=nums[i];

            while( cur-nums[j]>=aim){
                cur-=nums[j];
                j++;
            }

            if( cur>=aim)
                ans= Math.min(ans, i-j+1);
        }

        return ans==Integer.MAX_VALUE?0:ans;
    }

}
