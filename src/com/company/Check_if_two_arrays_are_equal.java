package com.company;

import java.util.HashMap;
import java.util.Map;

public class Check_if_two_arrays_are_equal {
    public static boolean check(long A[],long B[],int N) {
        //use hashing. We store all elements of arr1[] and their counts
        // in a hash table. Then we traverse arr2[] and check if the count
        // of every element in arr2[] matches with the count in arr1[].

        Map<Long,Long> map= new HashMap<>();

        for( int i=0 ; i< N; i++){
            if( map.get(A[i])==null){
                map.put(A[i], 1L);
            }
            else {
                map.put(A[i], map.get(A[i])+1);
            }
        }

        for (int i=0; i<N; i++){
            if( !map.containsKey(B[i])){
                return false;
            }
            map.put(B[i],map.get(B[i])-1);
            if( map.get(B[i])==-1){
                return false;
            }

        }

        return true;
    }

}
