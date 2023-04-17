package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Count_the_Number_of_Beautiful_Subarrays {

    //2588. Count the Number of Beautiful Subarrays
    //https://leetcode.com/problems/count-the-number-of-beautiful-subarrays/description/
    public long beautifulSubarrays(int[] nums) {

        long cur=0, ans=0;

        Map<Long, Long> m= new HashMap<>();

        m.put( 0L,1L);

        for( int i: nums){

            cur^=i;
            if(m.containsKey(cur)){
                ans+=m.get(cur);
            }

            m.put( cur, m.getOrDefault(cur, 0L)+1L);
        }

        return ans;
    }

}
