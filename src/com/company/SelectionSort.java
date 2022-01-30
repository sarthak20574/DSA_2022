package com.company;

public class SelectionSort {

    // find the minimum element and swap it with the element in its position or push it to the starting

    void selectionSort( int[] arr, int length){

        for( int i=0; i< length-1; i++){
            int min_index= i;
            for( int j=i+1;j<length; j++){

                if( arr[min_index]>arr[j]){
                    min_index=j;
                }

            }

            int temp= arr[i];
            arr[i]= arr[min_index];
            arr[min_index]=temp;

        }
    }
}
