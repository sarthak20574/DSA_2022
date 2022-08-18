package com.company;

import java.util.Arrays;

public class Max_length_chain {

    //Max length chain
    //https://practice.geeksforgeeks.org/problems/max-length-chain/1
    //https://www.youtube.com/watch?v=v0D3HtS8GAg&ab_channel=CodeLibrary-byYogesh%26Shailesh

    //https://youtu.be/AP2TODJBhEI?t=131
    // why for dp you are sorting....for 10,15  5,6  8,9...
    //longest is 5,6 8,9 10,15 so we have to go back ans then front too
    // so sort and then only see the front


    class Pair
    {
        int x;
        int y;

        public Pair(int a, int b)
        {
            x = a;
            y = b;
        }
    }
    int maxChainLength(Pair arr[], int n)
    {

        //sort by ending time
        Arrays.sort( arr, (a, b)->a.y-b.y);

        int ans=1;

        int i=0,j=1;

        while( j!=n){

            if( arr[i].y<arr[j].x){
                ans++;
                i=j;
                j++;
            }
            else{
                j++;
            }
        }
        return ans;



    }

    /*
    int maxChainLength(Pair arr[], int n)
    {

        Arrays.sort( arr, (a,b)->a.y-b.y);


        int ans=1;
        int[] dp= new int[n];


        Arrays.fill( dp, 1);


        for( int i=0; i<n; i++){
            for( int j=0; j<i; j++){
                 if( arr[j].y<arr[i].x){
                dp[i]= Math.max(dp[i], 1+ dp[j]);
                ans= Math.max(dp[i], ans);
            }
            }
        }

        return ans;

    }

    */
}
