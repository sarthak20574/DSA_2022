package com.company;

public class Alternate_positive_and_negative_numbers {


    //Alternate positive and negative numbers
    //https://practice.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1

    //  2 arrays, 1 of positive elements only and 1 of -ve elements only
    // or
    // 1 pass solution/ 2 pointers
    void rearrange(int arr[], int n) {
        int ans[]= new int[n];

        int i=0, j=0;

        int index=0;

        while( index<n && i<n && j<n){

            if( index%2==0){
                while(i<n && arr[i]<0){
                    i++;
                }
                if( i<n)
                    ans[index++]=arr[i++];
            }

            else{
                while( j<n && arr[j]>=0){
                    j++;
                }

                if( j<n)
                    ans[index++]=arr[j++];
            }
        }

        while(i<n){
            while(i<n && arr[i]<0){
                i++;
            }
            if( i<n)
                ans[index++]=arr[i++];
        }
        while( j<n){
            while( j<n && arr[j]>=0){
                j++;
            }

            if( j<n)
                ans[index++]=arr[j++];
        }


        for( int k=0;k<n; k++){
            arr[k]=ans[k];
        }
        //arr=ans;

    }
}
