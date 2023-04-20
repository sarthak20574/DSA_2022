package com.company.LeetCode_DailyChallenge;

import java.util.*;

public class Shortest_Cycle_in_a_Graph {


    //2608. Shortest Cycle in a Graph
    //https://leetcode.com/problems/shortest-cycle-in-a-graph/description/
    // see lee's post https://leetcode.com/problems/shortest-cycle-in-a-graph/solutions/3366500/java-c-python-bfs/

    public int findShortestCycle(int n, int[][] edges) {

        List<List<Integer>> g= new ArrayList<>();

        for( int i=0; i<n; i++){
            g.add(new ArrayList<>());
        }

        for( int[] i: edges){
            g.get(i[0]).add(i[1]);
            g.get(i[1]).add(i[0]);
        }

        int[] dist=new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE );

        int ret=  Integer.MAX_VALUE;


        Queue<Integer> q= new LinkedList<>();

        for( int i=0; i<n; i++){

            Arrays.fill(dist, Integer.MAX_VALUE );

            q.add(i);
            dist[i]=0;

            // System.out.println("i= "+i+" nodes="+cur_nodes+" ans="+cur_ans);

            while(q.isEmpty()==false){

                int len= q.size();

                for( int k=0; k<len; k++){

                    int kk= q.poll();
                    // System.out.println(" beforer the for len loop, k= "+i+" nodes="+cur_nodes+" ans="+cur_ans );

                    for( int ii: g.get(kk)){

                        if( dist[ii]==Integer.MAX_VALUE){

                            dist[ii]= dist[kk]+1;
                            q.add(ii);
                        }
                        else {
                            if( dist[ii]>=dist[kk]){
                                ret= Math.min(ret, dist[ii]+ dist[kk]+1);
                            }
                        }

                    }

                }
            }



        }

        return ret== Integer.MAX_VALUE?-1:ret;

    }
}
