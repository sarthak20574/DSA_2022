package com.company;

import java.util.Arrays;

public class Composite_and_Prime {
    //Composite and Prime
    //https://practice.geeksforgeeks.org/problems/composite-and-prime0359/1

    public int Count(int L, int R)
    {
        boolean[] p= new boolean[R+1];

        Arrays.fill(p, true);

        p[0]=p[1]=false;

        for(int i=2; i<R+1; i++){

            if( p[i]==true){

                for( int j=i+i; j<R+1; j+=i){
                    p[j]=false;
                }
            }
        }


        int primes=0, com=0;

        for( int k=L; k<=R; k++){

            // 1 is neighter primes nor composite so skip

            if( k==1)continue;

            if( p[k]==true)primes++;
            else com++;
        }

        return com- primes;
    }
}
