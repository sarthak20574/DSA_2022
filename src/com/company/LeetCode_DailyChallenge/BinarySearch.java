package com.company.LeetCode_DailyChallenge;
public class BinarySearch {
    //https://leetcode.com/problems/binary-search/
    public int search(int[] nums, int target) {
        int n= nums.length;
        int beg=0, end=n-1, mid;

        while (beg<=end){
            mid= (beg+end)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else {
                beg=mid+1;
            }
        }
        return -1;
    }
}
