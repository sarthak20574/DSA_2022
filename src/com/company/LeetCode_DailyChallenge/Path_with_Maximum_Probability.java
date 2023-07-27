package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Path_with_Maximum_Probability {


    //1514. Path with Maximum Probability
    //https://leetcode.com/problems/path-with-maximum-probability/description/


    public double maxProbability(int n, int[][] e, double[] p, int st, int end) {

        List<List<double[]>>g= new ArrayList<>();

        for( int i=0; i<n; i++){
            g.add( new ArrayList<>());
        }

        for( int i=0;i<e.length; i++){
            g.get( e[i][0]).add(new double[]{e[i][1],p[i]});
            g.get( e[i][1]).add(new double[]{e[i][0],p[i]});
        }

        boolean[] vis= new boolean[n];

        double[] ans= new double[n];
        Queue<Integer> q =
                new PriorityQueue<>((a, b) -> Double.compare(ans[b], ans[a]));
        q.add( st);

        ans[st]=1.0;


        while(q.isEmpty()==false){


            int l= q.poll();


            for( double[] k:g.get(l)){

                if( ans[(int)k[0]]<ans[l]*k[1]){
                    ans[(int)k[0]]=ans[l]*k[1];

                    q.add((int)k[0]);
                }
            }
        }

        return ans[end];

    }
}
