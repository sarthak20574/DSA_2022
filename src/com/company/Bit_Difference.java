package com.company;

public class Bit_Difference {

    //https://practice.geeksforgeeks.org/problems/bit-difference-1587115620/1

    public static int countBitsFlip(int a, int b){

        int x= a^b;
        int ans=0;

        while( x>0){

            x= x & (x-1);
            ans++;
        }
        return ans;

    }
}
