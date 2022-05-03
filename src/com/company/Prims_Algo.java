package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Prims_Algo {

    //start with node 0 the min. edge connected is connected( node 1), now again the min of all the edges
    // connected to the 2 connected nodes

    //https://www.youtube.com/watch?v=4ZlRH0eK-qQ
    // prims-> selectthe least cost edge
    // select the next minimum edge such that its connected to already connected

    class Corner implements Comparable<Corner>{
        int index;
        int weight;

        Corner( int index, int weight){
            this.index= index;
            this.weight= weight;
        }

        @Override
        public int compareTo(Corner o) {
            return this.weight- o.weight;
        }
    }

    class Solution{
        int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) {
            int ans=0;
            boolean[] visited =new boolean[V];

            Arrays.fill(visited, false);

            PriorityQueue<Corner> minHeap= new PriorityQueue<>();

            minHeap.add(new Corner(0,0));

            while (!minHeap.isEmpty()){

                Corner x= minHeap.poll();
                int i=x.index;

                ArrayList<ArrayList<Integer>> edges= adj.get(i);

                if( visited[i]==true){
                    continue;
                }
                visited[i]= true;
                ans+=x.weight;

                for (ArrayList<Integer> node: edges){
                    if( visited[node.get(0)] == false){
                        minHeap.add(new Corner(node.get(0), node. get(1)));
                    }
                }
            }
            return ans;
        }

    }

}
