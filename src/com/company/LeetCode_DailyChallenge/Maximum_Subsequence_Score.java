package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Maximum_Subsequence_Score {

    //2542. Maximum Subsequence Score
    //https://leetcode.com/problems/maximum-subsequence-score/description/
    // same as 1383. Maximum Performance of a Team

    public long maxScore(int[] nums1, int[] nums2, int k) {

        int n= nums1.length;
        int[][] arr=new int[n][2];

        for( int i=0; i<n; i++){
            arr[i]= new int[]{nums1[i], nums2[i]};
        }

        Arrays.sort(arr, (a, b)->(b[1]-a[1]));

        Queue<Integer> q= new PriorityQueue<>();

        long cur=0L, ans= Integer.MIN_VALUE;

        for( int i=0; i<n; i++){

            int minn= arr[i][1];
            q.add( arr[i][0]);
            cur+=arr[i][0];

            if( q.size()>k){
                int x= q.poll();
                cur-=x;
            }

            if( q.size()==k)
                ans= Math.max(cur * minn, ans);

        }

        return ans;
    }

}
