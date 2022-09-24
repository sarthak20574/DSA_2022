package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Find_Original_Array_From_Doubled_Array {


    //2007. Find Original Array From Doubled Array
    //https://leetcode.com/problems/find-original-array-from-doubled-array/

    public int[] findOriginalArray(int[] changed) {

        int n= changed.length;
        int[] ans= new int[n/2];

        // freq array of length 100_001
        int[] freq= new int[100_001];


        // if we have an odd number of elements then we can't divide the array in 2 equal arrays so we return an empty array
        if( n%2!=0)return new int[0];

        int i=0;

        // fill the freq array
        for( int x: changed){
            freq[x]++;
        }

        // traverse our freq array and if we find that a number x and its double(x+x) exist we delete it

        for( int k=0; k<100_001; k++){

//k+k<100_001 is just to prevent array out of bounds error

            while(freq[k]>0 && k+k<100_001 && freq[k+k]>0){
                freq[k+k]--;
                freq[k]--;
                ans[i++]= k;
            }
        }

// we now check if there are still some elements that have not been deleted if yes then just return an empty array
        for( int k=0; k<100_001; k++){
            if( freq[k]!=0) return new int[0];
        }

        return ans;
    }
}
