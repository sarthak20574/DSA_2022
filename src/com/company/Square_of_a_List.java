package com.company;

public class Square_of_a_List {

    //Square of a List
    //https://binarysearch.com/problems/Square-of-a-List

    public int[] solve(int[] nums) {

        int n= nums.length;
        int[] ans= new int[n];

        int i=0, j= n-1,k=n-1;
        while( i<=j){
            if(nums[i]* nums[i]<nums[j]*nums[j]){
                ans[k--]= nums[j]*nums[j];
                j--;
            }
            else{
                ans[k--]= nums[i]*nums[i];
                i++;
            }

        }

        return ans;
    }
}
