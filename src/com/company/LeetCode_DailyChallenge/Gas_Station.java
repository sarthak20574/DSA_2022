package com.company.LeetCode_DailyChallenge;

public class Gas_Station {


    //134. Gas Station
    //https://leetcode.com/problems/gas-station/description/
    //https://www.youtube.com/watch?v=lJwbPZGo05A&ab_channel=NeetCode

    public int canCompleteCircuit(int[] gas, int[] cost) {

        int n=gas.length;

        for( int i=0; i<n; i++){

            gas[i]-=cost[i];
        }

        int total=0;
        for( int i: gas){
            total+=i;
        }
        if( total<0) return -1;

        // System.out.println(Arrays.toString(gas));

        int cur=0, sum=0;

        for( int i=0; i<n; i++){
            sum+=gas[i];

            if( sum<0){
                cur=i+1;
                sum=0;
            }
        }
        return cur;
    }

}
