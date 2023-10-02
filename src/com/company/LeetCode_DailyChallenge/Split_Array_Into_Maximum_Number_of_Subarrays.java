package com.company.LeetCode_DailyChallenge;

public class Split_Array_Into_Maximum_Number_of_Subarrays {

    //2871. Split Array Into Maximum Number of Subarrays
    //https://leetcode.com/problems/split-array-into-maximum-number-of-subarrays/description/
    public int maxSubarrays(int[] nums) {

        int cur=Integer.MAX_VALUE;
        int splits=0;

        for(int i=0; i<nums.length; i++){
            cur&=nums[i];
            if( cur==0){
                splits++;
                cur=Integer.MAX_VALUE;
            }
        }
        return splits!=0?splits:1;
    }

}
