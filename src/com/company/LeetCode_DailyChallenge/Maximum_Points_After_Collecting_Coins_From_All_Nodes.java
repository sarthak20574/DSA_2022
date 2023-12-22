package com.company.LeetCode_DailyChallenge;

import java.util.*;

public class Maximum_Points_After_Collecting_Coins_From_All_Nodes {


    //2920. Maximum Points After Collecting Coins From All Nodes
    //https://leetcode.com/problems/maximum-points-after-collecting-coins-from-all-nodes/
    //https://www.youtube.com/watch?v=5TJbvfiwvjo


    List<List<Integer>> g;
    long[][] dp;
    Set<Integer> vis;
    public int maximumPoints(int[][] e, int[] c, int k) {

        int n= c.length;

        g= new ArrayList<>();
        for( int i=0; i<n; i++){
            g.add( new ArrayList<>());
        }

        for( int[] i: e){
            g.get( i[0]).add(i[1]);
            g.get( i[1]).add(i[0]);
        }
        vis= new HashSet<>();

        vis.add(0);
        dp= new long[14][100001];
        for( int i=0; i<14; i++){
            Arrays.fill(dp[i], -1l);
        }


        return (int) dfs( c,k,0, 0, -1);
    }

    long dfs(int[] c, int k, int d, int i, int p){
        long cur1=(c[i]>>d) -k, cur2=(c[i]>>(d+1));
        if (d > 13) return 0;

        if( dp[d][i]!=-1) return dp[d][i];

        for( int j: g.get(i)){
            //if( p!=j){
            if( vis.contains( j)==false){
                vis.add(j);

                cur1+= dfs(c, k, d, j, i);
                cur2+=  dfs(c, k, d+1, j, i);
                vis.remove(j);
            }
        }
        dp[d][i]=Math.max( cur1, cur2);
        return Math.max( cur1, cur2);
    }


    public int maximumPoints1(int[][] e, int[] c, int k) {

        int n= c.length;

        g= new ArrayList<>();
        for( int i=0; i<n; i++){
            g.add( new ArrayList<>());
        }

        for( int[] i: e){
            g.get( i[0]).add(i[1]);
            g.get( i[1]).add(i[0]);
        }
        //vis= new HashSet<>();

        //vis.add(0);
        dp= new long[16][100001];
        for( int i=0; i<16; i++){
            Arrays.fill(dp[i], -1l);
        }


        return (int) dfs( c,k,0, 0, -1);
    }

    long dfs1(int[] c, int k, int d, int i, int p) {
        long cur1 = (c[i] >> d) - k, cur2 = (c[i] >> (d + 1));
        if (d > 13) return 0;

        for (int j : g.get(i)) {
            if (p != j) {
                //    vis.add(j);
                if (dp[d][i] != -1) return dp[d][i];
                cur1 += dfs1(c, k, d, j, i);
                cur2 += dfs1(c, k, d + 1, j, i);
            }
        }
        dp[d][i] = Math.max(cur1, cur2);
        return Math.max(cur1, cur2);
    }
}
