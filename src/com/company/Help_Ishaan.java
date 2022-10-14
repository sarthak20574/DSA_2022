package com.company;

public class Help_Ishaan {

    //Help Ishaan
    //https://practice.geeksforgeeks.org/problems/help-ishaan5837/1


    boolean isPrime(int x ){

        if( x==1) return false;
        else if ( x==2|| x==3) return true;



        for( int i=2; i*i<=x; i++){
            if( x%i==0) return false;
        }
        return true;

    }

    public int NthTerm(int N){

        int a= N, b=N;

        while(a>0  || b<1000000){

            if( a!=0 && isPrime(a)==true)
                return N-a;

            if( isPrime(b)==true)
                return b-N;

            a--;
            b++;
        }

        return -1;
    }
}
