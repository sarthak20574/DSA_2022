package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Destroy_Sequential_Targets {

    //2453. Destroy Sequential Targets
    //https://leetcode.com/problems/destroy-sequential-targets/description/
    //https://www.youtube.com/watch?v=2FTwcxPJ6os&ab_channel=BroCoders

    /*
    nums[i]= all the elements that can be destroyed using ans as the seeding

ans + c * space = nums[i]
nums[i] - ans = c * space

since c is a non negative integer so (nums[i] - ans) is divisible by space

(nums[i] - ans) % space == 0

therefore,
nums[i] % space - ans % space = 0
nums[i] % space = ans % space

therefore we need to hunt down the remainder/remainders with the highest occurences(no of times they appear) using a hash map

we then get the minimum element whose remainder occurs maxx no of times
     */


    public int destroyTargets(int[] nums, int space) {

        Map<Integer, Integer> m= new HashMap<>();


        //hunting down the remainder/remainders with the highest occurences(no of times they appear)
        //maxx= highest no of occurences of remainders
        int maxx= 0;
        for( int i: nums){
            m.put(i%space,m.getOrDefault(i%space,0)+1);
            maxx= Math.max( maxx,m.get(i%space));
        }



        // hunting the minimum element whose remainder occurs maxx no of times
        int ans=Integer.MAX_VALUE;
        for( int i: nums){
            if( m.get(i%space)==maxx){
                ans= Math.min(i, ans);
            }
        }

        return ans;
    }
}
