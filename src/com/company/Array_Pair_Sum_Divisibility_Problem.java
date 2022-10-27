package com.company;

import java.util.HashMap;
import java.util.Map;

public class Array_Pair_Sum_Divisibility_Problem {

    //Array Pair Sum Divisibility Problem
    //https://practice.geeksforgeeks.org/problems/array-pair-sum-divisibility-problem3257/1

    public boolean canPair(int[] nums, int k) {

        Map<Integer, Integer> m=new HashMap<>();

        for( int i: nums){
            int r= i%k;

            if( m.containsKey(r)){
                m.put(r, m.get(r)-1);

                if(m.get(r)==0) m.remove(r);

            }
            else {
                m.put( r, m.getOrDefault(r,0)+1);
            }

        }
        return m.size()==0;



    }
}
