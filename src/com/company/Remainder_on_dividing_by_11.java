package com.company;

public class Remainder_on_dividing_by_11 {

    //Remainder on dividing by 11
    //https://practice.geeksforgeeks.org/problems/aa8c89caad6b5c3a76ba5e6d65454f77aac3f3543526/1

    static int xmod11(String x)
    {

        int n= x.length();

        int cur=x.charAt(0)-'0';

        for( int i=1; i<n; i++){

            cur= cur *10 + x.charAt(i)-'0';

            cur%=11;
        }
        return cur;

    }
}
