package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Cheapest_Flights_Within_K_Stops {

    //787. Cheapest Flights Within K Stops
    //https://leetcode.com/problems/cheapest-flights-within-k-stops/description/
    //https://www.youtube.com/watch?v=5eIK3zUdYmE&ab_channel=NeetCode

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        int[] dist= new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[src]=0;

        for( int j=0; j<k+1; j++){

            int[] tmp= Arrays.copyOf(dist, n);
            for( int[] e: flights){

                int s= e[0], d=e[1], c=e[2];

                if( dist[s]==Integer.MAX_VALUE) continue;

                if( dist[s]+c <tmp[d]){
                    tmp[d] = dist[s]+c;
                }
            }
            dist=tmp;
        }

        return dist[dst]==Integer.MAX_VALUE?-1:dist[dst];
    }

}
