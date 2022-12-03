package com.company.LeetCode_DailyChallenge;

public class Single_Element_In_Sorted_Array {

    //Single Element In Sorted Array
    //https://www.youtube.com/watch?v=PzszoiY5XMQ&ab_channel=takeUforward
    //https://leetcode.com/problems/single-element-in-a-sorted-array/description/

    // 1 1 2 3 3 4 4 8 8
    // 0 1 2 3 4 5 6 7 8

    // have to find the pt where the odering is changing or the pt where the single element is present
    // at index 0 we have 1 then at index 1 too we have 1,
    // so if mid ==odd if mid-1 == mid then move to the right half
    //at index 5(odd) we have 4 then at index 6 we again have 4 we move to the left

    public int singleNonDuplicate(int[] nums) {

        int low=0, high=nums.length-2, mid;

        while( low<=high){
            mid= low + ( high-low)/2;

            if( mid%2!=0){
                //odd like index 0 1
                if( nums[mid-1]==nums[mid]){
                    low= mid+1;
                }
                else {
                    high= mid-1;
                }
            }
            else {

                // mid = even
                if( nums[mid]==nums[mid+1]){
                    low= mid+1;
                }
                else {
                    high= mid-1;
                }
            }

        }
        return nums[low];

    }
}
