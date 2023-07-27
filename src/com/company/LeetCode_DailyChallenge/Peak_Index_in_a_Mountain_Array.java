package com.company.LeetCode_DailyChallenge;

public class Peak_Index_in_a_Mountain_Array {

    //852. Peak Index in a Mountain Array
    //https://leetcode.com/problems/peak-index-in-a-mountain-array/

    public int peakIndexInMountainArray(int[] arr) {


        int n= arr.length,mid, i=0, j=n-1, ans=0;

        while(i<j){

            mid= i+ (j-i)/2;

            //if(mid!=0){
            //if( )

            if( arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]) return mid;
            else if( arr[mid-1] < arr[mid]){
                ans=mid;
                i=mid+1;
                // System.out.println(" 1."+arr[mid]);
            }
            else{
                ans= mid-1;
                j=mid;
                // System.out.println(arr[mid-1]);
            }

            //  }


        }

        return -1;
    }

}
