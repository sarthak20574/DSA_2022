package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Find_the_Longest_Equal_Subarray {

    //2831. Find the Longest Equal Subarray
    //https://leetcode.com/problems/find-the-longest-equal-subarray/description/
    //must see https://leetcode.com/problems/find-the-longest-equal-subarray/solutions/3934031/sliding-window/
    public int longestEqualSubarray(List<Integer> nums, int k) {


        Map<Integer, Integer> m= new HashMap<>();

        int maxx=0, j=0, n= nums.size();

        for( int i=0; i<n; i++){
            m.put(nums.get(i), m.getOrDefault(nums.get(i), 0)+1);
            maxx= Math.max( maxx, m.get(nums.get(i)));
            if( i-j+1-maxx >k){
                m.put(nums.get(j), m.get(nums.get(j))-1);
                j++;
            }
        }
        return maxx;

    }
}
