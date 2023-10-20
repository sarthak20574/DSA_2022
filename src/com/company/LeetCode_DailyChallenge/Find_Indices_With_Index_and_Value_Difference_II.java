package com.company.LeetCode_DailyChallenge;

public class Find_Indices_With_Index_and_Value_Difference_II {

    //2905. Find Indices With Index and Value Difference II
    //https://leetcode.com/problems/find-indices-with-index-and-value-difference-ii/
    //see lee's post


    public int[] findIndices(int[] nums, int ind, int val) {

        int minn= 0, maxx= 0, n= nums.length , k=ind;
        int[] ans= {-1,-1};

        // 0 and k

        for( int i=k; i<n; i++){
            if( nums[minn]>nums[i-k])
                minn=i-k;


            if(nums[maxx]<nums[i-k])
                maxx= i-k;

            if( nums[i]-nums[minn]>=val){
                return new int[]{minn,i};
            }

            if(nums[maxx]- nums[i]>=val){
                return new int[]{i,maxx};
            }

        }
        return ans;
    }

}
