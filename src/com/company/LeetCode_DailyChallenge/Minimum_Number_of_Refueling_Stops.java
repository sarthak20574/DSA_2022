package com.company.LeetCode_DailyChallenge;

import java.util.PriorityQueue;

public class Minimum_Number_of_Refueling_Stops {


    //871. Minimum Number of Refueling Stops
    //https://leetcode.com/problems/minimum-number-of-refueling-stops/
    // watch code with alisha's video

    public int minRefuelStops(int target, int startFuel, int[][] stations) {


        int i=0, n= stations.length, cur_fuel= startFuel, ans=0;

        PriorityQueue<Integer> maxHeap= new PriorityQueue<>((a, b)->b-a);

        while( cur_fuel<target){
            while( i<n && cur_fuel>=stations[i][0]){
                maxHeap.add(stations[i++][1]);
            }
            if( maxHeap.isEmpty()==true) return -1;
            cur_fuel+=maxHeap.poll();
            ans++;
        }


        return ans;

    }
}
