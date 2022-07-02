package com.company.LeetCode_DailyChallenge;

public class Sort_Colors {
    //75. Sort Colors
    //https://leetcode.com/problems/sort-colors/
    //https://www.youtube.com/watch?v=oaVa-9wmpns&ab_channel=takeUforward

    public void sortColors(int[] nums) {

        int low=0, mid=0, high=nums.length-1;

        while( mid<=high){
            if( nums[mid]==0){
                // swap mid and l and increment l and mid
                int t= nums[mid];
                nums[mid]= nums[low];
                nums[low]= t;
                low++; mid++;
            }
            else if( nums[mid]==2){

                // swap mid and high and decrement high
                int t= nums[mid];
                nums[mid]= nums[high];
                nums[high]= t;
                high--;
            }
            else {
                // when mid's ele == 1 just increment mid
                mid++;
            }
        }


    }
}
