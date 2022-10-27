package com.company;

public class Missing_number_in_array {

    //https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1

    int MissingNumber(int array[], int n) {
        int ans=0;

        for( int i=1; i<=n; i++){
            ans= ans ^ i;
        }

        for( int i: array){
            ans= ans^i;
        }

        return ans;
    }
}
