package com.company;

public class Fibonacci_with_DP {

    // take a look at this too and do it in log(n)

    static int[] arr;

    static void initialize(int n){

        arr= new int[n];
    }

    static public int fib(int n){
        initialize(n+1);

        arr[0]=0;

        if( n+1>2)
        arr[1]=1;

        for( int i=2 ; i<=n; i++){
            arr[i]= arr[i-1]+ arr[i-2];
        }
        return arr[n];

    }


}
