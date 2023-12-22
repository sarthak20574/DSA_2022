package com.company.LeetCode_DailyChallenge;

import java.util.PriorityQueue;
import java.util.Queue;

public class Constrained_Subsequence_Sum {

    //1425. Constrained Subsequence Sum
    //https://leetcode.com/problems/constrained-subsequence-sum/
    // https://www.youtube.com/watch?v=-IYZv-nOSys

    public int constrainedSubsetSum(int[] nums, int k) {

        int n= nums.length;

        Queue<int[]> q= new PriorityQueue<>((a, b)->b[0]-a[0]);

        int ans=Integer.MIN_VALUE;

        for( int i=0; i<n; i++){
            int cur=nums[i];

            while( q.isEmpty()==false && (i-q.peek()[1])>k)
                q.poll();

            if( q.isEmpty()==false && q.peek()[0]>=0){
                cur+=q.peek()[0];
                // peek bcoz what if cur/nums[i] is -ve
            }
            q.add(new int[]{cur, i});

            ans= Math.max( ans, cur);
        }

        return ans;
    }

}
