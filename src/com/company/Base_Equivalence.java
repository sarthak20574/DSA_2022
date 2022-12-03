package com.company;

public class Base_Equivalence {

    //Base Equivalence
    //https://practice.geeksforgeeks.org/problems/base-equivalence1022/1
    //https://www.youtube.com/watch?v=ChRDiNMRqd4&ab_channel=SagarMalhotra


    String baseEquiv(int n, int m)
    {

        for( int i=2 ;i<32; i++){
            if( (int)(Math.log(n)/Math.log(i))+1==m) return "Yes";
        }

        return "No";
    }
}
