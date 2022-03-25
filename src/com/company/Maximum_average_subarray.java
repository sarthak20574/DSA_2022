package com.company;

public class Maximum_average_subarray {
    //https://practice.geeksforgeeks.org/problems/maximum-average-subarray5859/1#
    /*
    int findMaxAverage(int arr[], int n, int k) {

       int ans=0, index=-1;

       for( int i=0 ; i<k; i++){
           ans+=arr[i];
       }

       int max=ans;
       for( int i=0,j=k; j<n;i++,j++){
           max=max-arr[i]+arr[j];
           if( ans<max){
               ans=  max;
               index=i;
           }
       }
       return index+1;

    }
     */
}
