package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Minimize_the_Maximum_Difference_of_Pairs {


    public int minimizeMax(int[] nums, int p) {

        Arrays.sort(nums);
        int n= nums.length;

        if( n<2) return 0;


        int beg= 0, end=nums[n-1]- nums[0], mid, ans=end;

        while( beg<=end){
            mid= beg+ ( end-beg)/2;

            if( fn( nums, mid, p)){
                ans= mid;
                end= mid-1;
            }
            else{
                beg= mid+1;
            }
        }

        return ans;

    }

    boolean fn(int[] nums, int mid, int p ){


        int i=0;

        while( i+1<nums.length){

            if( nums[i+1]- nums[i]<=mid){
                i+=2;
                p--;
                if( p==0) break;
            }
            else{
                i++;
            }

        }

        return p<=0;
    }


}
