package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Reordered_Power_of_2 {

    //869. Reordered Power of 2
    //https://leetcode.com/problems/reordered-power-of-2/
    //https://www.youtube.com/watch?v=PBf1qzkN6z8&ab_channel=AlgorithmsMadeEasy

    public boolean reorderedPowerOf2(int n) {

        // get the n's digits freq array and then the digits freq array of all the powers of 2 in the given range and check if they are equal

        int[] n_arr= fn( n);


        // 2^x= 10^9 => x= log( 10^9)/ log(2)= 29.89 so iterate from 0 to 30 and compare the digit count array

        int x=1;
        for( int i=0; i<30; i++){


            if( Arrays.equals(n_arr,fn( x))){
                return true;
            }
            x=x<<1;   // x= x * 2

        }

        return false;

    }


    int[] fn(int n){

        int r[]=new int[10];

        while( n>0){
            r[n%10]++;
            n/=10;
        }

        return r;
    }
}
