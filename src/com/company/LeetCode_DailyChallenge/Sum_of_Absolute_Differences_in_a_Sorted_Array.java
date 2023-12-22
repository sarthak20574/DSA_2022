package com.company.LeetCode_DailyChallenge;

public class Sum_of_Absolute_Differences_in_a_Sorted_Array {

    //1685. Sum of Absolute Differences in a Sorted Array
    //https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/description/?envType=daily-question&envId=2023-11-25

    public int[] getSumAbsoluteDifferences(int[] nums) {

        int n= nums.length;
        int[] pre= new int[n];

        int[] ans= new int[n];


        for( int i=1;  i<n; i++){
            pre[i]= nums[i-1]+ pre[i-1];
        }

        int t= pre[n-1]+ nums[n-1];

        for( int i=0; i<n; i++){
            // i * nums[i]- pre[i]
            // total pre[i]- (n-i) * nums[i]
            ans[i]= i * nums[i]- pre[i]+
                    t-pre[i]- (n-i) * nums[i] ;
        }

        return ans;
    }
}
