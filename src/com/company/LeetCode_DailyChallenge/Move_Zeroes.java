package com.company.LeetCode_DailyChallenge;

public class Move_Zeroes {

    //283. Move Zeroes
    //https://leetcode.com/problems/move-zeroes/description/

    public void moveZeroes(int[] nums) {
        int zeros=0,n=nums.length;
        int j=0;
        for( int i=0; i<n; i++){
            if( nums[i]==0){
                zeros++;
            }
            else{
                nums[j++]=nums[i];
            }
        }
        while( zeros>0){
            zeros--;
            nums[j++]= 0;
        }

    }
}
