package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class All_Paths_From_Source_to_Target {

    //797. All Paths From Source to Targe
    //https://leetcode.com/problems/all-paths-from-source-to-target/

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans= new ArrayList<>();

        List<Integer> cur= new ArrayList<>();
        cur.add(0);

        int n= graph.length;
        //System.out.println(n);

        fn(ans, cur, n, 0, graph);

        return ans;
    }

    void fn( List<List<Integer>> ans, List<Integer> cur, int n, int i,int[][] graph){
        if( i==n-1) {
            //cur.add(i);
            ans.add(cur);
            return;
        }

        for( int k:graph[i]){

            cur.add(k);
            fn( ans, new ArrayList<>(cur), n, k, graph);
            cur.remove(cur.size()-1);
        }

    }

}
