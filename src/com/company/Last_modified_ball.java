package com.company;

public class Last_modified_ball {

    //Last modified ball
    //https://practice.geeksforgeeks.org/problems/33af95e5935f1f2a0c3f5083c4b9d0db68e97bd4/1

    int solve(int n, int[] a) {


        // 1 9 9 9 1
        //9 9 9 9 9

        int i=n-1;

        while( i>=0 && a[i]==9){
            i--;
        }

        return i+1;
    }
}
