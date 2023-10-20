package com.company.LeetCode_DailyChallenge;

public class Max_Dot_Product_of_Two_Subsequences {

    //1458. Max Dot Product of Two Subsequences
    //https://leetcode.com/problems/max-dot-product-of-two-subsequences/description/
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int n= nums1.length, m= nums2.length;

        int[][] dp= new int[n][m];

        for( int i=0; i<n; i++){

            for( int j=0; j<m; j++){

                dp[i][j]= nums1[i] * nums2[j];

                if( i-1>= 0 && j-1>=0)
                    dp[i][j]= Math.max(nums1[i]*nums2[j]+dp[i-1][j-1] ,dp[i][j]);

                if( i-1>= 0)
                    dp[i][j]= Math.max(dp[i-1][j] ,dp[i][j]);
                if( j-1>= 0)
                    dp[i][j]= Math.max(dp[i][j-1] ,dp[i][j]);
            }
        }
        return dp[n-1][m-1];
    }
}
