package com.company.LeetCode_DailyChallenge;

import java.util.PriorityQueue;
import java.util.Queue;

public class Mice_and_Cheese {

    // Mice and Cheese
    //https://leetcode.com/problems/mice-and-cheese/description/

    public int miceAndCheese(int[] r1, int[] r2, int k) {

        int cur=0, ans=0, n= r1.length;
        Queue<Integer> q= new PriorityQueue<>((a, b)->b-a);

        for( int i=0; i<n; i++){
            q.add( r1[i]-r2[i]);
            ans+=r2[i];
        }

        while( k>0){
            ans+=q.poll();
            k--;
        }

        return ans;
    }
}
