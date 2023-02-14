package com.company.LeetCode_DailyChallenge;

public class Max_Consecutive_Ones_III {

    //1004. Max Consecutive Ones III
    //https://leetcode.com/problems/max-consecutive-ones-iii/description/
    public int longestOnes(int[] nums, int k) {

        int j=0, ans=0, n = nums.length;
        //k++;

        for(int i=0; i<n; i++){

            if( nums[i]==0)k--;

            while( k<0){
                if( nums[j]==0) k++;
                j++;
            }
            // System.out.println(i+" "+j+ " "+k);

            //if( k>=0)
            ans= Math.max( i-j+1, ans);
        }

        return ans;
    }


}
