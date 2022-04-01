package com.company.LeetCode_DailyChallenge;

public class Split_Array_Largest_Sum {
    //410. Split Array Largest Sum
    //https://leetcode.com/problems/split-array-largest-sum/

    public int splitArray(int[] nums, int m) {

        int n = nums.length, lft = 0, ryt = 0, ans = 0;
        for( int i=0; i<n; i++){
            lft= Math.max(nums[i],lft);
            ryt += nums[i];
        }
        ans=ryt;

        while (lft <= ryt) {
            int mid = lft + (ryt - lft) / 2;
            if (count(nums, mid)<=m) {
                // ans = Math.min(mid, ans);
                ryt = mid-1;
                ans=mid;
            } else {
                lft = mid + 1;
            }
        }
        return ans;
    }


    int count(int[] nums, int mid) {
        int sum=0, m=1;
        for(int i: nums){

            if( i+sum>mid){
                sum=i;
                m++;
            }
            else{
                sum+=i;
            }
        }
        return m;
    }
}
