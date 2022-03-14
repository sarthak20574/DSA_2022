package com.company;

public class BiconnectedGraph {

    // from abdul bari's lecture https://www.youtube.com/watch?v=jFZsDDB0-vo

    // if theere is a vertex whose removal will disconnect the graph then its called point of articulation
    // solution just join the componenets( make an edge between the parts that the articulation is connecting
    // still have to watch the lecture after 2:20


    //Biconnected Graph if (i)connected (ii) No articulation point
    // connected if there is a path from every vertex to every other vertex


    static int biGraph(int[] arr, int n, int e) {
        int dp[]= new int[n];

        if( n==2 && e==1) return 1;


        for( int i=0; i< 2*e; i+=2){
            dp[arr[i]]++;
            dp[arr[i+1]]++;
        }


        for( int i=0; i< n ; i++){
            if( dp[i]<2) return 0;
        }

        return 1;

    }

}
