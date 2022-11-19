package com.company;

public class Count_of_Subarrays {

    //Count of Subarrays
    //https://practice.geeksforgeeks.org/problems/count-of-subarrays5922/1

    long countSubarray(int arr[], int n, int k) {



        /*

        1 2
        1 2 3
        1 2 3 4

        2
        2 3
        2 3 4



        3
        3 4


        4

         0 + 1+ 2 + 3

        */

        //if we get a no element that is greate than  k then + n-i

        long ans=0;
        // all the previous elements that are greate than the present
        //one can make a subarray wintht e


        long prev=0;
        for( int i=0; i<n; i++){
            if( arr[i]>k){

                ans+= i+1 ;
                prev= i+1;

            }
            else {
                ans+= prev;

            }
        }

        return ans;
    }
}
