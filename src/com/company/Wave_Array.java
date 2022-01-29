package com.company;

import java.util.Arrays;

public class Wave_Array {
    //arrange the sorted elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5]
    //arr[] = {1,2,3,4,5}   2 1,4 3,5
    //Output: 2 1 4 3 5
    // swap ith and i+1th element then i=+2 and so on till <n-1

    public static void convertToWave(int arr[], int n){

        for (int i= 0 ; i<n-1;i++){
            int temp= arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
    public static void unsortedArrayWave(int arr[], int n){
        //we make sure that all even positioned (at index 0, 2, 4, ..) elements are
        // greater than their adjacent odd elements, we don’t need to worry about odd
        // positioned element. Following are simple steps.
        //1) Traverse all even positioned elements of input array, and do following.
        //a) If current element is smaller than previous odd element, swap previous and current.
        //b) If current element is smaller than next odd element, swap next and current.

        for( int i=0; i< n; i+=2){
            if (i>0 && arr[i]<arr[i-1]){
                swap(arr, i, i-1);
                System.out.println("in");
            }
            if( i <n-1 && arr[i]<arr[i+1]){
                swap(arr, i, i+1);
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int x, int y) {
        int temp= arr[x];
        arr[x]= arr[y];
        arr[y]=temp;
    }
}
