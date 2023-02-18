package com.company;

public class Apple_Sequences {

    //Apple Sequences
    //https://practice.geeksforgeeks.org/problems/38f100615d0b2efa755e7b07f905e0f8cd2fe5df/1

    public static int appleSequence(int n, int m, String arr){

        int ans=0, j=0;

        for( int i=0; i<n; i++){

            if( arr.charAt(i)=='O') m--;

            while( m<0){
                if( arr.charAt(j++)=='O')m++;
            }

            ans= Math.max(i-j+1, ans);

        }


        return ans;
    }
}
