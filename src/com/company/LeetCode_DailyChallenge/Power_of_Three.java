package com.company.LeetCode_DailyChallenge;

public class Power_of_Three {

    //326. Power of Three
    //https://leetcode.com/problems/power-of-three/
    //https://youtu.be/UncqP2F4t_0?t=403

    public boolean isPowerOfThree(int n) {

        //3^19=1162261467, 3^20 = 3486784401 > MaxInt
        return n>0 && 1162261467%n==0;
    }
}
