package com.company;

import java.util.Arrays;

public class No_of_inversions {

    int method1(int[] arr, int length){

        int ans=0;

        for( int i =0; i<length-1; i++){
            for( int j=i+1;j<length;j++){
                if( arr[i]>arr[j]){
                    ans++;
                }
            }
        }

        return ans;
    }


    int noInInversions(int[] arr, int l, int h){

        int ans=0;
        if(l<h){
            int mid= l+(h-l)/2;

            ans+=noInInversions(arr, l,mid);
            ans+= noInInversions(arr, mid+1, h);
             ans+= merge(arr, l, h,mid);
        }
        return ans;

    }

    private int merge(int[] arr, int l, int h, int mid) {


        int[] left = Arrays.copyOfRange(arr, l, mid);
        System.out.println(Arrays.toString(left));

        int[] right= Arrays.copyOfRange(arr,mid,h);
        System.out.println(Arrays.toString(right));

        int noOfInversions=0;

        int i=0, j=0, indexOfMainArr=l ;
        while (i<left.length && j<right.length){

            if( right[i]>=left[j]){

                arr[indexOfMainArr++]= left[i++];
            }
            else {
                arr[indexOfMainArr++]=right[j++];
                noOfInversions+=(mid + 1) - (l + i);
               // noOfInversions+=left.length-i;
            }

            while (i<left.length){
                arr[indexOfMainArr++]= left[i++];
            }
            while (j<right.length){
                arr[indexOfMainArr++]=right[j++];
            }
        }

        return noOfInversions;
    }
}
