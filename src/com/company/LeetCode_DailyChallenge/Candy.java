package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Candy {


    //135. Candy
    //https://leetcode.com/problems/candy/
    //https://www.youtube.com/watch?v=PzBYQA6FshA&ab_channel=CodewithAlisha

    public int candy(int[] ratings) {

        int n=ratings.length;
        int dp[]= new int[n];
        int ans=0;

        Arrays.fill( dp, 1);

        //checking forward
        for( int i=1; i<n ; i++){
            if( ratings[i]>ratings[i-1]){
                dp[i]= dp[i-1]+1;
            }
        }

        // checking backward and taking the max of this backward and forward chain

        for( int i=n-2; i>=0 ; i--){
            if(ratings[i]>ratings[i+1]){
                dp[i]= Math.max(dp[i+1]+1, dp[i]);
                // ans+=dp[i];
            }
        }


        //finally add all thge
        for( int x: dp){
            ans+=x;
        }


        return (ans);

    }
}
