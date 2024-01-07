package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _4Sum {
    //18. 4Sum
    //https://leetcode.com/problems/4sum/
    // see neetcode's vid
    public List<List<Integer>> fourSum(int[] nums, int t) {
        Arrays.sort(nums);

        int n= nums.length;
        List<List<Integer>> ans= new ArrayList<>();
        for( int i=0; i<n-3; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;

            //  if(1L*nums[i]+1L*nums[i+1] > 1L*t- 1L*nums[i+2] - 1L*nums[i+3]) break;
            // if(1L*nums[i]+1L*nums[n-3] <1L* t- 1L*nums[n-2] - 1L*nums[n-1]) continue;

            for( int j=i+1; j<n-2; j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;

                //    if(nums[i]+nums[j]>t-nums[j+1]-nums[j+2]) break;
                //     if(nums[i]+nums[j]<t-nums[n-2]-nums[n-1]) continue;

                long cur= 1L*nums[i]+ 1L*nums[j];
                int l=j+1, r=n-1;
                while( r>l){
                    long cc= cur+1L*nums[r]+1L*nums[l];
                    if( cc==t){
                        ans.add( Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        l++;
                        r--;
                        while(l<r && nums[l-1]==nums[l])l++;
                        while(l<r && nums[r+1]==nums[r])r--;
                    }
                    else if( cc>t){
                        r--;
                    }
                    else{
                        l++;
                    }
                }

            }
        }
        return ans;
    }
}
