package com.company;

import java.util.Arrays;

public class Fitting_The_Array {


    //Fitting The Array
    //https://practice.geeksforgeeks.org/problems/fitting-the-array1514/1

    public static boolean isFit (int arr[], int brr[], int n) {

        Arrays.sort(arr);
        Arrays.sort(brr);

        for( int i=0; i<n; i++){
            if(arr[i]>brr[i]) return false;
        }

        return true;
    }
}
