package com.company.LeetCode_DailyChallenge;

import java.util.TreeMap;

public class Maximum_Balanced_Subsequence_Sum {
    //2926. Maximum Balanced Subsequence Sum
    //https://www.youtube.com/watch?v=qHKNsEGLzAw
    //https://www.youtube.com/watch?v=qHKNsEGLzAw&t=3900s
    //https://leetcode.com/problems/maximum-balanced-subsequence-sum/solutions/4250358/nums-i-i-nums-j-j/

    // java soln taken from
    //https://leetcode.com/problems/maximum-balanced-subsequence-sum/solutions/4250626/java-treemap/

    public long maxBalancedSubsequenceSum(int[] nums) {
        TreeMap<Integer, Long> m = new TreeMap<>();
        int n= nums.length;
        long ans=Integer.MIN_VALUE;

        int[]k= new int[n];

        for( int i=0; i<n; i++){
            k[i]= nums[i]-i;
            ans= Math.max(nums[i], ans);
        }

        for( int i=0; i<n; i++){
            if( nums[i]>0){

                long cur=nums[i];
                if( m.floorKey(nums[i]-i)!=null)
                    cur+=m.get(m.floorKey(nums[i]-i));

                while( m.ceilingKey(nums[i]-i)!=null && m.get(m.ceilingKey(nums[i]-i))<cur){
                    m.remove( m.ceilingKey(nums[i]-i));
                }

                if(  m.get(nums[i]-i)==null ||  m.get(nums[i]-i)<cur)
                    m.put(nums[i]-i, cur);
                ans= Math.max(ans, cur);

            }

        }

        return ans;

    }


}
