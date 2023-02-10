package com.company.LeetCode_DailyChallenge;

public class Maximize_Win_From_Two_Segments {

    //2555. Maximize Win From Two Segments
    //https://leetcode.com/problems/maximize-win-from-two-segments/description/


    public int maximizeWin(int[] arr, int k) {

        int n=arr.length;

        int[] dp= new int[n+1];

        int j=0, ans=0;


        for( int i=0; i<n; i++){

            while( arr[i]-arr[j]>k){
                j++;
            }

            dp[i+1]= Math.max( i-j+1, dp[i]);

            ans= Math.max( dp[j]+i-j+1, ans);

        }

        // System.out.println(Arrays.toString(dp));


        return ans;
    }
}
