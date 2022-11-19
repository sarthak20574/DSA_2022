package com.company.LeetCode_DailyChallenge;

public class Equilibrium_Point {

    //Equilibrium Point
    //https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/1
    public static int equilibriumPoint(long arr[], int n) {

        long lft=0, ryt=0;

        for( long i: arr){
            ryt+=i;
        }


        for( int i=0; i< n; i++){

            ryt-=arr[i];

            if( lft==ryt) return i+1;

            lft+=arr[i];

        }

        return -1;
    }
}
