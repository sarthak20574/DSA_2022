package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Intervals {

    //56. Merge Intervals

    public int[][] merge(int[][] intervals) {

        // sort them in ascending order of their starting times
        Arrays.sort(intervals, (a, b)->a[0]-b[0]);

        List<int[]> ans= new ArrayList<>();

        // initilize the prev start and the prev end
        int prev_start = intervals[0][0], prev_end =intervals[0][1];

        for( int[] x: intervals){

            // if not overlapping then just add the previous interval to our answer and update the start and the end with the new interval
            if( prev_end <x[0]){

                ans.add(new int[]{prev_start, prev_end});
                prev_start = x[0];
                prev_end = x[1];
            }
            // in case of overlaps, we greedily choose the max of the prev and the cur intervals
            else{
                prev_end = Math.max(x[1], prev_end);
            }
        }


        // add the last interval
        ans.add(new int[]{prev_start, prev_end});

        // convert the list to an array
        return ans.toArray(new int[0][]);

    }
}
