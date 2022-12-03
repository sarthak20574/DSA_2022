package com.company;

public class LCM_Triplet {

    //LCM Triplet
    //https://practice.geeksforgeeks.org/problems/lcm-triplet1501/1

    long lcmTriplets(long n) {

        if( n<=2) return  n;

        else if( n%2==1) return n * (n-1) *(n-2);
        else  if( n%6==0) return (n-3) * (n-1) *(n-2);

        else
            return n * (n-1) * (n-3) ;
    }

}
