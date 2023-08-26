package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Maximal_Network_Rank {


    //1615. Maximal Network Rank
    //https://leetcode.com/problems/maximal-network-rank/description/

    public int maximalNetworkRank(int n, int[][] r) {


        List<Set<Integer>> g= new ArrayList<>();

        for( int i=0; i<n; i++){
            g.add( new HashSet<>());
        }

        for( int[] i: r){
            g.get(i[0]). add(i[1]);
            g.get(i[1]). add(i[0]);
        }


        int cur=0, ans=0;

        for( int i=0; i<n; i++){

            for( int j= i+1; j<n; j++){

                cur=0;

                cur+= g.get(i).size()+  g.get(j).size();
                if( g.get(i).contains(j)) cur--;
                ans= Math.max( cur, ans);

            }

        }
        return ans;
    }

}
