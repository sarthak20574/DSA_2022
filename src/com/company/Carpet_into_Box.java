package com.company;

public class Carpet_into_Box {

    //Carpet into Box
    //https://practice.geeksforgeeks.org/problems/230d87552a332a2970b2092451334a007f2b0eec/1

    int carpetBox(int a, int b, int c, int d) {

        return Math.min(fn( a,b,c,d), fn(b,a,c,d));
    }

    int fn( int a, int b, int c, int d){

        int ans=0;

        while( a>c){
            a/=2;
            ans++;
        }

        while( b>d){
            b/=2;
            ans++;
        }

        return ans;
    }


}
