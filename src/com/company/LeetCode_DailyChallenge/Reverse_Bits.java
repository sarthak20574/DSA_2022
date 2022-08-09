package com.company.LeetCode_DailyChallenge;

public class Reverse_Bits {

    //190. Reverse Bits
    //https://leetcode.com/problems/reverse-bits/
    //https://www.youtube.com/watch?v=UcoN6UjAI64&ab_channel=NeetCode

    public int reverseBits(int n) {


        int ans=0;

        for( int i=0 ; i<32; i++){

            int bit= (n>>i) & 1;
            ans= ans| (bit<<(31-i));
        }

        return ans;

    }
}
