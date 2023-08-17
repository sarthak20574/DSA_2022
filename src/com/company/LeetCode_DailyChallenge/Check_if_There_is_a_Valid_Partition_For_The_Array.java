package com.company.LeetCode_DailyChallenge;

public class Check_if_There_is_a_Valid_Partition_For_The_Array {

    //2369. Check if There is a Valid Partition For The Array
    //https://leetcode.com/problems/check-if-there-is-a-valid-partition-for-the-array/description/
    public boolean validPartition(int[] nums) {

        int n= nums.length;
        boolean[] dp= new boolean[n+1];
        dp[0]=true;

        for( int i=2; i<n+1; i++){


            if(  dp[i-2] && nums[i-1]==nums[i-2]) dp[i]=true;

            if( i-3>=0 && dp[i-3] && nums[i-2]==nums[i-1] && nums[i-3]==nums[i-2]) dp[i]=true;


            if( i-3>=0 && dp[i-3] && nums[i-2]+1==nums[i-1] && nums[i-3]+1==nums[i-2]) dp[i]=true;
        }

        return dp[n];
    }
}
