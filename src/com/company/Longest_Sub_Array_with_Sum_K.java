package com.company;

import java.util.HashMap;
import java.util.Map;

public class Longest_Sub_Array_with_Sum_K {

    //Longest Sub-Array with Sum K
    //https://practice.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1

    public static int lenOfLongSubarr (int A[], int N, int k) {


        int ans= 0;

        Map<Integer, Integer> pre= new HashMap<>();

        pre.put(0,-1);

        int sum=0;
        for( int i=0; i<N ; i++){
            sum+=A[i];

            if(pre.containsKey(sum-k)==true){

                ans= Math.max(i-pre.get(sum-k), ans);
            }

            if(pre.containsKey(sum)==false){
                pre.put(sum, i);
            }


        }

        return ans;

    }

}
