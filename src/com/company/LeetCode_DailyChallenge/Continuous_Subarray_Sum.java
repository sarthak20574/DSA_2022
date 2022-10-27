package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Continuous_Subarray_Sum {

    //523. Continuous Subarray Sum
    //https://leetcode.com/problems/continuous-subarray-sum/description/
    //https://www.youtube.com/watch?v=OKcrLfR-8mE&ab_channel=NeetCode

    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> m= new HashMap<>();
        m.put( 0, -1);


        int cur_sum=0, n=nums.length;
        for( int i=0; i<n; i++){
            cur_sum+=nums[i];

            int r= cur_sum%k;

            if( m.containsKey(r)){

                if( i-m.get(r)>=2) return true;
            }
            else{

                m.put(r, i);
            }
        }

        return false;
    }


}
