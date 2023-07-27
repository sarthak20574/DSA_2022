package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class K_Radius_Subarray_Averages {

    //2090. K Radius Subarray Averages
    //https://leetcode.com/problems/k-radius-subarray-averages/description/

    public int[] getAverages(int[] nums, int k) {

        int n= nums.length;
        int[] ans= new int[n];

        Arrays.fill(ans, -1);

        int p1=0, p2=2*k;

        long cur=0;
        for( int i=0; i<n && i<=2*k; i++) cur+=nums[i];


        for( int i=k;p2<n ; i++){
            ans[i]=(int)( cur/(2L*k+1L));
            cur-=nums[p1++];
            p2++;
            if( p2==n)break;
            cur+=nums[p2];
        }

        return ans;
    }

}
