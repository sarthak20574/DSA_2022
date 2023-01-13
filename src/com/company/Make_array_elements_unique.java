package com.company;

import java.util.HashSet;
import java.util.Set;

public class Make_array_elements_unique {

    //Make array elements unique
    //https://practice.geeksforgeeks.org/problems/6e63df6d2ebdf6408a9b364128bb1123b5b13450/1
    public long minIncrements(int[] arr, int N) {
        Set<Long> x=new HashSet<>();

        long ans=0;
        for( int i: arr){

            long c= i;
            while( x.contains(c)==true){
                c++;
                ans++;
            }
            x.add(c);
        }
        return ans;

    }
}
