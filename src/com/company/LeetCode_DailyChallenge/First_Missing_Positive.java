package com.company.LeetCode_DailyChallenge;

public class First_Missing_Positive {

    //41. First Missing Positive
    //https://leetcode.com/problems/first-missing-positive/description/

    public int firstMissingPositive(int[] nums) {

        // find the smallest
        //

        int n= nums.length;

        for( int i=0; i<n; i++){

            while(0<=nums[i]-1 && nums[i]-1<n ){

                if( nums[i]==i+1) break;

                if( nums[i]==nums[nums[i]-1]) break;
                swap( nums, i);
            }

            // System.out.println( nums[i]);
            //if( ){

            //}
        }
        //[-1,1,3,4]

        //System.out.println( Arrays.toString(nums));

        for( int i=0; i<n; i++){
            if( nums[i]!=i+1) return i+1;
        }


        return n+1;
    }

    void swap( int[] nums, int i){
        //  System.out.println( nums[i]-1);
        int t= nums[i];
        nums[i]= nums[t-1];
        nums[t-1]=t;
        //nums[i]= i+1;
    }
}
