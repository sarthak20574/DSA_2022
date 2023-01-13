package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Minimum_Time_to_Collect_All_Apples_in_a_Tree {

    //1443. Minimum Time to Collect All Apples in a Tree
    //https://www.youtube.com/watch?v=Xdt5Z583auM&ab_channel=NeetCodeIO

    int ans=0;
    public int minTime(int n, int[][] edges, List<Boolean> has) {

        List<List<Integer>> g= new ArrayList<>();
        ans=0;

        for( int i=0; i<n; i++){
            g.add(new ArrayList<>());
        }

        for( int[] x: edges){
            g.get(x[0]).add(x[1]);
            g.get(x[1]).add(x[0]);
        }

        boolean[] vis= new boolean[n];

        vis[0]=true;

        return fn( g, n, 0, has,vis);

        //return ans;

    }


    int fn( List<List<Integer>> g, int n, int i, List<Boolean> has, boolean[] vis){

        int time=0;

        for( int k: g.get(i)){
            if( vis[k]==false){
                vis[k]=true;

                int app=fn( g, n, k, has, vis);

                if( has.get(k)==true || app!=0 ){
                    //System.out.println(k+":"+ cur*2);
                    time+= 2+ app;
                }
            }
        }

        return time;
    }

}
