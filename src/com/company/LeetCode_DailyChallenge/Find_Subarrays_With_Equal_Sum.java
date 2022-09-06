package com.company.LeetCode_DailyChallenge;

import java.util.HashSet;
import java.util.Set;

public class Find_Subarrays_With_Equal_Sum {

    //Find Subarrays With Equal Sum
    //https://leetcode.com/problems/find-subarrays-with-equal-sum/description/

    // just store the sum of all the subarrays of length 2 in a hashset and as you move on see if there is the current subarray sum exist in the hash set

    public boolean findSubarrays(int[] nums) {

        Set<Integer> s = new HashSet<>();

//initially we haven't found any equal 2 element subarray
        boolean ans = false;


        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {

            int sum = nums[i] + nums[i + 1];

// check if there is a already a subarray of the same sum if yes then we already have our answer
            if (s.contains(sum) == true) {
                ans = true;
                break;
            }

// add the sum of the new subarray

            s.add(sum);
        }

        return ans;

    }

}
