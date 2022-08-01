package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Count_of_Smaller_Numbers_After_Self {

    //315. Count of Smaller Numbers After Self
    //https://leetcode.com/problems/count-of-smaller-numbers-after-self/
    //https://www.youtube.com/watch?v=_sA1xI4XK0c&ab_channel=AyushiSharma


    /*
    we implement the standard merge sort in descending order but while merging whenever we find that the right element is greater than the element on the left then all the numbers to the right of the right element would be smaller than our left element we add end-j+1 to our answer array at index of the left element.

we create an array of indices and sort the array of iundices, instead of sorting the given numbers.
     */

    public List<Integer> countSmaller(int[] x) {

        int n= x.length;
        int indices[]= new int[n];

        for( int i=0; i<n ; i++){
            indices[i]=i;
        }

        List<Integer> ans= new ArrayList<>();

        for( int i=0; i<n; i++){
            ans.add(0);
        }

        divide( indices, 0, indices.length-1, ans, x);
        return ans;

    }


    void divide(int[] indices, int beg, int end, List<Integer> ans, int[] x){


        if( beg<end){// <= ?
            int mid= (beg+end)/2;
            divide( indices, beg, mid, ans, x);
            divide( indices, mid+1, end, ans, x);

            merge(indices, beg, mid, end, ans, x);
        }


    }

    void merge( int[] indices, int beg, int mid, int end,
                List<Integer> ans, int[] nums){


        int arr[]=new int[end-beg+1];

        int i=beg, j=mid+1, k=0;
        while( i<=mid && j<=end){
            if(nums[indices[i]]>nums[indices[j]]){
                ans.set(indices[i], ans.get(indices[i])+end-j+1);
                arr[k++]= indices[i++];
            }
            else{
                arr[k++]= indices[j++];
            }

        }

        while( i<=mid){
            arr[k++]= indices[i++];
        }
        while( j<=end){
            arr[k++]= indices[j++];
        }

        for( i=beg, j=0; i<=end; i++, j++){
            indices[i]=arr[j];
        }
    }


}
