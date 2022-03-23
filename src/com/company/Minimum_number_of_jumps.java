package com.company;

public class Minimum_number_of_jumps {

    static int minJumps(int[] arr){

        int n= arr.length;
        int[] dp= new int[n];

        for( int i=0; i<n; i++){
            dp[i]= Integer.MAX_VALUE;
        }

        for( int i=0; i< n ; i++){

            for( int j=1; j<=arr[i]; j++){

                dp[i]= Math.min(dp[i+j],dp[i]+1);
            }
        }


        return dp[n-1]==Integer.MAX_VALUE?-1:dp[n-1];
    }

}
