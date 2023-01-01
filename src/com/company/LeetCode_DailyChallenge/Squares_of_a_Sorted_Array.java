package com.company.LeetCode_DailyChallenge;

public class Squares_of_a_Sorted_Array {

    //977. Squares of a Sorted Array
    //https://leetcode.com/problems/squares-of-a-sorted-array/description/
    // can see Neetcode's video

    public int[] sortedSquares(int[] nums) {

        int n=nums.length;
        int[] ans= new int[n];


        for( int i=0; i<n; i++){
            nums[i]= nums[i] * nums[i];
        }

        int l=0, r=n-1, cur=n-1;

        while( l<=r){

            ans[cur--]= Math.max(nums[l], nums[r]);

            if( nums[l]>nums[r])
                l++;
            else r--;

        }


        return ans;
    }
}
