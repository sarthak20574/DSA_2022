package com.company.LeetCode_DailyChallenge;

public class Minimize_Maximum_of_Array {

    // votrubac: The best we can do is to reduce nums[i] to the average of array nums[0, i].



    //2439. Minimize Maximum of Array
    //https://leetcode.com/problems/minimize-maximum-of-array/description/
    // https://www.youtube.com/watch?v=AeHMvcKuR0Y&ab_channel=NeetCodeIO

    public int minimizeArrayValue(int[] nums) {


        // answer can't be greater than nums[0]


        double ans= Integer.MIN_VALUE;

        double cur=0;

        double n=0;

        for( int i: nums){
            cur+=i;
            n++;
            ans= Math.max( ans,Math.ceil(cur/n));

        }
        return (int)ans;
    }



}
