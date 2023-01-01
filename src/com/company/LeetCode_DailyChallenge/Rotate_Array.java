package com.company.LeetCode_DailyChallenge;

public class Rotate_Array {

    //189. Rotate Array
    //https://leetcode.com/problems/rotate-array/description/
    //https://www.youtube.com/watch?v=BHr381Guz3Y&ab_channel=NeetCode

    void rev( int[] nums, int str, int end){

        int i=str,j=end;

        while( i<j){

            int t= nums[i];
            nums[i]= nums[j];
            nums[j]= t;

            i++;
            j--;
        }


    }
    public void rotate(int[] nums, int k) {
        //store all after k+1
        //swap the k+_1 and the ith

        int n= nums.length;
        if( k%n==0) return;

        rev( nums, 0, n-1);
        rev(nums,0, (k-1)%n);
        rev(nums, (k)%n, n-1);
    }
}
