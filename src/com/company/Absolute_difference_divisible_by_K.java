package com.company;

import java.util.HashMap;
import java.util.Map;

public class Absolute_difference_divisible_by_K {

//Absolute difference divisible by K
//https://practice.geeksforgeeks.org/problems/e0059183c88ab680b2f73f7d809fb8056fe9dc43/1

    static long countPairs(int n, int[] arr, int k) {
        Map<Integer, Integer> m= new HashMap<>();

        int ans=0;

        for( int i: arr){
            ans+=m.getOrDefault(i%k, 0);
            m.put( i%k,m.getOrDefault(i%k, 0) +1);
        }

        return ans;
    }
}
