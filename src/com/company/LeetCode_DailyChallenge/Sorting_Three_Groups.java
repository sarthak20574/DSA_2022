package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;
import java.util.List;

public class Sorting_Three_Groups {

    //2826. Sorting Three Groups
    //https://leetcode.com/problems/sorting-three-groups/description/

    long[][] dp;
    public int minimumOperations(List<Integer> nums) {


        dp= new long[nums.size()+1][4];

        for( int i=0; i<=nums.size(); i++){
            Arrays.fill(dp[i], -1L);
        }
        return (int)fn( nums, 0, 1);
    }

    long fn(List<Integer> nums, int i, int cur){

        if(i==nums.size()) return 0;

        // 11111111111 222222222222 33333333333333

        if( dp[i][cur]!=-1) return dp[i][cur];


        long ans=Integer.MAX_VALUE;

        if( cur==1)
            ans= Math.min((nums.get(i)!=1?1:0)+fn( nums, i+1, 1), ans);

        if( cur<=2)
            ans= Math.min((nums.get(i)!=2?1:0)+fn( nums, i+1, 2), ans);

        if( cur<=3)
            ans= Math.min((nums.get(i)!=3?1:0)+fn( nums, i+1, 3), ans);

        dp[i][cur]= ans;



        return ans;

    }
}
