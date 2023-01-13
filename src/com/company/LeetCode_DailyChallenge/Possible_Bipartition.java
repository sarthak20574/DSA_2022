package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Possible_Bipartition {

    //886. Possible Bipartition
    //https://leetcode.com/problems/possible-bipartition/description/
    // see techdose's vid

    public boolean possibleBipartition(int n, int[][] dis) {


        List<List<Integer>> g=new ArrayList<>();

        for( int i=0; i<n+1; i++){
            g.add(new ArrayList<>());
        }

        for( int[] i:dis){
            g.get(i[0]).add(i[1]);
            g.get(i[1]).add(i[0]);
        }

        int[] col= new int[n+1];

        for( int i=1; i<n+1; i++){
            if( col[i]==0){
                col[i]=1;

                //System.out.println(i+" "+Arrays.toString(col));
                if(fn(i, g, col,1)==false) return false;
            }

        }

        return true;
    }


    boolean fn( int i,List<List<Integer>> g, int[] col, int cur_col){

        // col[i]=cur_col;

        for( int k: g.get(i)){

            if( cur_col==col[k]) return false;

            if( col[k]==0){
                col[k]=cur_col*-1;
                if(fn(k, g, col,cur_col*-1)==false) return false;
            }

        }

        return true;

    }


}
