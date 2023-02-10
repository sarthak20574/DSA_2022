package com.company.LeetCode_DailyChallenge;

public class Longest_Subarray_of_1_s_After_Deleting_One_Element {

    //1493. Longest Subarray of 1's After Deleting One Element
    //https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/description/

    public int longestSubarray(int[] nums) {

        int ans=0,j=0, ones=1, n= nums.length;

        // all 0s?

        for( int i=0; i<n; i++){

            if( nums[i]==0 && ones==0){
                while( nums[j++]==1);
                ones++;
            }

            if( nums[i]==0 && ones>=0){
                ones--;
            }

            ans= Math.max(ans,i-j);
        }

        return ans;
    }

}
