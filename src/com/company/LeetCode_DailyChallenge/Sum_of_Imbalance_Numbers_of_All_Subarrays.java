package com.company.LeetCode_DailyChallenge;

import java.util.HashSet;
import java.util.Set;

public class Sum_of_Imbalance_Numbers_of_All_Subarrays {

    //2763. Sum of Imbalance Numbers of All Subarrays
    //https://leetcode.com/problems/sum-of-imbalance-numbers-of-all-subarrays/description/
    public int sumImbalanceNumbers(int[] nums) {

        int ans=0, n= nums.length, cur;

        Set<Integer> s;

        for( int i=0; i<n; i++){
            s= new HashSet<>();
            cur=0;
            for( int j=i; j<n; j++){
                if( s.contains(nums[j]));
                else if( s.contains(nums[j]-1) && s.contains(nums[j]+1)) cur--;
                else if( s.isEmpty()==false && !s.contains(nums[j]-1) && !s.contains(nums[j]+1)) cur++;
                s.add( nums[j]);
                ans+=cur;
            }

        }
        return ans;
    }
}
