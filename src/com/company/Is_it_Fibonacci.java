package com.company;

import java.util.ArrayList;

public class Is_it_Fibonacci {

    //Is it Fibonacci
    //https://practice.geeksforgeeks.org/problems/202d95ecdeec659401edc63dd952b1d37b989ab8/1

    static long solve(int n, int k, ArrayList<Long> arr) {

        // 0 1 2 3 6
        // 0 1 3 6 12


        int cur= arr.size();
        long sum=0;

        for( long i: arr){
            sum+=i;
        }

        arr.add( sum);



        for( int i=cur+1; i<=n; i++){

            arr.add(2*arr.get(i-1) - arr.get(i-k-1));

        }

        // for( long i: arr){
        //     System.out.println(i);
        // }

        // System.out.println(arr.size());



        return arr.get(n-1);
    }


}
