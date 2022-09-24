package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Maximum_Performance_of_a_Team {

    //https://leetcode.com/problems/maximum-performance-of-a-team/description/

    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {

        int[][] arr= new int[n][2];

        for( int i=0; i<n; i++){
            arr[i]= new int[]{efficiency[i],speed[i]};
        }

// sort in descending order of their efficiency
        Arrays.sort(arr,(a, b)->b[0]-a[0]);

        //min heap to store the element with min speed as soon as the size of the min heap> k we pop the smallest element ie, the element worker with the lowest speed

        PriorityQueue<Integer> q= new PriorityQueue<>((a, b)->a-b);

        long ans=0, speed_sum=0;;
        for( int[] i: arr){

            q.add(i[1]);
            speed_sum+=i[1];

            if( q.size()>k){
                int x= q.poll();
                speed_sum-=x;
            }
            ans= Math.max(ans, speed_sum*i[0]);
        }

        long mod= (long)1e9 + 7;

        return (int) (ans % mod);
    }
}
