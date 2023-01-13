package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;

public class Number_of_Nodes_in_the_Sub_Tree_With_the_Same_Label {

// that frustrating testcase
//1519. Number of Nodes in the Sub-Tree With the Same Label
//https://leetcode.com/problems/number-of-nodes-in-the-sub-tree-with-the-same-label/description/

    int[] ans;

    public int[] countSubTrees(int n, int[][] edges, String labels) {

        ArrayList<ArrayList<Integer>> g= new ArrayList<>();

        for( int i=0; i<n; i++){
            g.add( new ArrayList<>());
        }



        for( int[] x: edges){
            g.get(x[0]).add(x[1]);
            g.get(x[1]).add(x[0]);
        }

        ans= new int[n];


        fn( 0, n, g, labels);


        return ans;

    }


    int[] fn( int i, int n, ArrayList<ArrayList<Integer>> g, String labels){

        int[] cur= new int[26];
        ans[i]=1;

        for( int k: g.get(i)){

            if( ans[k]==0){
                int[] recv= fn( k, n, g, labels);

                for( int l=0; l<26; l++){
                    cur[l]+=recv[l];
                }
            }

        }
        cur[labels.charAt(i)-'a']++;
        ans[i]=cur[labels.charAt(i)-'a'];

        return cur;

    }

}
