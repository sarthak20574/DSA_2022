package com.company;

import java.util.Arrays;

public class Maximum_Triplet_product {

    //Maximum Triplet product
    //https://practice.geeksforgeeks.org/problems/d54c71dc974b7db3a200eb63f34e3d1cba955d86/1

    Long maxTripletProduct(Long arr[], int n) {
        // - - +
        // + + +

        // can have an array all negatives too

        //  - - - the product of largest element


        long ans=1;
        Arrays.sort(arr);

        ans= Math.max(arr[1] * arr[n-1] * arr[0], arr[n-1] * arr[n-2] * arr[n-3]);
        return ans;
    }
}
