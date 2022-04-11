package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum {

    //1. Two Sum
//https://www.youtube.com/watch?v=dRUpbt8vHpo
    public int[] twoSum(int[] nums, int target) {

        int[] ans;
        int n = nums.length;

        Map<Integer, Integer> integerIntegerMap = new HashMap<>();

        for (int i = 0; i < n; i++) {

            if (!integerIntegerMap.containsKey(target - nums[i])) {
                integerIntegerMap.put(nums[i], i);
            } else {
                return new int[]{integerIntegerMap.get(target - nums[i]), i};
            }
        }
        return new int[2];
    }


}
