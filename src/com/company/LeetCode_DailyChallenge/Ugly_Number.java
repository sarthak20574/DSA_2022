package com.company.LeetCode_DailyChallenge;

public class Ugly_Number {

    //263. Ugly Number
    //https://leetcode.com/problems/ugly-number/description/
    public boolean isUgly(int n) {

        if(n==0) return false;

        while( n%2==0) n=n/2;

        while( n%3==0) n=n/3;

        while( n%5==0) n=n/5;

        return n==1 ;

    }

}
