package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Binary_Trees_With_Factors {

    //823. Binary Trees With Factors
    //https://leetcode.com/problems/binary-trees-with-factors/
    //https://www.youtube.com/watch?v=BRGz8ArRiPA&ab_channel=CodewithAlisha

    public int numFactoredBinaryTrees(int[] arr) {

        Map<Integer,Long> dp= new HashMap<>();
        int n=arr.length;
        long mod= 1000000007 ;
        Arrays.sort(arr);


        for( int i=0; i<n; i++) dp.put(arr[i],1L);



        for( int i=1; i<n; i++){

            for( int j=0; j<i; j++){

                if( arr[i] % arr[j]==0){


                    dp.put( arr[i], (dp.get(arr[i])+ dp.get(arr[j]) * dp.getOrDefault(arr[i]/arr[j], 0L)) %mod );
                }
            }
        }


        long ans= 0;
        for( int x: dp.keySet()){
            ans= (ans+ dp.get(x))%mod;
        }
        return (int)ans;
    }
}

