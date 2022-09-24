package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Power_Of_2_and_Subsequences {


    //Power Of 2 and Subsequences
    //https://practice.geeksforgeeks.org/problems/power-of-2-and-subsequences0759/1

    static Long numberOfSubsequences(int N, ArrayList<Long> A){

        Set<Long> x= new HashSet<>();

        long lim= 1_000_000_000;

        for( long i=1; i<lim;i*=2){
            if( i>lim)break;
            x.add( i);
        }


        long n=0;

        for( long i: A){
            if( x.contains(i)==true) n++;
        }


        long ans=1;
        for( long i=0; i<n;i++){
            ans= (ans*2) % (lim +7);
        }

        return ans-1;
    }


    // or ro check if n is a power of 2  n & n-1 ==0

    static Long umberOfSubsequences(int N, ArrayList<Long> A){

        long mod= 1_000_000_007;

        long n=0;

        for( long i: A){
            if( (i & (i-1))==0) n++;
        }


        return ((long)(Math.pow(2,n)%mod-1))%mod;
    }

}
