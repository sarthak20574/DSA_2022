package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Find_the_Value_of_the_Partition {

    //2740. Find the Value of the Partition
    //https://leetcode.com/contest/weekly-contest-350/problems/find-the-value-of-the-partition/
    public int findValueOfPartition(int[] nums) {

        int n= nums.length;
        Arrays.sort(nums);

        // System.out.println(Arrays.toString(nums));

        int ans=Integer.MAX_VALUE;
        int prev= nums[0];
        for( int i=1; i<n; i++){
            ans= Math.min(ans, nums[i]-prev);
            prev= nums[i];
        }
        return ans;
    }
}
