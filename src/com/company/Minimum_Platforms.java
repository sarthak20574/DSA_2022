package com.company;

import java.util.Arrays;

public class Minimum_Platforms {

    //Minimum Platforms
    //https://www.youtube.com/watch?v=38JLfQGVlkw&ab_channel=TECHDOSE
    //https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620/1#

    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort( dep);

        int i=0, j=0;
        int ans=1;
        int req_present=0;

        while( i<n && j<n){
            if( dep[j]>=arr[i]){
                req_present++;
                i++;
                ans= Math.max( req_present,ans );
            }
            // for equal too we need a new platform
            else{
                req_present--;
                j++;
            }
        }

        return ans;

    }
}
