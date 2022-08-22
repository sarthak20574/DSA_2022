package com.company.LeetCode_DailyChallenge;

public class Power_of_Four {


    // Power of Four
    //https://leetcode.com/problems/power-of-four/
    //https://www.youtube.com/watch?v=KwtRRZN6loU&ab_channel=KnowledgeCenter
    // java brains channel

    public boolean isPowerOfFour(int n) {
        return (n>0 && ((n & (n-1))==0) && n%3==1);
    }
}
