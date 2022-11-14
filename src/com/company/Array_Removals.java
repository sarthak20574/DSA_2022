package com.company;

import java.util.Arrays;

public class Array_Removals {

    //Array Removals
    //https://practice.geeksforgeeks.org/problems/array-removals/1
    //https://www.youtube.com/watch?v=8dBgFK5y9Xg&ab_channel=SagarMalhotra

    int removals(int[] arr, int n, int k) {
        int ans=0;

        int i=0, j=0;


        Arrays.sort(arr);

        while( j<n){

            if( arr[j]-arr[i]<=k){
                //update the ans
                j++;

            }
            else if( i<j){
                i++;
            }
            ans=Math.max(j-i, ans);

        }

        return n-ans;


    }

}
