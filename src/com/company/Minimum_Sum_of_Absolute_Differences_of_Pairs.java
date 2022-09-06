package com.company;

import java.util.Arrays;

public class Minimum_Sum_of_Absolute_Differences_of_Pairs {



    //Minimum Sum of Absolute Differences of Pairs
    //https://practice.geeksforgeeks.org/problems/minimum-sum-of-absolute-differences-of-pairs/1

    long findMinSum(int[] A,int[] B,int n) {

        Arrays.sort(A);
        Arrays.sort(B);

        long ans=0;

        for( int i=0; i<n; i++){
            ans+= Math.abs(A[i]-B[i]);
        }

        return ans;

    }
}
