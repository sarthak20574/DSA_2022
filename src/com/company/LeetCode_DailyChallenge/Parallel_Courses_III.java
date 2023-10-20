package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Parallel_Courses_III {

    //2050. Parallel Courses III
    //https://leetcode.com/problems/parallel-courses-iii/?envType=daily-question&envId=2023-10-18
    //https://www.youtube.com/watch?v=a_NlRPnqCrg
    //https://leetcode.com/problems/parallel-courses-iii/solutions/1537479/c-python-topology-sort-o-m-n-clean-concise/?envType=daily-question&envId=2023-10-18


    public int minimumTime(int n, int[][] r, int[] t) {

        int[] ins= new int[n+1];

        List<List<Integer>> g= new ArrayList<>();

        Queue<int[]> pq=  new PriorityQueue<>((a, b)->a[0]-b[0]);

        for( int i=0; i<n+1; i++){
            g.add( new ArrayList<>());
        }

        for(int[]i: r){
            g.get(i[0]).add(i[1]);
            ins[i[1]]++;
        }

        int ans=0;

        for( int i=1; i<n+1; i++){
            if( ins[i]==0){
                pq.add(new int[]{t[i-1], i});
                ans= Math.max( ans,t[i-1] );
            }
        }


        while( pq.isEmpty()==false){

            int[] cur= pq.poll();

            for( int i: g.get(cur[1])){
                ins[i]--;
                if( ins[i]==0){
                    pq.add(new int[]{cur[0]+t[i-1], i});
                    ans= Math.max( ans,cur[0]+t[i-1] );
                }
            }
        }

        return ans;
    }
}
