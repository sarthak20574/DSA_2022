package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Maximum_Length_of_Repeated_Subarray {

    /*
    similar to LCS( longest common subsequence) except that here we need to considered continous (contigious) subarray, we see that if the ith and the jth element of nums1 and nums2 are equal we add 1 to the length of the our longest common subarray without the ith and the jth element( dp[i-1][j-1]) otherwise we reset the length of the our longest common subarray to 0 or dp[i][j]=0
     */

    public int findLength(int[] nums1, int[] nums2) {

        //Maximum Length of Repeated Subarray
        //https://leetcode.com/problems/maximum-length-of-repeated-subarray/description/
        //https://www.youtube.com/watch?v=Im4Hejcr-SE&ab_channel=AyushiSharma

        int n= nums1.length, m= nums2.length;

        int[][] dp= new int[n+1][m+1];
        int ans=0;

        for( int i=1; i<n+1; i++){

            for( int j=1; j<m+1;j++){

                if( nums1[i-1]==nums2[j-1]){
                    dp[i][j]= 1+ dp[i-1][j-1];
                    ans= Math.max( dp[i][j], ans);
                }
            }
        }

        return ans;
    }
}
