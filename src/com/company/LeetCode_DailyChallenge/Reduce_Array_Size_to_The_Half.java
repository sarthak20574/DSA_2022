package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reduce_Array_Size_to_The_Half {

    //1338. Reduce Array Size to The Half
    //https://leetcode.com/problems/reduce-array-size-to-the-half/


    public int minSetSize(int[] arr) {


        int n= arr.length;

        Map<Integer,Integer> m= new HashMap<>();

        for( int i=0; i<n; i++){

            m.put( arr[i], m.getOrDefault(arr[i], 0)+1);
        }



        List<Integer>[] c_sort= new ArrayList[n+1];


        for( int key: m.keySet()){
            if( c_sort[m.get(key)]==null){
                c_sort[m.get(key)]=new ArrayList<>();
            }
            c_sort[m.get(key)].add(key);
        }

        int ans=0;
        int pres=0;

        for( int i=n; i>=0; i--){

            List<Integer> x= c_sort[i];
            if(x==null) continue;

            for( int no: x){
                pres+=i;
                ans++;
                if( pres>=n/2)return ans;
            }
        }
        return -1;
    }
}
