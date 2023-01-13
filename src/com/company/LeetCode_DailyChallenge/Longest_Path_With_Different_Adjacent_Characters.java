package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;

public class Longest_Path_With_Different_Adjacent_Characters {

    //2246. Longest Path With Different Adjacent Characters
    //https://leetcode.com/problems/longest-path-with-different-adjacent-characters/description/
    //https://www.youtube.com/watch?v=yTflID2AMm8&ab_channel=BroCoders

    int[] dist;
    int ans=1;
    public int longestPath(int[] p, String s) {

        dist= new int[10_00_01];

        ArrayList<ArrayList<Integer>> g= new ArrayList<>();


        int n= p.length;

        boolean[] vis= new boolean[n];

        for( int i=0;i<n; i++){
            g.add(new ArrayList<>());
        }

        for( int i=0; i<n; i++){
            if( p[i]!=-1){
                g.get(p[i]).add(i);
            }
        }
        // vis[0]=true;

        ans=1;
        fn(0, n, g, s, vis);

        return ans;

    }

    void fn(int i, int n, ArrayList<ArrayList<Integer>> g, String s, boolean[] vis){

        dist[i]=1;

        for( int k: g.get(i)){

            // if( vis[k]==false){
            //      vis[k]=true;

            //0 therofre skip it


            fn(k, n, g, s, vis);
            if( s.charAt(i)==s.charAt(k)) continue;



            ans = Math.max(dist[i] + dist[k] , ans);
            dist[i]= Math.max(dist[i],dist[k]+1);

            //}
        }

    }

}
