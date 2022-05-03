package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class dijkstra {

    //https://practice.geeksforgeeks.org/problems/implementing-dijkstra-set-1-adjacency-matrix/1
    //

    static class pair implements Comparable<pair>{
        int vertex;
        int weight;

        public pair( int v, int w){
            this.vertex=v;
            this.weight= w;
        }

        @Override
        public int compareTo(pair o) {
            return this.weight- o.weight;
        }
    }

    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S) {

        int[] ans= new int[V];
        Arrays.fill(ans, Integer.MAX_VALUE);

        ans[S]= 0;
        PriorityQueue<pair> minHeap= new PriorityQueue<>();

        minHeap.add(new pair(S,0));

        while (minHeap.size()>0){

            pair x= minHeap.poll();

            for(ArrayList<Integer> y: adj.get(x.vertex)){

                if(ans[y.get(0)]> ans[x.vertex]+ y.get(1)){
                    ans[y.get(0)]=ans[x.vertex]+ y.get(1);
                    //why adding it back again? new updated values added
                    minHeap.add(new pair(y.get(0),ans[y.get(0)]));
                }


            }
        }
        return ans;
    }


    /*
    static class pair implements Comparable<pair>{
   int ver;
   int wt;
   public pair(int n,int d)
   {
       this.wt=d;
       this.ver=n;
   }
   public int compareTo(pair p)
   {
       return this.wt - p.wt;
   }
}

   //Function to find the shortest distance of all the vertices
   //from the source vertex S.
   static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
   {
       // Write your code here
       //create ans array and initised them as a infinity
       int[] ans=new int[V];
       Arrays.fill(ans,Integer.MAX_VALUE);

       //source shortest length always zero
       ans[S]=0;

       PriorityQueue<pair> pq = new PriorityQueue<>();

       //add first element with 0 as distance
       pq.add(new pair(S,0));

       while(pq.size()>0)
       {

           pair p = pq.poll();

         //get the adjucent of all the pop vertex
           for(ArrayList<Integer> x:adj.get(p.ver))
           {
               //if newly found path is smaller thean the previous path,

               if( ans[p.ver] + x.get(1) < ans[x.get(0)] )
               {
                   //then update the sortest path
                   ans[x.get(0)] = ans[p.ver]+x.get(1);

                   //add that element in priority queue for next element to move shotest weightt
                   //coz its greedy approtch

                   pq.add(new pair(x.get(0),ans[x.get(0)]));

               }
           }
       }
       //returning the final answer
       return ans;
   }
     */


}
