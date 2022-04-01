package com.company.LeetCode_DailyChallenge;

public class Search_in_Rotated_Sorted_Array_II {

    //Search in Rotated Sorted Array II
//https://www.youtube.com/watch?v=qA6Spjv1yz4&ab_channel=Let%27sPracticeTogether
    public boolean searchII(int[] nums, int target) {

        int n = nums.length;
        int low = 0, high = n - 1, mid;

        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid] == target) return true;

            // if target -9 and nums={1,1,1,1,10,1,1,1,1,1]
            if (nums[mid] == nums[low] && nums[mid] == nums[high]) {
                low++;
                high--;
            }
            //not directly returning false because 10 could be the target
            // and also change the if in the to else if


            //lft half sorted
            else if (nums[low] <= nums[mid]) {
                //target present in the left half
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                } else
                    low = mid + 1;
            } else if (nums[mid] <= nums[high]) {
                if (nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;
                } else high = mid - 1;
            }
        }
        return false;
    }

}