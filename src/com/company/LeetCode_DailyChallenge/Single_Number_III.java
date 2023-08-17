package com.company.LeetCode_DailyChallenge;

public class Single_Number_III {

    //260. Single Number III
    //https://leetcode.com/problems/single-number-iii/description/
    //https://leetcode.com/problems/single-number-iii/solutions/68900/accepted-c-java-o-n-time-o-1-space-easy-solution-with-detail-explanations/

    public int[] singleNumber(int[] nums) {

        int xor=0;

        for( int i: nums){
            xor^=i;
        }

        int mask=xor;
        mask &= -mask;

        // mask= mask & ( mask-1)
        int[] ans= new int[2];

        for( int i: nums){
            if( (mask & i)==mask) ans[0]^=i;  //  if( (mask & i)==1) ans[0]^=i; will give wrong answer as its not a bit data type its
            else ans[1]^=i;
        }

        return ans;
    }


}
