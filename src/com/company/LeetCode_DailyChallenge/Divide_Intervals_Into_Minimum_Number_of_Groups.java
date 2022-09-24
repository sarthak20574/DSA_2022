package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Divide_Intervals_Into_Minimum_Number_of_Groups {


    //2406. Divide Intervals Into Minimum Number of Groups


    // same as minimum no of platforms required or meeting roooms

    public int minGroups(int[][] intervals) {
        int n= intervals.length;

        // create the start and the end arrays containing the start and the end times of
        // the intervals and sort them
        int[] start= new int[n];
        int[] end= new int[n];

        for( int i=0; i<n; i++){
            start[i]= intervals[i][0];
            end[i]= intervals[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int ans=0, cur= 0, i=0, j=0;

        while( i<n && j<n){

            // if one train is arriving we increase the no of platforms required
            if(start[i]<=end[j]){
                cur++;
                i++;

                // the maximum no of platforms present at any stage is our answer
                ans= Math.max(cur, ans);

            }

            //else if one train is leaving we decrease the no of platforms required
            else{

                cur--;
                j++;
            }
        }

        return ans;
    }
}
