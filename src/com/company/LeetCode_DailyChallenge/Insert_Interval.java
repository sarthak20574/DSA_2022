package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Insert_Interval {



    //57. Insert Interval
    //https://leetcode.com/problems/insert-interval/
    //https://www.youtube.com/watch?v=A8NUOmlwOlM&ab_channel=NeetCode

    public int[][] insert(int[][] intervals, int[] newInterval) {

        // insert all intervals untill you reach our new interval

        List<int[]> ans= new ArrayList<>();

        int i=0;

        while( i<intervals.length &&  intervals[i][1]<newInterval[0]){
            ans.add(intervals[i++]);
        }


        // now insert and merge if required

        while( i<intervals.length && intervals[i][0] <= newInterval[1]){
            newInterval[1]=Math.max( intervals[i][1], newInterval[1]);
            newInterval[0]=Math.min( intervals[i][0], newInterval[0]);
            i++;
        }


        // add the new interval
        ans.add( newInterval);


        // add the remaining intervals
        while( i<intervals.length){
            ans.add(intervals[i++]);
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
