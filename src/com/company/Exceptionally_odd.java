package com.company;

public class Exceptionally_odd {

    //Exceptionally odd
    //https://practice.geeksforgeeks.org/problems/find-the-odd-occurence4820/1
    int getOddOccurrence(int[] arr, int n) {

        int ans=0;
        for( int i : arr){
            ans= ans ^ i;
        }

        return ans;
    }
}
