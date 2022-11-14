package com.company;

import java.util.Arrays;

public class Primes_sum {

    //Primes sum
    //https://practice.geeksforgeeks.org/problems/primes-sum5827/1

    static String isSumOfTwo(int N){


        boolean[] sie= new boolean[N+1];
        Arrays.fill( sie, true);
        sie[0]=false;
        sie[1]=false;

        for(int i=2; i<N+1; i++){

            if( sie[i]==true){
                for( int j=i+i;j<N+1; j+=i){
                    sie[j]=false;
                }
            }

        }

        for( int j=0; j<N+1; j++){
            if( sie[j]==true){
                if( sie[N-j]==true){
                    return "Yes";
                }
            }
        }
        return "No";


    }

}
