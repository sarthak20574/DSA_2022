package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Subarray_Sum_Equals_K {

    //560. Subarray Sum Equals K
    //https://leetcode.com/problems/subarray-sum-equals-k/
    ////https://www.youtube.com/watch?v=r1cwGocurtA

    // understand the logic
    public int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int n= nums.length;
        //int[] arr= new int[n];
        int ans=0;
        int pre=0;
        map.put(0, 1);
        for( int i=0; i<n; i++){

            pre+=nums[i];
            if( map.containsKey(pre-k)){
                ans+=map.get(pre-k);
            }
            map.put(pre, map.getOrDefault(pre, 0)+1);
        }

        return ans;
    }
}
