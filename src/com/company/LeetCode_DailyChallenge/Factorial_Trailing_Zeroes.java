package com.company.LeetCode_DailyChallenge;

public class Factorial_Trailing_Zeroes {

    //172. Factorial Trailing Zeroes
    //https://leetcode.com/problems/factorial-trailing-zeroes/description/


    // 10= 5*2,
    // so we hunt for multiples of 5 as 2 is on abundance...
    // but what bout 25 125 625 (5^2, 5^3, 5^4...) they too contribute 5s...
    // therefore ans = n/5 + fn( n/5)...

    public int trailingZeroes(int n) {

        int ans=0;

        while( n>0){
            ans+=n/5;
            n/=5;
        }

        return ans;
    }
}
