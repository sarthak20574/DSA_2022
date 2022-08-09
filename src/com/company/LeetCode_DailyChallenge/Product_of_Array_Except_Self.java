package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Product_of_Array_Except_Self {

    //238. Product of Array Except Self
    //https://leetcode.com/problems/product-of-array-except-self/
    // Watch neetcode's video

    public int[] productExceptSelf(int[] nums) {

        int n= nums.length;
        int[] ans= new int[n];
        Arrays.fill(ans, 1);

        // prefixing the answer array
        int prev=1;
        for( int i=0;i<n-1;i++){
            ans[i+1]= prev*nums[i];
            prev=ans[i+1];
        }

        //postfixing the answer array
        prev=1;
        for( int i=n-1; i>=1; i--){
            ans[i-1]*= prev* nums[i];
            prev= prev*nums[i];
        }

        return ans;
    }
}
