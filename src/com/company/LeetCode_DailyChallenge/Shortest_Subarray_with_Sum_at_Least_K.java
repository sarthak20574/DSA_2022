package com.company.LeetCode_DailyChallenge;

import java.util.ArrayDeque;
import java.util.Deque;

public class Shortest_Subarray_with_Sum_at_Least_K {

    //862. Shortest Subarray with Sum at Least K
    //https://leetcode.com/problems/shortest-subarray-with-sum-at-least-k/description/
    //see techDose's video

    public int shortestSubarray(int[] nums, int k) {

        int ans=Integer.MAX_VALUE, n= nums.length;

        Deque<long[]> deq= new ArrayDeque<>();

        long sum=0;
        int j=0;

        deq.addLast(new long[]{0,-1});

        for( int i=0; i<n; i++){

            sum+=nums[i];

            while ( deq.size()>0 && deq.peekLast()[0]>sum){
                deq.pollLast();
            }

            deq.addLast(new long[]{sum, i});


//            if( sum- deq.peekFirst()[0] >=k){
//                ans= (int) Math.min( i-deq.peekFirst()[1]+1, ans);
//            }


            while(deq.size()>0 && sum- deq.peekFirst()[0]>=k){
                ans= (int) Math.min( i-deq.peekFirst()[1], ans);
                deq.pollFirst();
            }
        }

        return ans==Integer.MAX_VALUE?-1:ans;
    }

}
