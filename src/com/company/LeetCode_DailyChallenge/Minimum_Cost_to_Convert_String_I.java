package com.company.LeetCode_DailyChallenge;

import java.util.*;

public class Minimum_Cost_to_Convert_String_I {

    //2976. Minimum Cost to Convert String I
    //https://leetcode.com/problems/minimum-cost-to-convert-string-i/description/

    public long minimumCost(String src, String tar, char[] o, char[] c, int[] cost) {

        long ret=0l;

        long[][] dp= new long[26][26];

        List<List<int[]>> g= new ArrayList<>();

        for( int i=0; i<26; i++){
            g.add(new ArrayList<>());
        }

        int n= o.length;

        for( int i=0; i<n; i++){
            g.get(o[i]-'a').add(new int[]{c[i]-'a', cost[i] });
        }

        long m= 1_000_000_00001L;

        for( int k1=0; k1<26; k1++){
//            for( int k2=0; k2<26; k2++){
            long[] ans= new long[26];
            Arrays.fill( ans, m);

            int start=k1; //endd= k2;
            Queue<Integer> pq= new PriorityQueue<>(Comparator.comparingLong(a -> ans[a]));
            ans[start]=0;
            pq.add(start);


            while( pq.isEmpty()==false){

                int x= pq.poll();

                for( int[] e: g.get(x)){

                    int costt= e[1];
                    int srcc=x;
                    int dest= e[0];

                    if( ans[dest]> ans[srcc]+ costt && srcc!=dest){
                        pq.add(dest);
                        ans[dest]=ans[srcc]+ costt;
                    }

                }

            }
            dp[k1]= ans;
        }

        for( int i=0; i<src.length();i++){
            int start=src.charAt(i)-'a', endd= tar.charAt(i)-'a';

            if( dp[start][endd]==m) return -1;
            ret+= dp[start][endd];
        }
        return ret;
    }
}
