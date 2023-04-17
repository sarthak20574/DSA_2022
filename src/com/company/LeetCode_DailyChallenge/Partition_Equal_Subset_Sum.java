package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Partition_Equal_Subset_Sum {

    int[][] dp;
    public boolean canPartition(int[] nums) {

        int sum=0;

        for( int i: nums){
            sum+=i;
        }
        if( sum%2!=0) return false;

        dp= new int[20_001][201];

        for( int i=0; i<20_000; i++){
            Arrays.fill(dp[i], -1);
        }

        return fn( sum/2, nums, 0, 0, 0);
    }

    boolean fn( int k, int[] nums, int cur1, int cur2, int i){

        if( k== cur1 ){
            return true;
        }

        if( k< cur1 || k< cur2) return false;

        if( i== nums.length) return false;

        if( dp[cur1][i]!=-1) return  dp[cur1][i]==1?true:false;

        // 2 choices put in cur 1 or in cur2

        boolean ans= fn( k, nums, cur1+ nums[i], cur2, i+1)
                || fn( k, nums, cur1, cur2+ nums[i], i+1);

        dp[cur1][i]= ans?1:0;

        return ans;
    }


    public boolean canPartition1(int[] nums) {

        int sum=0;

        for( int i: nums){
            sum+=i;
        }

        if( sum%2!=0) return false;


        int[][] dp= new int[20_001][201];

        for( int i=0; i<20_000; i++){
            Arrays.fill(dp[i], -1);
        }

        int k= sum/2;

        for( int ind=0; ind<nums.length; ind++){
            dp[k][ind]=1;
        }


        for( int ind=nums.length-1; ind>=0; ind--){

            for( int cur1=k-1; cur1>=0; cur1--){

                boolean ans= dp[cur1+ nums[ind]][ind+1]==1
                        || dp[cur1][ind+1]==1;

                dp[cur1][ind]= ans?1:0;
            }
        }


        return dp[0][0]==1;
    }

}
