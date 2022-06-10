package com.company;

import java.util.PriorityQueue;

public class Help_a_Thief {

    //https://practice.geeksforgeeks.org/problems/help-a-thief5938/1#

    // A= plates  B= cost/plate
    static int maxCoins(int[] A, int[] B, int T, int n) {

        PriorityQueue<int[]> maxHeap= new PriorityQueue<>((a,b)->b[0]- a[0]);

        for( int i=0; i<n; i++){
            maxHeap.add(new int[]{B[i], A[i]});
        }

        int ans=0;

        int size= maxHeap.size();

        for (int i = 0; i <size ; i++) {
            int[] pop = maxHeap.poll();
            if (T > pop[1]) {
                ans += pop[0] * pop[1];
                T -= pop[1];
            } else {
                ans += pop[0] * T;
                break;
            }
        }


        return ans;
    }

}
