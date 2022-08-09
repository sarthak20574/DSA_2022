package com.company.LeetCode_DailyChallenge;

import java.util.*;

public class Reachable_Nodes_With_Restrictions {

    //2368. Reachable Nodes With Restrictions
    //https://leetcode.com/problems/reachable-nodes-with-restrictions/

    public int reachableNodes(int n, int[][] edges, int[] restricted) {

        // insert the restricted nodes in a set for fast checking if a node is restricted or not
        Set<Integer> rest= new HashSet<>();

        for( int i=0; i<restricted.length; i++){
            rest.add(restricted[i]);
        }


        // creating a graph
        List<Integer>[] graph=new ArrayList[n];

        // initilise the array list of each element
        for( int i=0; i<n;i++) graph[i]= new ArrayList<>();

        for( int[] x: edges){
            graph[x[0]].add(x[1]);
            graph[x[1]].add(x[0]);
        }



        int ans=0;

        // dfs
        Queue<Integer> q= new LinkedList<>();
        q.add(0);

        while( q.isEmpty()==false){

            int i= q.poll();

            // add our newly visited element to our restricted element
            rest.add(i);
            ans++;

            for( int x: graph[i]){

                //if the node/element is not restricted/visited
                if( rest.contains(x)==false){
                    q.add(x);
                }
            }

        }

        return ans;
    }

}
