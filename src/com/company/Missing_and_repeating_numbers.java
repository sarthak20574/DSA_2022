package com.company;

import java.util.ArrayList;

public class Missing_and_repeating_numbers {

    //strivers sheet
    //Find Missing And Repeating
    //https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1/

    int[] findTwoElement(int arr[], int n) {

        int repeat = 0, miss = 0;
        for( int i=0; i< n; i++){
            if( arr[ Math.abs(arr[i])-1]<0) {
                repeat=  Math.abs(arr[i]);
            }
            else {
                arr[Math.abs(arr[i])-1]= - arr[Math.abs(arr[i])-1];
            }
        }

        for(int i=0; i< n; i++){
            if( arr[i]>0 ){
                miss=  i+1;
            }
        }

        return new int[]{ repeat, miss};
    }
    // or solve n* n(n+1)/2 = x-y
    // and n (n+1) (2n-1)/6 x^2 -y^2
}
