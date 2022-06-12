package com.company.LeetCode_DailyChallenge;

import java.util.HashSet;
import java.util.Set;

public class Maximum_Erasure_Value {

    //1695. Maximum Erasure Value
    //https://leetcode.com/problems/maximum-erasure-value/

    public int maximumUniqueSubarray(int[] nums) {

        Set<Integer> set= new HashSet<>();
        int n= nums.length;
        int ans=0;
        int present_ans=0;
       int i=0, j=0;

       while( i<=j){
           if( j<n && set.contains(nums[j])==false){
               set.add(nums[j]);
               present_ans+=nums[j];
               j++;
               ans= Math.max(ans,present_ans);
           }
           else if( j<n){
               while (set.contains(nums[j])==true){
                   set.remove(nums[i]);
                   present_ans-=nums[i];
                   i++;
               }
           }
       }
       return ans;
    }

}
