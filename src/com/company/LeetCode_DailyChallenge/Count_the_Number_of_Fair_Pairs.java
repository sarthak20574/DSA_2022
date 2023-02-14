package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Count_the_Number_of_Fair_Pairs {

    //2563. Count the Number of Fair Pairs
    //https://leetcode.com/problems/count-the-number-of-fair-pairs/description/

    public long countFairPairs(int[] nums, int lower, int upper) {

        Arrays.sort(nums);
        //System.out.println(Arrays.toString(nums));

        return less(nums, upper)- less( nums, lower-1);
    }

    long less(int[] nums, int l) {

        long ans=0;

        int n= nums.length;
        int i=0, j=n-1;

        while(i<j){

            if( (nums[i]+nums[j])<=l){
                ans+=j-i;

                // System.out.println(j+" "+i);
                // System.out.println(nums[j]+" "+nums[i]);
                i++;
            }
            else {
                j--;
            }
        }
        return ans;
    }


}
