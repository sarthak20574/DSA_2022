package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Maximum_Number_of_coins {

    //Maximum Number of coins
    //https://practice.geeksforgeeks.org/problems/7ae455e552dc4e07f76bbe2adc4d4207ce1ff16e/1

    int[][] dp;
    int maxCoins(int N, ArrayList<Integer> arr) {

        dp= new int[N+2][N+2];

        for( int i=0; i<N+1; i++){
            Arrays.fill(dp[i], -1);
        }

        arr.add(0, 1);
        arr.add(arr.size(),1);


        return fn( 1, arr.size()-2, arr, N);

        //return 0;
    }

    int fn(int l, int r, ArrayList<Integer> arr, int n){

        if( l>r) return 0;

        if( dp[l][r]!=-1) return dp[l][r];

        int cur=0;

        int coins=0;
        for( int i=l; i<=r; i++){

            coins= arr.get(l-1) * arr.get(i)* arr.get(r+1);

            coins= coins + fn( l, i-1, arr, n) + fn( i+1,r,  arr,n);

            cur= Math.max(cur, coins);
        }
        dp[l][r]=cur;
        return cur;
    }
}
