package com.company.LeetCode_DailyChallenge;

public class Wine_Buying_and_Selling {

    //Wine Buying and Selling
    //https://practice.geeksforgeeks.org/problems/wine-buying-and-selling/1

    long wineSelling(int arr[],int n){


        long ans=0;
        long cur=arr[0];
        for( int i=1; i<n; i++){
            ans += Math.abs( cur);

            cur+=arr[i];
        }

        return ans;
    }
}
