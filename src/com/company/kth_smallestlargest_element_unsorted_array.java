package com.company;

import java.util.Arrays;

public class kth_smallestlargest_element_unsorted_array {

    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        Arrays.sort(arr);
        return arr[k-1];
    }

    // using max heap method



//    public static int quickSelect(){
//
//
//    }
}
