package com.company;

public class Grouping_Of_Numbers {

    //Grouping Of Numbers
    //https://practice.geeksforgeeks.org/problems/grouping-of-numbers0015/1

    static int maxGroupSize(int[] arr, int n, int k) {

        int[] rem= new int[k];

        for( int i=0; i<n; i++){
            rem[arr[i]%k]++;

        }

        int i=1, j=k-1,ans=0;

        while( i<j){
            ans+= Math.max( rem[i++], rem[j--]);
        }

        //only include one multiple of k
        if( rem[0]>0) ans++;

        //even inlcude just one k/2 as k/2 + k/2 = k
        if( k%2==0 && rem[k/2]>0) ans++;

        return ans;


    }
}
