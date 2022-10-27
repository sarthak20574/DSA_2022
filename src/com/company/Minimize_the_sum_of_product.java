package com.company;

import java.util.Arrays;

public class Minimize_the_sum_of_product {

    //Minimize the sum of product
    //https://practice.geeksforgeeks.org/problems/minimize-the-sum-of-product1525/1


    public long minValue(long a[], long b[], int n)
    {


        Arrays.sort( a);

        Arrays.sort(b);

        long ans=0;

        for( int i=0, j=n-1; i<n; i++, j--){
            ans+= a[i]*b[j];
        }

        return ans;

    }

}
