package com.company.LeetCode_DailyChallenge;

public class Increasing_Triplet_Subsequence {

    //334. Increasing Triplet Subsequence
    //https://leetcode.com/problems/increasing-triplet-subsequence/description/
    //https://www.youtube.com/watch?v=90tYQ5jNVPo&ab_channel=CodewithAlisha

    public boolean increasingTriplet(int[] nums) {

        int first=Integer.MAX_VALUE, second= Integer.MAX_VALUE;

        for( int x: nums){

            //if the current element is greater than second element then we have found the increasing triplet
            if( second<x) return true;

                // we try updating our first and second elements to the smallest value possible
            else if( first>x) first=x;

                // also not equal to first first=1 and second =1 are false so need to check first <x
            else if( second>x && first<x) second=x;
        }

        return false;

    }

}
