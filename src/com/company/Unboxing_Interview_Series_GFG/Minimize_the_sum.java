package com.company.Unboxing_Interview_Series_GFG;

import java.util.PriorityQueue;

public class Minimize_the_sum {

    // will have to sort at every step so to reduce that we will need to get a data structure to
    // do ge the smallest 2 element at evey time
    // eg- 1,2,3,4
    // min heap is the data structure that can remocve the least element and get the least element and then insert
    // the elemnt and make sure its in correct order

    long minimizeSum(int N, int arr[]) {

        PriorityQueue<Integer> minHeap= new PriorityQueue<>((a,b)-> a-b);
        for( int i=0; i<N ; i++){
            minHeap.add(arr[i]);
        }
        int ans=0, sum=0;
        while (minHeap.size()>1){
            int first= minHeap.poll();
            int second=minHeap.poll();
            //System.out.println(first);
            //System.out.println(second);

            sum= first + second;
            ans+=sum;
            //System.out.println(sum);
            minHeap.add(sum);

        }

        return ans;
    }
}
