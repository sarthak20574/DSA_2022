package com.company;

public class Set_kth_bit {

    //Set kth bit
    //https://practice.geeksforgeeks.org/problems/set-kth-bit3724/1

    static int setKthBit(int n,int k){

        int raised_to_k= 1<<k;// left shift

        return n | raised_to_k;

    }

}
