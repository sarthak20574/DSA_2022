package com.company.LeetCode_DailyChallenge;

public class Concatenation_of_Consecutive_Binary_Numbers {


    //1680. Concatenation of Consecutive Binary Numbers
    //https://leetcode.com/problems/concatenation-of-consecutive-binary-numbers/description/
    //https://www.youtube.com/watch?v=ttlNQ6YrdGs&ab_channel=TECHDOSE

    public int concatenatedBinary(int n) {

        long ans=0, mod=1_000_000_007;

        // length( bit length) of the cur integer(i) = 1+ log2(i)
        for( int i=1; i<=n; i++){

            long len= (1+(int) (Math.log(i)/ Math.log(2))) %mod;

            // every time a new i or no is appended the remaining no is left shifted by the length(bit length) of the no to be appended
            ans = ((ans << len)%mod + i)%mod;
        }

        return (int)ans;

    }

}
