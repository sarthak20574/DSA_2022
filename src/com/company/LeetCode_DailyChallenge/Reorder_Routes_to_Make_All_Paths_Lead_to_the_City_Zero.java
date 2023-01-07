package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Reorder_Routes_to_Make_All_Paths_Lead_to_the_City_Zero {


    //1466. Reorder Routes to Make All Paths Lead to the City Zero
    //https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/description/?envType=study-plan&id=graph-i

    int ans=0;
    Set<String> x;

    public int minReorder(int n, int[][] conn) {

        x= new HashSet<>();
        ArrayList<ArrayList<Integer>> g= new ArrayList<>();


        for( int i=0; i<n; i++){
            g.add(new ArrayList<>());
        }


        for( int[] i: conn){
            x.add(i[0]+" "+i[1]);
            g.get(i[0]).add(i[1]);
            g.get(i[1]).add(i[0]);
        }

        boolean[] visited= new boolean[n];
        //visited[0]=true;


        ans=0;

        fn( 0, g, visited, 0, n);

        return ans;
    }

    void fn( int i, ArrayList<ArrayList<Integer>> g, boolean[] visited, int no_visited, int n){

        if(no_visited==n) return;

        visited[i]=true;
        no_visited++;

        for(int k: g.get(i)){

            if( visited[k]==false){
                if( x.contains(k+ " "+i)==false) ans++;
                fn( k, g, visited, no_visited, n);
            }
        }


    }
}
