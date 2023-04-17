package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.Arrays;

public class Longest_Cycle_in_a_Graph {

    //2360. Longest Cycle in a Graph
    //https://leetcode.com/problems/longest-cycle-in-a-graph/description/
    //see alisha parveen's video

    int ans=-1;
    boolean[] v_cur;
    public int longestCycle(int[] e) {

        ArrayList<ArrayList<Integer>> g= new ArrayList<>();

        int n= e.length;


        for( int i=0; i<n; i++){
            g.add(new ArrayList<>());
            if( e[i]!=-1){
                g.get(i).add(e[i]);
            }
        }

        ans=-1;

        int vis[]= new int[n];

        Arrays.fill( vis, -1);


        for( int i=0; i<n; i++){

            if( vis[i]==-1){
                v_cur= new boolean[n];
                // System.out.println("starting: "+ i);
                dfs(i, g, n, vis, 0);
            }
        }

        return ans;


    }
    void dfs( int cur, ArrayList<ArrayList<Integer>> g,
              int n, int[] vis, int res){

        if( vis[cur]!=-1){
            //System.out.println(cur+ " -> "+ res+" "+ vis[cur]);

            if( v_cur[cur]==true)
                ans= Math.max( ans, res -vis[cur]);

            return;
        }
        //System.out.println(cur+ " -> "+ res);

        v_cur[cur]=true;
        vis[cur]=res;

        for( int i: g.get( cur)){
            //if( v_cur[cur]==false)
            dfs(i, g, n, vis, res+1);
        }

        v_cur[cur]=false;
    }
}
