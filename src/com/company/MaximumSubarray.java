package com.company;

public class MaximumSubarray {
    //53. Maximum Subarray
    //https://leetcode.com/problems/maximum-subarray/

    //this one handles negative elements too
    /*
    int maxSubArray(vector<int>& nums) {
     int n= nums.size();
     int ans=INT_MIN, present_sum=0;
     for( int i=0 ; i< n; i++){
         ans=max(present_sum+nums[i], ans);
         present_sum= max(0, present_sum+nums[i]);
     }
     return ans;
    }
     */

}
