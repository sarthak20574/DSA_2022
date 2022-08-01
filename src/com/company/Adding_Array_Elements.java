package com.company;

import java.util.PriorityQueue;

public class Adding_Array_Elements {

    //Adding Array Elements
    //https://practice.geeksforgeeks.org/problems/adding-array-element4756/1

    int minOperations(int[] arr, int n, int k) {

        PriorityQueue<Integer> x= new PriorityQueue<>();

        for( int i=0; i<n ; i++){
            x.add(arr[i]);
        }

        int ans=0;
        while( x.peek()<k){
            int i= x.poll();
            int j= x.poll();
            ans++;
            x.add(i+j);
        }

        return ans;
    }
}
