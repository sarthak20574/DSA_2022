package com.company.LeetCode_DailyChallenge;

import java.util.PriorityQueue;
import java.util.Queue;

public class Number_of_Flowers_in_Full_Bloom {

    //2251. Number of Flowers in Full Bloom
    // see neetcode io's vid
    //https://leetcode.com/problems/number-of-flowers-in-full-bloom/description/?envType=daily-question&envId=2023-10-11

    public int[] fullBloomFlowers(int[][] f, int[] p) {

        int n=  p.length;
        int[] ans= new int[n];

        Queue<int[]> q= new PriorityQueue<>((a, b)->a[0]==b[0]?a[1]-b[1] :a[0]-b[0]);

        /*
        0- start
        2- end
        1- people

        first need to add the new flower bloomed then have to handle the ppl that
        arrive that day and then have to delete the slower that die that day therefore
        keep it in this order
        */

        for( int[] i: f){
            q.add( new int[]{i[0], 0});
            q.add( new int[]{i[1], 2});
        }

        for( int i=0; i<n; i++){
            q.add( new int[]{p[i], 1, i});
        }


        int cur=0;

        while( q.isEmpty()==false){

            int[] x= q.poll();

            // System.out.println( Arrays.toString(x));

            if( x[1]==0){
                cur++;
            }
            else if( x[1]==2){
                cur--;
            }
            else{
                ans[x[2]]=cur;
            }
        }

        return ans;

    }

}
