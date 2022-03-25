package com.company;

public class Minimum_number_of_jumps {

    //https://www.youtube.com/watch?v=cETfFsSTGJI

    //using DP
   static int minJumps(int[] arr){

        int n= arr.length;

        int[] dp= new int[n];

        for( int i=1; i<n; i++){
            dp[i]=Integer.MAX_VALUE;
        }
        dp[0]=0;

        for( int i=1; i<n; i++){

            for( int j=0 ; j< i; j++){

                if(arr[j]+j>=i){
                    dp[i]= Math.min(dp[i],dp[j]+1);
                }
            }
        }

        return dp[n-1];
    }

}
