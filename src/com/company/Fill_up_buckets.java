package com.company;

import java.util.Arrays;

public class Fill_up_buckets {

    public int totalWays(int n, int[] arr) {


        //Fill up buckets
        //https://practice.geeksforgeeks.org/problems/fill-up-buckets3500/1


        int mod=1000000007;
        Arrays.sort( arr);

        long ans=1;

        for( int i=0;i<n; i++){
            ans= (ans*(arr[i]-i))%mod;
        }

        return (int)ans;

    }

}
