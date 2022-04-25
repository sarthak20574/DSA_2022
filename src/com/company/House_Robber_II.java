package com.company;

public class House_Robber_II {
    /*

//213. House Robber II
//https://leetcode.com/problems/house-robber-ii/
int rob(vector<int>& nums) {

        int n= nums.size();
        vector<int> dp(n);

        // case 1= 0th included and n-1 not included

            if( n==1) return nums[0];

        if( n>=1) dp[0]=nums[0];

        if( n>=2) dp[1]=max(nums[1], nums[0]);

        for( int i=2; i<n-1; i++){
            dp[i]= max( nums[i]+dp[i-2], dp[i-1]);
        }
        int ans1=dp[n-2];

        //case 2 0th not included so nth included

         if( n>=1) dp[0]=0;

        if( n>=2) dp[1]=nums[1];

        for( int i=2; i< n; i++){
            dp[i]= max( dp[i-2]+nums[i], dp[i-1]);
        }

        return max( ans1, dp[n-1]);
    }
     */
}
