package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Modified_Numbers_and_Queries {

    //Modified Numbers and Queries
    //https://practice.geeksforgeeks.org/problems/modified-numbers-and-queries0904/1

    public int sumOfAll(int l, int r)
    {
        boolean[] sieve= new boolean[r+1];

        Arrays.fill( sieve, true);

        for( int i=2; i<r+1; i++){

            if( sieve[i]==true)
                for( int j=i+i; j<r+1; j+=i){
                    sieve[j]=false;
                }
        }


        List<Integer> nos= new ArrayList<>();

        for( int i=2; i<r+1; i++){
            if( sieve[i]==true)nos.add(i);
        }
        //System.out.println( Arrays.toString(sieve));

        int ans=0;
        for( int i=l; i<r+1; i++){

            if( i==1){
                ans++;
                continue;
            }
            for( int j=0; j< nos.size(); j++){
                if( i>=nos.get(j) && i %nos.get(j)==0){
                    // System.out.println(i+": "+nos.get(j));
                    ans+=nos.get(j);
                }
            }
        }

        return ans;
    }
}
