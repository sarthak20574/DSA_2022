package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Largest_Perimeter_Triangle {


    //976. Largest Perimeter Triangle
    //https://leetcode.com/problems/largest-perimeter-triangle/description/

    /*
    Sort the array and get the biggest valid triplet satisfying the triangle inequality
    ( a,b,c be the length of the 3 sides then we can form a triangle if a+b>c && b+c>a && c+a>b)
     */

    public int largestPerimeter(int[] nums) {

        Arrays.sort(nums);
        //System.out.println(Arrays.toString(nums));

        for(int i=nums.length-1;i-2>=0; i--){

            if( nums[i]+nums[i-1] > nums[i-2] && nums[i-1]+nums[i-2] > nums[i] &&
                    nums[i]+nums[i-2] > nums[i-1])
                return nums[i]+nums[i-1] +nums[i-2];

        }

        return 0;
    }
}
