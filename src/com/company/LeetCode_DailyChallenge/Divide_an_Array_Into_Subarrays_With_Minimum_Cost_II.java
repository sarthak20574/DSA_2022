package com.company.LeetCode_DailyChallenge;

import java.util.TreeSet;

public class Divide_an_Array_Into_Subarrays_With_Minimum_Cost_II {

    //3013. Divide an Array Into Subarrays With Minimum Cost II
    //https://leetcode.com/problems/divide-an-array-into-subarrays-with-minimum-cost-ii/
    //https://www.youtube.com/watch?v=4OEGSUHEFeg&ab_channel=AryanMittal

    public long minimumCost(int[] nums, int k, int dist){

        //  1 2 3
        TreeSet<Integer> s= new TreeSet<>((a, b)->nums[a]==nums[b]?a-b:nums[a]-nums[b]);
        TreeSet<Integer> big= new TreeSet<>((a,b)->nums[a]==nums[b]?a-b:nums[a]-nums[b]);

        // add nums[0] at the end( always counted)
        long ans=0, cur=0;

        for( int i=1; i<=dist+1; i++){
            cur+=nums[i];
            s.add(i);
        }

        while (s.size()>k-1){
            int x=s.pollLast();
            cur-=nums[x];
            big.add(x);
        }
        ans= cur;

        for( int i=dist+2, j=1; i<nums.length;i++,j++){
            big.add(i);
            // add ith ele and remove jth ele
            if( s.contains(j)){
                s.remove(j);
                cur-=nums[j];

                int addd=big.pollFirst();
                s.add(addd);
                cur+=nums[addd];
            }
            else {
                big.remove(j);

                if( nums[s.last()]>nums[big.first()]){
                    int polled1=s.pollLast(), polled2= big.pollFirst();
                    cur-=nums[polled1];
                    cur+=nums[polled2];
                    s.add(polled2);
                    big.add(polled1);
                }
            }
            ans= Math.min(ans, cur);
        }
        return ans+nums[0];
    }
}
