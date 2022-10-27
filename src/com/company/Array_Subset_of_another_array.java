package com.company;

import java.util.HashMap;
import java.util.Map;

public class Array_Subset_of_another_array {

    //Array Subset of another array
    //https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/1

    public String isSubset( long a1[], long a2[], long n, long m) {

        Map<Long , Long> m1= new HashMap<>();

        for( long i: a1){
            m1.put(i,m1.getOrDefault(i,0L)+1);
        }


        for( long i: a2){
            m1.put(i,m1.getOrDefault(i,0L)-1);

            if(m1.get(i)==-1) return "No";
        }

        return "Yes";

    }


}
