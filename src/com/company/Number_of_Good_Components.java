package com.company;

import java.util.ArrayList;

public class Number_of_Good_Components {

    //Number_of_Good_Components
    //https://practice.geeksforgeeks.org/problems/1a4b617b70f0142a5c2b454e6fbe1b9a69ce7861/1
    //https://www.youtube.com/watch?v=mfW34-UjH0A&ab_channel=CodeSpeak

    int vert=0, edge=0;

    public int findNumberOfGoodComponent(int v,  ArrayList<ArrayList<Integer>> adj) {

        // List<List<Integer>> g= new ArrayList<>();

        // for( int i=0; i<v+1;i++){
        //     g.add( new ArrayList<>());
        // }

        // for( ArrayList<Integer> i: adj){
        //     g.get(i.get(0)).add(i.get(1));
        //     g.get(i.get(1)).add(i.get(0));
        // }

        ArrayList<ArrayList<Integer>> g=adj;

        boolean[] vis= new boolean[v+1];

        int ans=0;

        for( int i=1; i<v+1; i++){
            vert=0; edge=0;

            if( vis[i]==false){

                vis[i]=true;

                dfs(i, g,vis);

                // every vertex will have ver-1 connections ans there are ver vertices
                if( edge== vert * (vert-1))ans++;
            }
        }

        return ans;
    }

    void dfs(int cur,  ArrayList<ArrayList<Integer>> g,boolean[] vis ){

        vert++;
        edge+= g.get(cur).size();

        for( int i: g.get(cur)){

            if( vis[i]==false){

                vis[i]=true;
                dfs(i, g,vis);
            }
        }

    }
}
