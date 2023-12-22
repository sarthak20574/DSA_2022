package com.company.LeetCode_DailyChallenge;

import java.util.*;

public class Bus_Routes {

    //815. Bus Routes
    //https://leetcode.com/problems/bus-routes/description/?envType=daily-question&envId=2023-11-12

    public int numBusesToDestination(int[][] r,
                                     int src, int tar) {

        Set<Integer> vis= new HashSet<>();

        Map<Integer, List<Integer>> m= new HashMap<>();

        int lll= r.length;

        for( int i=0; i<lll; i++){
            for(int j: r[i]){
                if( m.containsKey(j)==false){
                    m.put( j, new ArrayList<>());
                }
                m.get(j).add(i);
            }
        }
        Queue<Integer> q= new LinkedList<>();

        int ans=0;
        for( int i: m.get(src)){

            if( vis.contains(i)==false){
                q.add( i);
                vis.add(i);
            }
        }
        if( src== tar) return 0;

        // 1 = 1
        // 2 =1
        //7  =1

        // map= 1= 1 2 7
        //
        // first we check the current if not there we add
        // all the busses connected to the  citiy



        while(q.isEmpty()==false){
            ans++;
            int n= q.size();

            for( int k=0; k<n; k++){

                int x=q.poll();
                for( int c: r[x]){
                    if( tar==c) return ans;

                    for( int l: m.get(c)){
                        if( vis.contains(l)==false){
                            vis.add(l);
                            q.add(l);
                        }
                    }
                }
            }
        }

        return -1;
    }
}
