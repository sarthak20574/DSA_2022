package com.company.LeetCode_DailyChallenge;

public class Remove_Duplicates_from_Sorted_Array {

    //26. Remove Duplicates from Sorted Array
    //https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
    public int removeDuplicates(int[] nums) {

        int i=0, j=0, cur=0, n= nums.length;

        while(i<n && j<n ){

            while( j<n && nums[i]==nums[j]) j++;
            // System.out.println( nums[i] +" "+ nums[j]);

            nums[cur++]=nums[i];
            i=j;

        }

        return cur;


    }

}
