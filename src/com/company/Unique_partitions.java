package com.company;

import java.util.ArrayList;

public class Unique_partitions {

    //Unique partitions
    //https://practice.geeksforgeeks.org/problems/unique-partitions1041/1

    public ArrayList<ArrayList<Integer>> UniquePartitions(int n){

        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();

        int[] arr= new int[n];

        for( int i=0; i<n; i++){
            arr[i]= i+1;
        }


        dfs(ans, n, arr, n-1, n, new ArrayList<>());

        return ans;

    }

    void dfs(ArrayList<ArrayList<Integer>> ans, int n, int[] arr,
             int index, int sum, ArrayList<Integer> cur){

        if( index==-1 || sum<0) return;
        if( sum==0) {
            ans. add( new ArrayList<>(cur));

            return;
        }


        cur.add(arr[index]);
        dfs(ans, n, arr, index, sum-arr[index], cur);
        //dfs(ans, n, arr, index-1, sum-arr[index], cur);

        cur.remove( cur.size()-1);
        dfs(ans, n, arr, index-1, sum, cur);

    }
}
