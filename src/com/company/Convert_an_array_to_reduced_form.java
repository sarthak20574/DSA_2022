package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Convert_an_array_to_reduced_form {

    void convert(int[] arr, int n) {

        int[] arr1= Arrays.copyOf(arr, arr.length);
        Map<Integer, Integer> m= new HashMap<>();
        Arrays.sort(arr1);

        for(int i=0; i<n; i++){
            m.put(arr1[i], i);
        }

        for( int i=0; i<n; i++){

            arr[i]= m.get(arr[i]);
        }
    }
}
