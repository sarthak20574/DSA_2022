package com.company;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class merge2sortedarrayswithoutusinganyspace {

    // https://www.youtube.com/watch?v=hVl2b3bLzBw

    // 1 4 7 8 10 and 2 3 9 i and j on the first element of the 2 sorted arrays if ele at i< ele at j,increment i
    // now i<j is false therfore swap them 1 2 7 8 10 and 4 3 9 and now to make the second one sorted again we
    // insert 4 in its appropriate position(like in insertion sort) 1 2 7 8 10 and 3 4 9....O(n*m)


    //better solution
    //  in 1 4 7 8 10 and 2 3 9 we want 1 2 3 4 7 and 8 9 10, so we see that the last element of the first
    // array is smaller than every element of the second array, and since its sorted so just grab the last element
    // of the first array and catch all element
    // so if {1, 3, 5, '7'} and {'0', 2, 6, 8, 9} the compare the if not in order or arr1[last_ele] < arr2[first element]
    // then swap and increment last_element-- and first element++,
    //{1, 3, '5', 0} and {7, '2', 6, 8, 9}
    //{1, '3', 2, 0} and {7, 5, '6', 8, 9} now its fine
    // and since its already sorted rest of the things will be in order
    // just sort both the arrays

    void merge(int arr1[], int arr2[], int n, int m) {

        int i=n-1, j=0;

        while (j<m && i>=0){

            if( arr1[i]>arr2[j]){

                //swap(arr1[i),arr2[j] in c++
                int tem=arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=tem;

                i--; j++;
            }
            else{
                break;
            }
        }
        Arrays.sort(arr2);// sort( arr1, arr1+n) //n=size of arr1
        Arrays.sort(arr1);// sort( arr2,arr2+m)

    }





    public void map_method(long arr1[], long arr2[], int n, int m){
        // time:   space: O(n)
        Map<Long,Boolean> mp= new TreeMap<Long, Boolean>();

        for(int i=0; i<n; i++){
            mp.put(arr1[i], true);
        }
        for (int i=0 ; i< m ; i++){
            mp.put(arr2[i], true);
        }

        for( Map.Entry<Long,Boolean> me: mp.entrySet()){
            System.out.println(me.getKey()+" ");
        }

    }

}
