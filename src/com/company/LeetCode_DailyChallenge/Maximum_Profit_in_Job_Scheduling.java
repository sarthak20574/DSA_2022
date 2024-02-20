package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;
import java.util.TreeMap;

public class Maximum_Profit_in_Job_Scheduling {


    //1235. Maximum Profit in Job Scheduling
    //https://leetcode.com/problems/maximum-profit-in-job-scheduling/description/

    //https://www.youtube.com/watch?v=JLoWc3v0SiE&ab_channel=NeetCodeIO


    int[] dp;
    public int jobScheduling(int[] s, int[] e, int[] p) {

        int n= s.length;
        dp= new int[n+1];
        Arrays.fill(dp, -1);

        int[][] x= new int[n][3];

        for( int i=0; i<n; i++){
            x[i][0]=s[i];
            x[i][1]=e[i];
            x[i][2]=p[i];
        }

        Arrays.sort(x, (a, b)->a[0]-b[0]);

        return fn(x, 0);
    }

    int fn( int[][] x, int i){
        int n=x.length;

        if( i==n) return 0;
        if( dp[i]!=-1) return dp[i];

        int cur= fn( x, i+1);
        int prev=las(x, i);
        cur= Math.max(  cur, x[i][2]+ fn(x, prev));

        dp[i]= cur;

        return cur;
    }

    int las( int[][] x, int i){
        int n= x.length;

        int l=i+1, h=n-1, ret=n;

        while( l<=h){
            int mid= l+(h-l)/2;

            if( x[i][1]<=x[mid][0]){
                ret=mid;
                h=mid-1;
            }
            else l= mid+1;
        }

        return ret;
    }



    //https://www.youtube.com/watch?v=cr6Ip0J9izc&ab_channel=TusharRoy-CodingMadeSimple

    public int jobScheduling2(int[] startTime, int[] endTime, int[] profit) {


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
