package com.company;

import java.util.Map;
import java.util.TreeMap;

public class merge2sortedarrayswithoutusinganyspace {

    public void map_method(long arr1[], long arr2[], int n, int m){
        // time:   space: O(n)
        Map<Long,Boolean> mp= new TreeMap<Long, Boolean>();

        for(int i=0; i<n; i++){
            mp.put(arr1[i], true);
        }
        for (int i=0 ; i< m ; i++){
            mp.put(arr2[i], true);
        }

        for( Map.Entry<Long,Boolean> me: mp.entrySet()){
            System.out.println(me.getKey()+" ");
        }

    }

}
