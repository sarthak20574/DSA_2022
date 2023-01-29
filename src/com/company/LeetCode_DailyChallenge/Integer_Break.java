package com.company.LeetCode_DailyChallenge;

public class Integer_Break {

    //343. Integer Break
    //https://leetcode.com/problems/integer-break/description/?envType=study-plan&id=dynamic-programming-i
    //https://www.youtube.com/watch?v=in6QbUPMJ3I&ab_channel=NeetCode

    public int integerBreak(int n) {


        // n==4 = max( fn( 3) *fn(1), fn(2)*fn(2), fn( 1) *fn(3) )


        // n=1 ans=1
        // n=2 ans=1*1
        // n=3 ans = 2*1
        // n=4 2 *2

        int[] dp= new int[n+1];

        dp[1]=1;

        for( int i=1; i<n+1; i++){

            if( i!=n){
                dp[i]= Math.max(i,dp[i]);
            }

            for( int k=1; k<i; k++){

                //System.out.println(" k= "+k+" n-k= "+(i-k)+" dp= "+dp[k]+":"+ dp[i-k]);

                dp[i]= Math.max( dp[i], dp[k] * dp[i-k]);
            }
        }

        //System.out.println(Arrays.toString(dp));


        return dp[n];
    }

}
