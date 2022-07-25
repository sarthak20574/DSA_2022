package com.company;

import java.util.ArrayList;

public class Number_of_Provinces {
    //Number of Provinces
    //https://practice.geeksforgeeks.org/problems/number-of-provinces/1
    //https://www.youtube.com/watch?v=E_2BK3K30lY&ab_channel=SagarMalhotra

    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {


        int ans=0;
        boolean[] visited= new boolean[V];

        for( int i=0; i<V;i++){

            if( visited[i]==false){
                ans++;
                dfs(visited, adj, V, i);
            }

        }

        return ans;
    }



    static void dfs( boolean[] visited, ArrayList<ArrayList<Integer>> adj,
                     int v, int cur ){


        visited[cur]=true;

        for( int i=0; i<v; i++){
            if( visited[i]==false && adj.get(cur).get(i)==1){
                dfs(visited, adj, v, i);
            }
        }
    }

}
