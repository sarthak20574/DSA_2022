package com.company;

public class Maximum_Sum_LCM {

    //Maximum Sum LCM
    //https://practice.geeksforgeeks.org/problems/maximum-sum-lcm3025/1

    static long maxSumLCM(int n) {

        long sq=(long)Math.sqrt(n), ans=0;

        for( long i=1; i<=sq; i++){

            if( n % i ==0) {
                ans+=i;
                ans+=i!=(n/i)?n/i: 0L;
            }
        }

        return ans;

    }
}
