package com.company.LeetCode_DailyChallenge;

public class Minimum_Operations_to_Reduce_X_to_Zero {

    //1658. Minimum Operations to Reduce X to Zero
    //https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/

    //recursion
    public int minOperations(int[] nums, int x) {
        long c= fn(nums, 0, nums.length-1,x);
        return c>=Integer.MAX_VALUE?-1: (int) c;
    }

    long fn(int[] nums, int i, int j, int x){

        if( x==0){
            return 0;
        }
        if( x<0 || i>j){
            return Integer.MAX_VALUE;
        }
        else{
            return Math.min(1+fn(nums, i+1,j, x-nums[i]),1+fn(nums, i, j-1, x-nums[j]) );
        }
    }


    //
}
