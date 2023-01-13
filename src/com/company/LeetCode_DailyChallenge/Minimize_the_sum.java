package com.company.LeetCode_DailyChallenge;

import java.util.PriorityQueue;
import java.util.Queue;

public class Minimize_the_sum {

    //Minimize the sum
    //https://practice.geeksforgeeks.org/problems/86e609332c9ef4f6b8aa79db11a6c0808c4a1bca/1
    long minimizeSum(int n, int arr[]) {

        long ans=0;

        Queue<Long> q= new PriorityQueue<>();

        for( int i: arr){
            q.add((long)i);
        }

        while( q.size()>1){

            long x= q.poll();
            long y= q.poll();

            long z= x+ y;
            ans+=z;
            q.add(z);

        }
        return ans;
    }

}
