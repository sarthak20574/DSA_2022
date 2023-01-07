package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Find_Eventual_Safe_States {

    //802. Find Eventual Safe States
    //https://leetcode.com/problems/find-eventual-safe-states/description/?envType=study-plan&id=graph-i

    public List<Integer> eventualSafeNodes(int[][] g) {

        List<Integer> ans= new ArrayList<>();

        int n= g.length;

        boolean term[]= new boolean[n];
        boolean safe[]= new boolean[n];
        boolean visited[]= new boolean[n];

        for( int i=0; i<n; i++){
            if( g[i].length==0) {
                term[i]=true;
                visited[i]=true;
            }
        }


        for( int i=0; i<n; i++){

            if(visited[i]==false){
                //visited[i]=true;
                fn(g, n, term, safe,visited, i);
            }
        }

        for( int i=0; i<n; i++){
            if( safe[i]==true || term[i]==true) ans.add(i);
        }

        return ans;

        // remove self paths

        // set of all the terminal nodes

        // visited

        // safe[] so if part a node is connected to a safe or terminal node then its also a safe
    }


    boolean fn( int[][] g, int n, boolean[] term, boolean[] safe, boolean[] visited, int i){
        if(term[i]==true || safe[i]==true){
            //safe[i]=true;
            return true;
        }

        // count the no of trues;

        int n_true=0;
        for( int k: g[i]){
            //self edges
            if( visited[k]==false){
                visited[k]=true;
                if(fn( g, n, term, safe,visited, k)==true){
                    n_true++;
                }
            }
            else {
                if(term[k]==true || safe[k]==true) n_true++;
            }
        }

        //System.out.println(n_true);

        if( n_true==g[i].length){
            safe[i]=true;
            return true;
        }
        else return false;
    }
}
