package com.company.LeetCode_DailyChallenge;

public class Search_Insert_Position {


    //35. Search Insert Position
    //https://leetcode.com/problems/search-insert-position/description/

    public int searchInsert(int[] nums, int target) {

        int low=0, high=nums.length-1,mid,ans=high+1;

        while( low<=high){
            mid= low + (high-low)/2;

            if( nums[mid]>=target){
                ans=mid;
                high= mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return ans;
    }


}
