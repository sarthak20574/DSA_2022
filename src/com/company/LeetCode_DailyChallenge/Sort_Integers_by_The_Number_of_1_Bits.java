package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort_Integers_by_The_Number_of_1_Bits {

    //1356. Sort Integers by The Number of 1 Bits
    //https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/description/

    public int[] sortByBits(int[] arr) {

        int n=arr.length;
        int[][] bits= new int[n][2];

        for( int i=0; i<n; i++){

            int x= arr[i], cur=0;
            while( x>0){
                x= x & (x-1);
                cur++;
            }

            bits[i][0]= cur;
            bits[i][1]= i;
        }

        Arrays.sort(bits, (a, b)->a[0]==b[0]?arr[a[1]]-arr[b[1]]:a[0]-b[0]);

        int[] ans= new int[n];

        int c=0;
        for( int[] i: bits){
            ans[c++]=arr[i[1]] ;
        }

        return ans;
    }

}
