package com.company;

public class Count_set_bits_in_an_integer {
    static int setBits(int N) {
        int count=0;

        while (N>0){
            count+=N&1;
            N=N>>1;
        }
        return count;
    }
}