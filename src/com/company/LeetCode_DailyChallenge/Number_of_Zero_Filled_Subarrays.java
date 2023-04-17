package com.company.LeetCode_DailyChallenge;

public class Number_of_Zero_Filled_Subarrays {

    //2348. Number of Zero-Filled Subarrays
    //https://leetcode.com/problems/number-of-zero-filled-subarrays/description/

    public long zeroFilledSubarray(int[] nums) {

        /* 0
             0
               0
            0 0
              0 0
            0 0 0
        */

        long cur=0, ans=0;

        for( int i: nums){

            if( i!=0) cur=0;
            else cur++;

            ans+= cur;
        }
        return ans;

    }
}
