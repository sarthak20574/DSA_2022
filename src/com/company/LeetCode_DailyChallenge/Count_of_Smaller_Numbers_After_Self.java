package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Count_of_Smaller_Numbers_After_Self {


    //315. Count of Smaller Numbers After Self
    //
    //

    public List<Integer> countSmaller(int[] nums) {

        List<Integer> ans= new ArrayList<>(nums.length);
        divide( nums, 0, nums.length-1, ans);
        return ans;

    }


    void divide(int[] nums, int beg, int end, List<Integer> ans){

        int mid= (beg+end)/2;

        divide( nums, beg, mid, ans);
        divide( nums, mid+1, end, ans);

        merge(nums, beg, mid, end, ans);

    }

    void merge( int[] nums, int beg, int mid, int end, List<Integer> ans){


        int arr[]=new int[end-beg+1];

        int i=beg, j=mid+1, k=0;
        while( i<=mid && j<=end){
            if(nums[i]>nums[j]){
                ans.set(i,ans.get(i)+end-j+1);
                arr[k++]= nums[i++];
            }
            else{
                arr[k++]= nums[j++];
            }

        }

        while( i<=mid){
            arr[k++]= nums[i++];
        }
        while( j<=end){
            arr[k++]= nums[j++];
        }

        for( i=beg, j=0; i<=end; i++, j++){
            nums[beg]=arr[j];
        }


    }

}
