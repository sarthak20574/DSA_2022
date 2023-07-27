package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Maximum_Beauty_of_an_Array_After_Applying_Operation {

    //2779. Maximum Beauty of an Array After Applying Operation
    //https://leetcode.com/problems/maximum-beauty-of-an-array-after-applying-operation/description/


    public int maximumBeauty(int[] nums, int k) {

        Arrays.sort(nums);

        int ans=0, j=0, n= nums.length;

        for( int i=0; i<n; i++){
            while(nums[i]-nums[j]> 2*k) j++;

            ans= Math.max(i-j+1, ans);
        }

        //System.out.println((nums[i+1]-nums[i])+" & "+(nums[j]-nums[j-1]));

        return ans;
    }
}
