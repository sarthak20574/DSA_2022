package com.company.LeetCode_DailyChallenge;

import java.util.*;

public class Find_Building_Where_Alice_and_Bob_Can_Meet {

    //2940. Find Building Where Alice and Bob Can Meet
    //https://leetcode.com/problems/find-building-where-alice-and-bob-can-meet/
    //https://www.youtube.com/watch?v=V3p46NDkFGg&t=4405s&ab_channel=AryanMittal

    public int[] leftmostBuildingQueries(int[] h, int[][] q) {

        int n= h.length;

        List<List<Integer>> li= new ArrayList<>();

        for( int i=0; i<n; i++){

            li.add( new ArrayList<>());
        }

        // for( int i=0; i<n; i++){
        //     pq[i]= new PriorityQueue<>(
        //         (a,b)->
        //         Math.max(h[q[a][1]],h[q[a][0]])-
        //         Math.max(h[q[b][1]],h[q[b][0]]));
        // }

        Queue<Integer> pq= new PriorityQueue<>(
                (a,b)->
                        Math.max(h[q[a][1]],h[q[a][0]])-
                                Math.max(h[q[b][1]],h[q[b][0]]));

        int len= q.length;

        for( int i=0; i<len; i++){
            li.get(Math.max(q[i][0],q[i][1]) ).add(i);
        }

        int[] ans= new int[len];
        Arrays.fill( ans, -1);

        for( int i=0; i<n; i++){
            for( int k: li.get(i)){
                pq.add(k);
            }

            while( pq.isEmpty()==false &&
                    Math.max(h[q[pq.peek()][1]],h[q[pq.peek()][0]])<= h[i]){
                ans[pq.peek()]=i;
                pq.poll();
            }
        }


        return ans;
    }

}
