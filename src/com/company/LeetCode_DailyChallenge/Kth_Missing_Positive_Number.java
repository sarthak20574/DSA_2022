package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Kth_Missing_Positive_Number {

    //1539. Kth Missing Positive Number


    static int[][] dp;
    public static boolean subsetSumToK(int n, int k, int arr[]){
        dp= new int[k+1][n];

        for( int i=0; i<k; i++){
            Arrays.fill( dp[i], -1);
        }

        for( int i=0; i<n; i++){
            dp[k][i]=1;
        }

        for( int cur=k-1; cur<=k; cur++){

            for( int i=0; i<n; i++){

            }
        }


        return fn( 0, k, arr, 0, n);
    }

    static boolean fn( int cur, int k, int[] arr, int i, int n){

        if( cur>k) return false;


        if( cur==k) return true;
        if( i>=n) return false;
        if( dp[cur][i]!=-1){

            if(dp[cur][i]== 1)return true;
            else return false;
        }
        boolean ans=false;

        //for( int j=i; j<n; j++){

        ans= ans|| fn( cur+ arr[i], k, arr, i+1, n)
                || fn( cur, k, arr, i+1, n);
        // }

        if( ans==true){
            dp[cur][i]= 1;
        }
        else dp[cur][i]= 0;


        return ans;
    }
}
