package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Distance_from_the_Source_Bellman_Ford_Algorithm_ {

    //Distance from the Source (Bellman-Ford Algorithm)
    //https://practice.geeksforgeeks.org/problems/distance-from-the-source-bellman-ford-algorithm/1
    //https://www.youtube.com/watch?v=FtN3BYH2Zes&ab_channel=AbdulBari

    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> adj, int S)
    {

        int[] ans= new int[V];

        // relax all the edges V-1 times
        Arrays.fill(ans, 100000000);
        ans[S]=0;

        for( int i=0; i<V-1; i++){

            for( ArrayList<Integer> t: adj){

                if(ans[t.get(1)]> ans[t.get(0)]+ t.get(2)){
                    ans[t.get(1)]= ans[t.get(0)]+ t.get(2);
                }
            }
        }
        return ans;
    }
}
