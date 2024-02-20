package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Maximize_Consecutive_Elements_in_an_Array_After_Modification {

    //3041. Maximize Consecutive Elements in an Array After Modification
    //https://leetcode.com/problems/maximize-consecutive-elements-in-an-array-after-modification/
    //https://www.youtube.com/watch?v=KnPNLfexg8k&ab_channel=AryanMittal


    public int maxSelectedElements(int[] nums) {

        Arrays.sort(nums);
        Map<Integer, Integer> m= new HashMap<>();
        int ans=0;

        for( int i: nums){
            // i+1
            m.put(i+1, m.getOrDefault(i,0)+1);
            //i
            m.put(i, m.getOrDefault(i-1,0)+1);
            ans= Math.max(ans, m.get(i+1));
            ans= Math.max(m.get(i), ans);
        }
        return ans;
    }

}
