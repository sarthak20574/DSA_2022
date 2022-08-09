package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Non_overlapping_Intervals {

    //435. Non-overlapping Intervals
    //https://leetcode.com/problems/non-overlapping-intervals/
    //https://www.youtube.com/watch?v=nONCGxWoUfM&ab_channel=NeetCode

    public int eraseOverlapIntervals(int[][] intervals) {

        //sort in ascending order of their starting times
        Arrays.sort(intervals, (a, b)->a[0]-b[0]);


        // we keep a record of the emd time of the previous event
        int ans=0, prev_end=intervals[0][1], n= intervals.length;

        for( int i=1; i<n; i++){

            //if its the prev and the cur intervals don't overlap we just move on
            if( prev_end<=intervals[i][0]) {
                prev_end=intervals[i][1];
            }
            else{

                ans++;
                // we keep the interval with the minimum end time and delete the one with larger end time
                prev_end= Math.min(prev_end, intervals[i][1]);

            }
        }

        return ans;
    }
}
