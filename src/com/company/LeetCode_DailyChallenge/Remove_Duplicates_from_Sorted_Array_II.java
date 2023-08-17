package com.company.LeetCode_DailyChallenge;

public class Remove_Duplicates_from_Sorted_Array_II {

    //80. Remove Duplicates from Sorted Array II
    //https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

    public int removeDuplicates(int[] nums) {

        int count=1, cur=1, n= nums.length;

        for( int i=1; i<n; i++){

            if( nums[i]==nums[i-1]){
                count++;
            }
            else{
                count=1;
            }

            if( count<=2){
                nums[cur++]=nums[i];
            }
        }
        return cur;
    }
}
