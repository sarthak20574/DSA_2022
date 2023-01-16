package com.company.LeetCode_DailyChallenge;

public class Find_Minimum_in_Rotated_Sorted_Array {


    //153. Find Minimum in Rotated Sorted Array
    //https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/


    // a different solutiom
    //https://www.youtube.com/watch?v=nIVW4P8b1VA&ab_channel=NeetCode

    int ans=Integer.MAX_VALUE;
    public int findMin(int[] nums) {

        fn(nums, 0, nums.length-1);
        return ans;


    }


    void fn(int[] nums, int beg, int end){

        if( beg<=end){

            int mid= beg+ (end -beg)/2;

            if( nums[beg]<=nums[mid] && nums[mid] <= nums[end] ){
                ans= Math.min(ans, nums[beg]);

            }
            else{
                fn( nums, beg, mid);
                fn( nums, mid+1, end);
            }

        }

    }
}
