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

    static long inversionCount(long arr[], long N)
    {


        return noInInversions(arr, 0, (int)N-1);
    }


    static long noInInversions(long[] arr, int l, int h){

        long ans=0;
        if(l<h){
            int mid= (l+(h-l)/2);

            ans=(ans+noInInversions(arr, l,mid));
            ans= (ans+noInInversions(arr, mid+1, h));
            ans= (ans+merge(arr, l, h,mid));
        }
        return ans;

    }

    static private long merge(long[] arr, int l, int h, int mid) {

//        long[] left = Arrays.copyOfRange(arr, l, mid+1);
        // System.out.println(Arrays.toString(left));

        long[] left = Arrays.copyOfRange(arr, l, mid+1);
        // System.out.println(Arrays.toString(left));

        long[] right= Arrays.copyOfRange(arr,mid+1,h+1);
        //System.out.println(Arrays.toString(right));

        long noOfInversions=0;

        int i=0, j=0, indexOfMainArr=l ;
        while (i<left.length && j<right.length){

            if( right[j]>=left[i]){

                arr[indexOfMainArr++]= left[i++];
            }
            else {
                arr[indexOfMainArr++]=right[j++];
                //noOfInversions+=(mid + 1) - (l + i);
                noOfInversions=(noOfInversions+left.length-i);
            }
        }
        while (i<left.length){
            arr[indexOfMainArr++]= left[i++];
        }
        while (j<right.length){
            arr[indexOfMainArr++]=right[j++];
        }

        return noOfInversions;
    }
}
