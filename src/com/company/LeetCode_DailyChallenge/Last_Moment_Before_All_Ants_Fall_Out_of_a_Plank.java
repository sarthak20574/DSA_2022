package com.company.LeetCode_DailyChallenge;

public class Last_Moment_Before_All_Ants_Fall_Out_of_a_Plank {

    //1503. Last Moment Before All Ants Fall Out of a Plank
    //https://leetcode.com/problems/last-moment-before-all-ants-fall-out-of-a-plank/?envType=daily-question&envId=2023-11-04

    public int getLastMoment(int n, int[] l, int[] r) {


        int ans=0;

        for( int i: l){
            ans= Math.max( i-0, ans);
        }

        for( int i: r){
            ans= Math.max( n-i, ans);
        }

        return ans;
    }

}
