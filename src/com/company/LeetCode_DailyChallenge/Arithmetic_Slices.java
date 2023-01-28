package com.company.LeetCode_DailyChallenge;

public class Arithmetic_Slices {

    //413. Arithmetic Slices
    //https://leetcode.com/problems/arithmetic-slices/description/?envType=study-plan&id=dynamic-programming-i

    public int numberOfArithmeticSlices(int[] nums) {

        int n= nums.length;

        if( n==1)return 0;

        int ans=0, cur=1;
        int diff=nums[1]-nums[0];

        for( int i=2; i<n; i++){
            if( diff== nums[i]-nums[i-1]){
                ans+=cur;
                cur++;
            }
            else{
                cur=1;
                diff=nums[i]-nums[i-1];
            }
        }

        return ans;
    }

}
