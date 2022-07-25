package com.company.LeetCode_DailyChallenge;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {

    //34. Find First and Last Position of Element in Sorted Array
    //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    //https://www.youtube.com/watch?v=4sQL7R5ySUU&ab_channel=NeetCode

    public int[] searchRange(int[] nums, int target) {


        int left=-1;
        int beg= 0, end= nums.length-1;

        while(beg<=end){

            int mid= (beg+end)/2;

            if( nums[mid]== target){
                left= mid;
                end= mid-1;
            }
            else if( nums[mid]< target){
                beg= mid+1;
            }
            else{
                end= mid-1;
            }
        }

        int right=-1;
        beg= 0;
        end= nums.length-1;

        while(beg<=end){

            int mid= (beg+end)/2;

            if( nums[mid]== target){
                right= mid;
                beg= mid+1;
            }
            else if( nums[mid]< target){
                beg= mid+1;
            }
            else{
                end= mid-1;
            }
        }

        return new int[]{left, right};
    }
}
