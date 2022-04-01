package com.company;

import java.util.ArrayList;

public class DFS_of_Graph {

//DFS of Graph
//https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1/

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> ans= new ArrayList<>();
        boolean[] visited= new boolean[V];

        fn(0,ans, V, adj, visited);
        return ans;
    }

    private void fn(int i,ArrayList<Integer> ans, int v, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        visited[i]=true;
        ans.add(i);

        for( int node: adj.get(i)){
            if( !visited[i]) fn(node,ans, v,adj,visited);
        }
    }
}
