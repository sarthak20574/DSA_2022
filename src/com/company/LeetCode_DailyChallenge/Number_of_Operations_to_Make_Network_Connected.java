package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Number_of_Operations_to_Make_Network_Connected {


    //1319. Number of Operations to Make Network Connected
    //https://leetcode.com/problems/number-of-operations-to-make-network-connected/description/?envType=study-plan&id=graph-i

    public int makeConnected(int n, int[][] conn) {

        int no=0;
        if( n-1>conn.length) return -1;


        boolean[] visited= new boolean[n];

        List<List<Integer>> g= new ArrayList<>();

        for( int i=0; i<n; i++){
            g.add(new ArrayList<>());
        }

        for( int[] i: conn){
            g.get(i[0]).add(i[1]);
            g.get(i[1]).add(i[0]);
        }


        for( int i=0; i<n; i++){
            if( visited[i]==false){
                no++;
                fn(g,  visited, n, i);
            }
        }

        return no-1;

    }

    void fn( List<List<Integer>> g, boolean[] visited, int n, int i){

        visited[i]=true;


        for( int k: g.get(i)){
            if( visited[k]==false){
                fn( g, visited, n, k);
            }
        }
    }

}
