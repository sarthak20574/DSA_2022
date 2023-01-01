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

    public int[] answerQueries1(int[] nums, int[] queries) {

        Arrays.sort( nums);
        int n= nums.length;

        for( int i=1; i<n; i++){
            nums[i]= nums[i-1]+ nums[i];
        }

        int q= queries.length;

        int[] ans= new int[q];
        for( int i=0; i<q; i++){

            ans[i]= fn( nums, queries[i]);
        }

        return ans;
    }

    int fn( int[] nums, int sum){

        int mid, low=0, high=nums.length-1, ans=-1;

        while( low<= high){
            mid= ( low+high)/2;

            if( nums[mid]<= sum){
                ans= mid;
                low= mid+1;
            }
            else{
                high= mid-1;
            }

        }
        return ans+1;

    }
}
