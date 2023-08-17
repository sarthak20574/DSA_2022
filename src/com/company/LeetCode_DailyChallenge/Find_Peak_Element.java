package com.company.LeetCode_DailyChallenge;

public class Find_Peak_Element {

    //162. Find Peak Element
    //https://leetcode.com/problems/find-peak-element/description/

    int ans;
    public int findPeakElement(int[] nums) {


        int n= nums.length, beg=0,end=n-1, mid;
        ans=-1;

        if( n==1) return 0;
        else if( n==2)return (nums[0]>nums[1]?0:1);


        fn( beg, end, nums, n);

        return ans;

    }

    //7/2= 3   1<3
    void fn(int beg, int end, int[] nums, int n){
        int mid;

        if( beg>end) return;

        mid= beg+(end-beg)/2;


        if( mid-1>=0 && mid+1<n && nums[mid-1]< nums[mid] &&  nums[mid]> nums[mid+1]){
            ans= mid;
            return;
        }

        if( mid-1>=0 && mid+1>=n && nums[mid-1]< nums[mid] ){
            ans= mid;
            return;
        }

        if( mid-1<0 && mid+1<n && nums[mid]> nums[mid+1] ){
            ans= mid;
            return;
        }


        if( mid-1>=0 ){
            if(nums[mid-1]< nums[mid]){
                fn( mid+1, end, nums, n);
            }
            else {//if( nums[mid-1]>nums[mid])
                fn( beg, mid-1, nums, n);
            }
        }
        else{
            if(nums[mid+1]> nums[mid]){
                fn( mid+1, end, nums, n);
            }
            else {
                fn( beg, mid-1, nums, n);
            }
        }

    }



}
