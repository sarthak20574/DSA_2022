package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class M_Coloring_Problem {

    //M-Coloring Problem
    //https://practice.geeksforgeeks.org/problems/m-coloring-problem-1587115620/1
    //https://www.youtube.com/watch?v=052VkKhIaQ4&ab_channel=AbdulBari
    //https://www.youtube.com/watch?v=wuVwUK25Rfc&ab_channel=takeUforward

    public boolean graphColoring(boolean graph[][], int m, int n) {

        List<List<Integer>> g= new ArrayList<>();
        int[] color= new int[n];

        for( int i=0; i<n; i++){
            g.add(new ArrayList<>());
        }


        for( int i=0; i<n; i++){

            for( int j=0; j<n; j++){
                if( graph[i][j]==true){
                    g.get(i).add(j);
                    g.get(j).add(i);
                }
            }
        }

        if( fn(g,color,n, m,0 )==true) return true;
        else return false;

    }

    boolean fn(List<List<Integer>> g,int[] color,
               int n, int m, int cur_node){

        if( cur_node==n) return true;

        //0= no color
        for( int i=1; i<=m; i++){
            if ( is_safe(g, color,i, cur_node)== true){
                color[cur_node]=i;
                if(fn(g,color,n, m, cur_node+1)==true) return true;
                color[cur_node]=0;
            }
        }

        return false;

    }


    boolean is_safe(List<List<Integer>> g, int[] color,
                    int cur_color, int cur_node){

        for( int x: g.get(cur_node)){
            if(color[x]==cur_color) return false;
        }
        return true;
    }

}
