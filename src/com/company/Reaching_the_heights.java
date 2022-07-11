package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Reaching_the_heights {

    //Reaching the heights
    // the biggest elements at the odd postioon
    //and the samllest elements at the even postion

    //https://www.youtube.com/watch?v=ieGcr09vCEU&ab_channel=StudywithSaumya

    public static ArrayList<Integer> reaching_height (int n, int arr[]) {
        ArrayList<Integer> ans= new ArrayList<>();

        Arrays.sort( arr);

        int baby=0, old=n-1;

        if( n==1){
            ans.add( arr[0]);
            return ans;
        }
        if( arr[baby]==arr[old]){
            ans.add( -1);
            return ans;
        }

        while( baby<=old){
            ans.add( arr[old]);
            ans.add(arr[baby]);
            old--;
            baby++;
        }

        // for odd length array we will be adding the same element twice
        if( n%2==1)ans.remove(n);

        return ans;

    }


}
