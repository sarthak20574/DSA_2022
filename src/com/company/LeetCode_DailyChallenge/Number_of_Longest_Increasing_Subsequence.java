package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Number_of_Longest_Increasing_Subsequence {

    //673. Number of Longest Increasing Subsequence
    //https://leetcode.com/problems/number-of-longest-increasing-subsequence/description/
    public int findNumberOfLIS(int[] nums) {

        // 1 2 3 3 4
        // 1


        int n= nums.length;
        int[] dp = new int[n],  way= new int[n];
        way[0]=1;

        Arrays.fill(dp,1);
        Arrays.fill(way,1);
        //way.add(1,n);


        for( int i=0; i<n; i++){

            for( int j=0; j<i; j++){
                //int maxx=dp[i];

                if( nums[i]>nums[j] && dp[j]+1>dp[i]){
                    dp[i]=1+dp[j];
                    way[i]= way[j];
                }
                else if( nums[i]>nums[j] && dp[j]+1==dp[i]){
                    way[i]+= way[j];
                    //way.put(dp[i], way.getOrDefault());
                }
            }
        }

        int len=0, ans=0;

        for( int i=0; i<n; i++){
            if( len<dp[i]){
                len=dp[i];
            }
        }

        for( int i=0; i<n; i++){
            if( len==dp[i]){
                ans+=way[i];
            }
        }




        // System.out.println(Arrays.toString(dp));
        // System.out.println(Arrays.toString(way));

        return ans;

    }
}
