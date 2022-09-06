package com.company;

public class Smallest_sum_contiguous_subarray {

    //Smallest sum contiguous subarray

    //https://practice.geeksforgeeks.org/problems/smallest-sum-contiguous-subarray/1

    static int smallestSumSubarray(int a[], int n)
    {
        int ans= a[0], cur=a[0];

        for( int i=1; i<n; i++){

            cur= Math.min( cur + a[i], a[i]);

            ans= Math.min( cur, ans);
        }

        return ans;
    }
}
