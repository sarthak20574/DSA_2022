package com.company;

import java.util.ArrayList;

public class Select_Nodes {

    //Select Nodes
    //https://practice.geeksforgeeks.org/problems/f7bfa137576243795abb0595962d61b632bbad21/1
    //https://www.youtube.com/watch?v=Re_yBq5ZTAA&ab_channel=CodeSpeak

    int ans=0;

    public int countVertex(int n, int[][] edges){

        ans=0;

        ArrayList<ArrayList<Integer>> g= new ArrayList<>();

        for( int i=0; i<n+1; i++){
            g.add( new ArrayList<>());
        }

        for( int[] x: edges){
            g.get(x[0]).add(x[1]);
            g.get(x[1]).add(x[0]);
        }

        boolean[] visited=  new boolean[n+1];

        fn(1, g, visited);

        return ans;
    }

    boolean fn(int i, ArrayList<ArrayList<Integer>> g, boolean[] visited){

        visited[i]= true;
        boolean light_needed=false;

        for( int k: g.get(i)){

            if( visited[k]==false){

                boolean lighted=fn(k,g,visited);
                if( lighted==false){

                    light_needed=true;
                }
                // System.out.println(i+" : "+k);
            }

        }
        if( light_needed==true) ans++;

        return light_needed;

    }
}
