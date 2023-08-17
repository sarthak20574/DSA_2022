package com.company.LeetCode_DailyChallenge;

public class Remove_Element {

    //27. Remove Element
    //https://leetcode.com/problems/remove-element/

    public int removeElement(int[] nums, int val) {

        int i=0, n= nums.length, j=n-1;

        if( n==0) return 0;


        while( i<=j){

            while( i<=j &&nums[i]!=val)i++;
            while( i<=j && nums[j]==val)j--;

            if( i>j) return i;

            int x= nums[i];
            nums[i]=nums[j];
            nums[j]=x;

            i++; j--;
        }

        return i;
    }
}
