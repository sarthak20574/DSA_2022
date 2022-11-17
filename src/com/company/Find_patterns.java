package com.company;

import java.util.Arrays;

public class Find_patterns {

    //Find patterns
    //https://practice.geeksforgeeks.org/problems/find-patterns0606/1
    // can see sgar malhotrs'a vid

    static int numberOfSubsequences(String s, String w){

        int ans=0;

        int n= s.length(), m= w.length();

        boolean[] used=new boolean[n];
        Arrays.fill( used, false);

        int k=0;

        for( int i=0; i< n; i++){
            k=0;
            for( int j=i; j<n; j++){

                if(  used[j] ==false && s.charAt(j)== w.charAt(k)) {
                    used[j]=true;
                    k++;
                    if( k==m) {
                        ans++;
                        break;

                        // k=0 then?

                    }
                }
            }

        }




        return ans;
    }
}
