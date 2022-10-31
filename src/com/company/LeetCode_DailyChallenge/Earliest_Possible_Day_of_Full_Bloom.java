package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Earliest_Possible_Day_of_Full_Bloom {

    //2136. Earliest Possible Day of Full Bloom
    //https://leetcode.com/problems/earliest-possible-day-of-full-bloom/description/
    //https://www.youtube.com/watch?v=R6Mc2W6rOZw&ab_channel=BroCoders

    public int earliestFullBloom(int[] plantTime, int[] growTime) {

        int n= growTime.length;
        int[][] arr= new int[n][2];

        for( int i=0; i<n; i++){
            arr[i]= new int[]{plantTime[i],growTime[i]};
        }

        Arrays.sort(arr, (a, b)-> b[1]-a[1]);

        int ans=0, cur_plantTime=0;

        for( int[] i: arr){

            cur_plantTime+=i[0];
            ans= Math.max( ans, cur_plantTime+i[1]);
        }

        return ans;
    }
}
