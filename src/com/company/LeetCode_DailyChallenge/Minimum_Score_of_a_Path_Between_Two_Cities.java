package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Minimum_Score_of_a_Path_Between_Two_Cities {

    //2492. Minimum Score of a Path Between Two Cities
    //https://leetcode.com/problems/minimum-score-of-a-path-between-two-cities/description/
    // https://www.youtube.com/watch?v=K7-mXA0irhY&ab_channel=NeetCodeIO

    int ans;
    public int minScore(int n, int[][] roads) {

        Set<Integer> s= new HashSet<>();

        s.add(1);

        ArrayList<ArrayList<int[]>> g= new ArrayList<>();

        for( int i=0 ; i<n+1; i++){
            g.add(new ArrayList<>());
        }

        for( int[] i:roads){
            g.get(i[0]).add(new int[]{i[1],i[2]});
            g.get(i[1]).add(new int[]{i[0],i[2]});
        }
        ans= Integer.MAX_VALUE;

        dfs(1, n,g, s);

        // for( int i=0; i<n+1; i++){
        //     if( s.contains(i)){

        //         for( int k[]: g.get(i)){

        //             ans= Math.min( ans, k[1]);
        //         }
        //     }
        // }


        return ans;
    }

    void dfs( int cur, int n, ArrayList<ArrayList<int[]>> g, Set<Integer> s){


        for( int[] i: g.get(cur)){
            ans= Math.min(ans, i[1]);

            if( s.contains(i[0])==false){
                // System.out.println("Inn: "+ i[0]+" "+i[1]);
                //ans= Math.min(ans, i[1]);
                s.add(i[0]);
                dfs(i[0], n, g, s);
            }
        }
    }
}
