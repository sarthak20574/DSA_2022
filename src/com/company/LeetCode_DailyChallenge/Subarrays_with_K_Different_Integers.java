package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Subarrays_with_K_Different_Integers {

    //992. Subarrays with K Different Integers
    //https://leetcode.com/problems/subarrays-with-k-different-integers/description/

    public int subarraysWithKDistinct(int[] nums, int k) {


        // at most k - at most k-1

        // if less than k elements

        return (int)(fn( nums, k)- fn(nums,k-1));
    }

    long fn(int[] nums, int k){

        Map<Integer, Integer> m= new HashMap<>();
        int n= nums.length, j=0;
        long ans=0;

        for( int i=0; i< n; i++){

            m.put(nums[i], m.getOrDefault(nums[i],0)+1);
            while( m.size()>k){
                m.put(nums[j], m.get(nums[j])-1);
                if( m.get(nums[j])==0) m.remove(nums[j]);
                j++;
            }
            ans+=i-j+1;
        }
        return ans;

    }


}
