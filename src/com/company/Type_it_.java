package com.company;

public class Type_it_ {

    //Type it!
    //https://practice.geeksforgeeks.org/problems/95080eb9efbf7cc5cb4851ddf8d7946e3f212a49/1

    int minOperation(String s) {

        int n= s.length();
        int j= n/2;
        int ans=0;


        if( n%2==1) ans++;

        while( j>0){
            if( s.substring(0,j).equals(s.substring(j, 2*j))){
                // System.out.println( s.substring(0,j));
                return 1+ j + ans;
            }
            j--;
            ans+=2;
        }
        return ans;
    }
}
