package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Minimum_Size_Subarray_in_Infinite_Array {

    //2875. Minimum Size Subarray in Infinite Array
    //https://leetcode.com/problems/minimum-size-subarray-in-infinite-array/
    //see lee's post and the other post regarding sliding window

    public int minSizeSubarray(int[] nums, int target) {

        // 1  0
        // 3 1
        // 6 2

        // 1 - 0
        // 2-1
        // 3 - 2
        // 5- 3
        // 8 - 4
        // 9 -5
        //

        long sum=0L;

        for( int i: nums){
            sum+=i;
        }

        Map<Long, Long> m= new HashMap<>();

        m.put( 0L, -1L);

        long cur=0, cur_n=0, n=nums.length ;

        int ans=Integer.MAX_VALUE;

        for( long i=0; cur<3 * sum || i< 3 * n || cur< 3 * target ; i++, cur_n++){
            cur_n%=n;
            cur+=nums[(int) cur_n];

            if( m.containsKey(cur-target)){
                ans= (int) Math.min(ans,i-m.get(cur-target));
            }
            m.put(cur, i);
        }

        return ans==Integer.MAX_VALUE?-1:ans;
    }

}
