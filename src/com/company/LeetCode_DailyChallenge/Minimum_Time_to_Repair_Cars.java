package com.company.LeetCode_DailyChallenge;

public class Minimum_Time_to_Repair_Cars {

    //2594. Minimum Time to Repair Cars
    //https://leetcode.com/problems/minimum-time-to-repair-cars/description/

    public long repairCars(int[] ranks, int cars) {


        long ans=Long.MAX_VALUE, low=0, high= Long.MAX_VALUE, mid;


        while( low<=high){

            mid= low+ (high- low)/2;

            if( valid(ranks, cars, mid)==true){

                ans= mid;
                high= mid-1;
            }
            else{
                low= mid+1;

            }

        }

        return ans;
    }

    boolean valid( int[] ranks, int cars, long t){

        int cur=0;
        for( int i: ranks){
            cur+= Math.sqrt(t/i);
        }

        return cur>=cars;
    }

}
