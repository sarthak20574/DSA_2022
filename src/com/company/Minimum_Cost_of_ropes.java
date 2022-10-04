package com.company;

import java.util.PriorityQueue;

public class Minimum_Cost_of_ropes {

    //Minimum Cost of ropes
    //https://practice.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1

    long minCost(long arr[], int n) {
        PriorityQueue<Long> minHeap= new PriorityQueue<>();

        long ans=0;

        for( long i: arr){
            minHeap.add(i);
        }

        while( minHeap.size()>1){
            long x= minHeap.poll();
            long y= minHeap.poll();

            ans+=x+y;
            minHeap.add(x+y);
        }

        return ans;
    }
}
