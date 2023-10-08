package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maximum_Element_Sum_of_a_Complete_Subset_of_Indices {

    // 2862. Maximum Element-Sum of a Complete Subset of Indices
    //https://leetcode.com/problems/maximum-element-sum-of-a-complete-subset-of-indices/
    // watch aryan mittal's vid
    public long maximumSum(List<Integer> nums) {

        Map<Integer, Long> dp= new HashMap<>();

        long ans=0;

        int n= nums.size();

        for( int i=0; i<n; i++){
            int cur=i+1;

            for(int no=2; no * no<=cur ; no++ ){
                while( cur%( no *no)==0 ){
                    cur/=( no *no);
                }
            }

            long res=dp.getOrDefault(cur, 0L)+nums.get(i);
            dp.put( cur, res);

            ans= Math.max(ans, res );
        }
        return ans;

    }
}
