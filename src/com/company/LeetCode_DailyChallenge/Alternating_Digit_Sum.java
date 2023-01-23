package com.company.LeetCode_DailyChallenge;

public class Alternating_Digit_Sum {

    //2544. Alternating Digit Sum
    //https://leetcode.com/problems/alternating-digit-sum/

    public int alternateDigitSum(int n) {

        int ans=0, cur=1;

        String x= n+"";



        for( int i: x.toCharArray()){
            ans+=(cur*(i-'0'));
            cur*=-1;
        }
        return ans;

    }


}
