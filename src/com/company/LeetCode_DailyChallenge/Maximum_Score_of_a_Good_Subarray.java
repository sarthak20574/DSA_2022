package com.company.LeetCode_DailyChallenge;

public class Maximum_Score_of_a_Good_Subarray {

    //1793. Maximum Score of a Good Subarray
    //https://leetcode.com/problems/maximum-score-of-a-good-subarray/description/

    public int maximumScore(int[] nums, int k) {

        int minn=nums[k], i=k, j=k, ans= minn, n=nums.length;

        while( true ){

            if(i-1>=0 && j+1<n && nums[i-1]>nums[j+1]){
                i--;
                minn= Math.min( minn, nums[i]);
            }
            else if(i-1>=0 && j+1<n && nums[i-1]<nums[j+1]){
                j++;
                minn= Math.min( minn, nums[j]);
            }
            else if(i-1>=0){
                i--;
                minn= Math.min( minn, nums[i]);
            }
            else if(j+1<n ){
                j++;
                minn= Math.min( minn, nums[j]);
            }
            else break;

            ans= Math.max(ans, minn * (j-i+1));
        }

        return ans;
    }
}
