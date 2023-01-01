package com.company.LeetCode_DailyChallenge;

import java.util.PriorityQueue;
import java.util.Queue;

public class Remove_Stones_to_Minimize_the_Total {


    //1962. Remove Stones to Minimize the Total
    //https://leetcode.com/problems/remove-stones-to-minimize-the-total/description/

    public int minStoneSum(int[] piles, int k) {

        // 3 4 5
        //4 3 3 2

        Queue<Integer> q= new PriorityQueue<>((a, b)-> b-a);

        for( int i: piles){
            q.add( i);
        }

        for( int i=0; i<k; i++){
            int x= q.poll();
            int s= x/2;

            q.add( x-s);
        }

        int ans=0;
        while( q.isEmpty()==false){
            ans+=q.poll();
        }

        return ans;
    }
}
