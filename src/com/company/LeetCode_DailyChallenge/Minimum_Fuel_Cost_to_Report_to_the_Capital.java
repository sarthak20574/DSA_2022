package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;

public class Minimum_Fuel_Cost_to_Report_to_the_Capital {

    //2477. Minimum Fuel Cost to Report to the Capital
    //https://leetcode.com/problems/minimum-fuel-cost-to-report-to-the-capital/description/
    //see NEETCODE.IO's video

    // so irritating to debug.....Math.ceil(1/7) = 0.0

    long ans=0;


    public long minimumFuelCost(int[][] roads, int seats) {

        ans=0;

        ArrayList<ArrayList<Integer>> g= new ArrayList<>();
        int n= roads.length +1;

        for( int i= 0; i<n; i++){
            g.add( new ArrayList<>());
        }


        for( int[] i: roads){
            g.get(i[0]).add(i[1]);
            g.get(i[1]).add(i[0]);
        }

        dfs ( g, seats, 0, -1);

        return ans;
    }

    // {ans, cur}
    long dfs(ArrayList<ArrayList<Integer>> g, int seats,
             int i, int prev){

        long cur=0;

        for( int k: g.get(i)){

            if( prev!=k){

                cur+=dfs ( g, seats, k, i);

                //System.out.println(Math.ceil(ppl/seats));
            }
        }

        if(i!=0)
            ans +=  (cur+seats)/seats;


        //System.out.println(cur+ " "+ ans+" "+ i);

        return cur+1;
    }
}
