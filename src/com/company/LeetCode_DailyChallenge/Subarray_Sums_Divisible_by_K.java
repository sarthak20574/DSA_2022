package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Subarray_Sums_Divisible_by_K {

    //974. Subarray Sums Divisible by K
    //https://leetcode.com/problems/subarray-sums-divisible-by-k/description/

    public int subarraysDivByK(int[] nums, int k) {

        Map<Integer, Integer> m= new HashMap<>();

        m.put(0, 1);

        int cur=0;

        int ans=0;

        for( int i: nums){

            if( i<0) i= k+i%k;

            cur+=i%k;

            cur%=k;

            //System.out.println(cur);

            if( m.containsKey(Math.abs(cur))==true){
                ans+=m.get(Math.abs(cur));
            }

            m.put( Math.abs(cur), m.getOrDefault(Math.abs(cur),0)+1);
        }

        return ans;
    }

}
