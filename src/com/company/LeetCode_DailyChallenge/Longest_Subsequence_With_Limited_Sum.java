package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Longest_Subsequence_With_Limited_Sum {
    //2389. Longest Subsequence With Limited Sum
    //https://leetcode.com/problems/longest-subsequence-with-limited-sum/
    //https://www.youtube.com/watch?v=KYBB-yFPgF8&ab_channel=CodewithAlisha

    public int[] answerQueries(int[] nums, int[] queries) {

        int nn= queries.length, n= nums.length;

        int[] ans= new int[nn];


        // sort the array so now the smallest elements of the array are at the start
        Arrays.sort(nums);

        //prefix sum the array
        for( int i=1; i<n; i++){
            nums[i]+= nums[i-1];
        }


        // now find the upper bound of the sum from queries array
        for( int i=0; i<nn; i++){
            int x= Arrays.binarySearch(nums, queries[i]);

            if( x>=0)ans[i]= x+1;
            else ans[i]=-x -1;
        }
        return ans;


    }
}
