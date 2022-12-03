package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;
import java.util.TreeMap;

public class Maximum_Profit_in_Job_Scheduling {


    //1235. Maximum Profit in Job Scheduling
    //https://leetcode.com/problems/maximum-profit-in-job-scheduling/description/
    //https://www.youtube.com/watch?v=cr6Ip0J9izc&ab_channel=TusharRoy-CodingMadeSimple

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {


        int n= startTime.length;

        int[][] arr= new int[n][3];


        for( int i=0; i<n; i++){
            arr[i]= new int[]{startTime[i], endTime[i], profit[i]};
        }


        Arrays.sort( arr, (a, b)->a[1]-b[1]);

        // storing the , profit, end
        TreeMap<Integer,Integer> dp= new TreeMap<>();
        dp.put( 0,0);
        //end time=0, profit=0
        // to handle the null case or the case where there is no

        for( int[] x: arr){

            // get the largest node whose end time ends before the start node of our current node
            int cost= dp.floorEntry(x[0]).getValue() + x[2];

            if( cost>dp.lastEntry().getValue())
                dp.put(x[1], cost);

            // System.out.println(dp);



        }



        return dp.lastEntry().getValue();


    }
}
