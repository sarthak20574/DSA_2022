package com.company.LeetCode_DailyChallenge;

import java.util.List;

public class Apply_Operations_on_Array_to_Maximize_Sum_of_Squares {

    //2897. Apply Operations on Array to Maximize Sum of Squares
    //https://leetcode.com/problems/apply-operations-on-array-to-maximize-sum-of-squares/description/
    public int maxSum(List<Integer> nums, int k) {

        long ans=0L, mod=1_000_000_007;
        int n= nums.size();
        int[] t = new int[32];

        for (int i: nums) {
            for (int l = 0; l < 32; l++) {
                if ((i & (1 << l)) != 0) {
                    t[l]++;
                }
            }
        }

        for( int i=0; i<k; i++){
            long cur=0L;

            for (int l = 0; l < 32; l++) {
                if (t[l]>0) {
                    cur+=(1 << l)%mod;
                    t[l]--;
                }
            }

            ans= (ans+ cur * cur % mod) % mod;
        }
        return (int) ans;
    }

}
