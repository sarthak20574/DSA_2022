package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Find_Number {

    public long findNumber(long n)
    {
        long[] cur= {1,3,5,7,9};
        if( n<=5){
            return cur[(int) (n-1)];
        }

        Queue<Long> q= new LinkedList<>();

        long cur_count=5;
        for( long x: cur){
            q.add(x);
        }

        while (true){

            long x= q.poll();
            for( long nn: cur){
                long new_n= x*10+nn;
                q.add(new_n);
                cur_count++;
                if( cur_count==n)return new_n;
            }
        }
    }



}
