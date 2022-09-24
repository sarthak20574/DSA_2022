package com.company;

import java.util.Arrays;

public class Smallest_Subset_with_Greater_Sum {


    //Smallest Subset with Greater Sum
    //https://practice.geeksforgeeks.org/problems/smallest-subset-with-greater-sum/1

    int minSubset(int[] arr,int n) {
        Arrays.sort( arr);


        long sum=0;

        for( int i=0; i<n; i++){
            sum+=arr[i];
        }



        long cur=0;

        int i=n-1;

        while( cur<=sum){
            sum-=arr[i];
            cur+=arr[i--];
        }

        return n-1 -i;
    }
}
