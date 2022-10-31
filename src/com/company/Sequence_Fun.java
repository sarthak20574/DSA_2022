package com.company;

public class Sequence_Fun {

    //Sequence Fun
    //https://practice.geeksforgeeks.org/problems/sequence-fun5018/1

    long NthTerm(int n){

        long ans=2;
        long mod= 1000000007;

        for( int i=2; i<=n; i++){

            ans= ((ans*i) % mod +1)%mod;
        }
        return ans;
    }

}
