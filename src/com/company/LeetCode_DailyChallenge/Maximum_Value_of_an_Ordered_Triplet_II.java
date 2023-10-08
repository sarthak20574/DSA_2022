package com.company.LeetCode_DailyChallenge;

public class Maximum_Value_of_an_Ordered_Triplet_II {

    //2874. Maximum Value of an Ordered Triplet II
    //https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-ii/

    public long maximumTripletValue(int[] nums) {
        int n= nums.length;

        long[] prev= new long[n];
        long cur=0;
        for( int i=0; i<n; i++){
            cur= Math.max(nums[i], cur);
            prev[i]= cur;
        }

        long[] suf= new long[n];
        cur=0;
        for( int i=n-1; i>=0; i--){
            cur= Math.max(nums[i], cur);
            suf[i]= cur;
        }

        long ans=0;
        for( int i=0; i<n-2; i++){
            ans= Math.max(ans, (prev[i] -nums[i+1]) *suf[i+2] );
        }
        return ans;
    }
}
