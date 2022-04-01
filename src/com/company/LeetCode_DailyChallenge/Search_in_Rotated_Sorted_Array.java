package com.company.LeetCode_DailyChallenge;

public class Search_in_Rotated_Sorted_Array {

    // in leetcode
    //  https://www.youtube.com/watch?v=r3pMQ8-Ad5s&ab_channel=takeUforward

    //either right or left half is sorted using binary search you can
    // if the beg < mid means that  the right half is sorted

    // 4 5 6 7 0 1 2
    // target=0
    // mid = 7
    // if 4<=target<=7 then we can say that target will lie in the left half so
    // now low = mid+1 and again the
    // so low=0 and end=2 and mid=1
    // again check if the left half is sorted or not
    // again check if the low <= mid if yes then the left half is sorted
    // so 0<=0<=1 isa truwe so target lies in the left half and we don't needs the right half
    // so check if the left/ryt array si sorted if yes then check if the target lies in it

    public int search(int[] nums, int target) {

        int n = nums.length;
        int low = 0, high = n - 1, mid;

        while (low <= high) {
            mid = (low + high) / 2;  // if the low and hoigh both are super high there
            // can be cases where you will get an overflow
            // low+ (high- low)/2;
            if (nums[mid] == target) return mid;

            //lft half sorted
            if (nums[low] <= nums[mid]) {
                //target present in the left half
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                } else
                    low = mid + 1;
            }

            if (nums[mid] <= nums[high]) {
                if (nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;
                } else high = mid - 1;
            }
        }
        return -1;
    }

}
