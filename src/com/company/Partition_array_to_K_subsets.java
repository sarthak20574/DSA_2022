package com.company;

import java.util.Arrays;

public class Partition_array_to_K_subsets  {

    //Partition array to K subsets
    //https://practice.geeksforgeeks.org/problems/partition-array-to-k-subsets/1

    public boolean isKPartitionPossible(int a[], int n, int k){

        int sum=0;

        for( int i=0; i<n; i++){
            sum+=a[i];
        }

        int size= sum/k;
        if( sum%k!=0) return false;

        int arr[]= new int[k];
        Arrays.sort(arr);

        return fn(a, n, k, arr, size, n-1);
    }

    boolean fn( int a[], int n, int k, int arr[], int size, int i){


        if( i==-1){
            for( int j=0; j<k; j++){
                if( arr[j]!=size) return false;
            }
            return true;
        }

        for( int j=0; j<k; j++){
            if( arr[j]>size) return false;
        }


        boolean x= false;

        for( int j=0; j<k; j++){
            arr[j]+=a[i];
            x= x || fn(a, n, k, arr, size,i-1);
            arr[j]-=a[i];
        }
        return x;
    }
}
