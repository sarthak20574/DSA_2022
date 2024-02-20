package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Minimize_Length_of_Array_Using_Operations {

    //3012. Minimize Length of Array Using Operations
    //https://leetcode.com/problems/minimize-length-of-array-using-operations/description/
    //https://www.youtube.com/watch?v=KIT3Y3Yis2k&ab_channel=AryanMittal


    public int minimumArrayLength(int[] nums) {
        Arrays.sort(nums);
        int x=nums[0],c=0, n= nums.length;

        for( int i: nums){
            if( x==i)c++;
            if( i%x!=0) return 1;
        }
        return (c+1)/2;
    }

}
