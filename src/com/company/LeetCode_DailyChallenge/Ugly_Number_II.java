package com.company.LeetCode_DailyChallenge;

public class Ugly_Number_II {

    //Ugly Number II
    //https://leetcode.com/problems/ugly-number-ii/description/
    //https://www.youtube.com/watch?v=X5SuOsIWCoI&ab_channel=CodewithAlisha

    public int nthUglyNumber(int n) {

        int[] dp=new int[n+1];
        dp[1]=1;

        //ptrs
        int two=1,three=1, five=1, i=2;

        int ans=0;

        while( i<=n ){

            dp[i]= Math.min( 2*dp[two], Math.min(3* dp[three], 5 * dp[five]));

            // move the ptr front if the ucrrent one is used

            if(2*dp[two]==dp[i])two++;
            if( 3* dp[three]==dp[i])three++;
            if( 5* dp[five]==dp[i])five++;

            i++;

        }

        return dp[n];

    }
}
