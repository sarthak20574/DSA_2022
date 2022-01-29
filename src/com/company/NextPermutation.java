package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextPermutation {

    // 123 -> 132
    //321 -> 123  02 just retunr an empty araay
    //152 -> 215

    // a stricly decreasing section is on its last permuatation....in 6215430...here 5430 is decreaing so modulate 1
    // we ahve a choice of 0 1 3 4 5 , 0 < 1(therfore already chosen) choose the next greatest item
    // now swap 1 and 3 so that 3 gets its placement if its the last permutation then change this decreasign
    //to strictly increasing or just reverse the sublist


    //find the first index while transversing from the back where a[i]<a[i+1] in 13542 its index 1
    // linear traversal from back and find an index greater than the index chosen, 1 in this case, use binary search
    // swap those values
    //reverse everything to index of i+1


    static List<Integer> nextPermutation(int N, int arr[]){

        List<Integer> integerList= new ArrayList<>();
        int i=N-2;
        for(; i>=0; i--){
            if( arr[i+1]>arr[i]) break;
        }

        if( i==-1){
            int a=0, b= N-1;

            while (a<=b){

                int t= arr[a];
                arr[a]=arr[b];
                arr[b]=t;

                a++;
                b--;
            }
        }
        else {

            //arr[i]= Arrays.binarySearch
            int j=N-1;
            for(  ; j>i; j--){
                if( arr[i]<arr[j]) break;
            }
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;


            //nice way to reverse an array

            int a=i+1, b=N-1;
            while(a<=b){

                int t= arr[a];
                arr[a]=arr[b];
                arr[b]=t;
                a++;b--;
            }

        }

        for( int x:arr){
            integerList.add(x);
        }

        System.out.println(Arrays.toString(arr));

        return integerList;

    }
}
