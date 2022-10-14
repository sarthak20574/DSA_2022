package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class _3Sum_Closest {

    //16. 3Sum Closest
    //https://leetcode.com/problems/3sum-closest/description/
    //https://www.youtube.com/watch?v=anuarmFjTGU&ab_channel=CodewithAlisha

    public int threeSumClosest(int[] nums, int target) {

        int cur_sum=Integer.MAX_VALUE, ans=Integer.MAX_VALUE, n= nums.length;
        Arrays.sort( nums);

        for( int i=0; i<n; i++){

            int lft=i+1, ryt= n-1;
            while( lft<ryt){
                cur_sum= nums[i]+ nums[lft]+ nums[ryt];
                if( cur_sum==target){
                    return target;
                }
                else{
                    if( Math.abs(ans- target)> Math.abs(cur_sum- target)){
                        ans= cur_sum;
                    }

                    if( cur_sum > target ){ // 5> 2
                        ryt--;
                    }
                    else{
                        lft++;
                    }
                }
            }
        }

        return ans;
    }
}
