package com.company.LeetCode_DailyChallenge;

public class Elements_in_the_Range {

    //Elements in the Range
    //https://practice.geeksforgeeks.org/problems/elements-in-the-range2834/1
    //https://www.youtube.com/watch?v=OnXHL5miGNk&ab_channel=SagarMalhotra

    boolean check_elements(int arr[], int n, int A, int B)
    {

        if(B-A>=n)return false;
        for( int i=0; i<n; i++){
            //System.out.println(arr[i]);
            if( A<= Math.abs(arr[i]) && Math.abs(arr[i])<=B){
                //System.out.println(arr[i]);
                //System.out.println(arr[i]-A+" "+ arr[i]);
                arr[ Math.abs(arr[i])-A]= -Math.abs(arr[ Math.abs(arr[i])-A]);

            }
        }


        for( int i=0; i<=B-A; i++){
            //System.out.println(arr[i]);
            if( arr[i]>0) return false;
        }
        return true;
    }
}
