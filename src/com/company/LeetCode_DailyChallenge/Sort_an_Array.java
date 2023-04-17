package com.company.LeetCode_DailyChallenge;

public class Sort_an_Array {

    //912. Sort an Array
    //https://leetcode.com/problems/sort-an-array/description/

    public int[] sortArray(int[] nums) {

        fn( nums, 0, nums.length-1);

        return nums;
    }


    void fn(int[] nums, int low, int high){

        // base case one element or 2 elements left
        if( low==high){
            return;
        }
        else if ( high-low==1){
            if( nums[low]> nums[high]){

                int t= nums[low];
                nums[low]= nums[high];
                nums[high]= t;
            }
            return;
        }
        int mid= low + (high-low)/2;
        fn( nums, low, mid);
        fn( nums, mid+1, high);

        merge( nums, low, mid, high);
    }


    void merge(int[] nums, int low, int mid, int high){

        int i=low, j=mid+1;

        int[] ret= new int[high-low+1];
        int k=0;

        while( i<=mid && j<=high){

            if( nums[i]<=nums[j]){
                ret[k++]=nums[i++];
            }
            else{
                ret[k++]=nums[j++];
            }
        }

        while( i<=mid){
            ret[k++]=nums[i++];
        }

        while( j<=high){
            ret[k++]=nums[j++];
        }


        for( int ii=0, cur=low; cur<=high; cur++, ii++){
            nums[cur]=ret[ii];
        }
    }


}
