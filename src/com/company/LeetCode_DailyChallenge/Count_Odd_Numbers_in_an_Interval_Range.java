package com.company.LeetCode_DailyChallenge;

public class Count_Odd_Numbers_in_an_Interval_Range {

    //1523. Count Odd Numbers in an Interval Range
    //https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/description/


    public int countOdds(int low, int high) {
        //6-4/2 +2
        int ans=0;
        if( low%2==1){
            ans++;
            low++;
        }
        if( high%2==1){
            ans++;
            high--;
        }

        return ans + (high-low)/2;

    }

}
