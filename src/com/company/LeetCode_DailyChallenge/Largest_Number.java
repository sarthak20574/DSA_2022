package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Largest_Number {

    //179. Largest Number
    //https://leetcode.com/problems/largest-number/description/
    //https://www.youtube.com/watch?v=WDx6Y4i4xJ8&ab_channel=NeetCode

    //[0,0,0] stupid testcase
    public String largestNumber(int[] nums) {
        // 9 5 34 30 3

        String[] x= new String[nums.length];
        int cur=0;

        for( int i: nums){
            x[cur++]=String.valueOf(i);
        }

        Arrays.sort(x, ((a, b)->(b+a).compareTo(a+b)));

        if(x[0].charAt(0)=='0') return "0";

        StringBuilder ans= new StringBuilder();

        for( String i: x){
            ans.append(i);
        }
        return ans.toString();

    }
}
