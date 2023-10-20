package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Maximum_Number_of_K_Divisible_Components {


    //2872. Maximum Number of K-Divisible Components
    //https://leetcode.com/problems/maximum-number-of-k-divisible-components/

    int ans=0;
    long[] dp;
    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k){

        List< List<Integer> > g= new ArrayList<>();
        dp= new long[n];

        for( int i=0; i<n; i++){
            g.add( new ArrayList<>());
        }

        for( int[] e: edges){
            g.get(e[0]).add(e[1]);
            g.get(e[1]).add(e[0]);
        }

        ans=0;

        Set<Integer> vis= new HashSet<>();
        vis.add(0);

        fn( 0, g, n,k, values, vis);

        return ans;
    }

    long fn(int i, List<List<Integer>> g, int n, int k, int[] val, Set<Integer> vis ){

        for( int j:g.get(i) ){

            if( vis.contains(j)==false){
                vis.add(j);
                dp[i]+= fn(j, g, n, k, val, vis);
            }

        }

        dp[i]+=val[i];

        if( dp[i] % k==0 ){
            ans++;
            dp[i]=0;
        }

        return dp[i];
    }

}
