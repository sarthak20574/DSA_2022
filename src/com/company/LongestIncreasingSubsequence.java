package com.company;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

    //try to break the problem into smaller sub problems
    // for [-1, 3,4,5,2,2,2,2]
    //[-1]
    //[-1, 3]
    //[-1, 3,4]
    //[-1, 3,4,5]
    // start with initialisisng the answer array with all 1s as every element is in itself an increasing sequence of length 1
    // 2 pointers i and j at -1 0th adn 1st element if j's value >i's value then we exted the v
    // then as we incrememnt j now we say can 4 extend the longest subsequence at -1, yes then 2 in the arr_dp
    // and increment i as we now see if we lengthen the subsequence at 3, yes so we add 1 to dp[i] and update dp_array
    //
    //

    //[-1, 3,4,5,2,2,2,2]
    //[1, 2,3,4,2,3,4,5 ]
    // max(arr)

    static int longestSubsequence(int size, int arr[]){

        int[] dp = new int[size];
        // initialize the whole arr with 1 as each element is a sequence of the length 1
        // not just the first element as 1 else for {6 ,3 ,7 ,4 ,6 ,9}; we get dp=[1, 0, 2, 1, 2, 3]
        // but the correct should be [1, 1, 2, 2, 3, 4]

        for( int i=0 ; i<size; i++){
            dp[i]= 1;
        }

        for( int j=1 ; j<size; j++){

            for( int i= 0; i<j;i++){

                // not strictly increasing
                if( arr[i]< arr[j]){
                    // max only as can be 1,2, 1, {3} next step be 1,2,1, {1+1} if just dp[j]=dp[i]+1
                    dp[j]=Math.max(dp[i]+1, dp[j]);
                }

//                else {
//                    dp[j]=Math.max(dp[i], dp[j]);
//                }

            }

        }

        //System.out.println(Arrays.toString(dp));

        int ans= dp[0];
        for( int i=1; i<size; i++){

            ans= Math.max(ans, dp[i]);
        }
        return ans;

    }


    /*
    //in Rotting_Oranges
    int lengthOfLIS(vector<int>& nums) {
        int n=  nums.size();
        vector<int> dp(n, 1);
        int ans=0;

        for( int i=0; i< n ; i++){

            for( int j=0; j<i;j++){

                if(nums[i]>nums[j]){
                     dp[i]= max(dp[i], dp[j]+1);
                }
            }
            ans= max( ans, dp[i]);

            }

        return ans;
        }
     */

}
