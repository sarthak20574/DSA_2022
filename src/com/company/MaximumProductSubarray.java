package com.company;

public class MaximumProductSubarray {

      /*
//152. Maximum Product Subarray
//https://leetcode.com/problems/maximum-product-subarray/
//https://www.youtube.com/watch?v=lXVy6YWFcRM
int maxProduct(vector<int>& nums) {

        int ans=nums[0];

        int maxx=1,minn=1;
        int n= nums.size();

        for( int i=0; i<n ; i++){

            //if( nums[i]==0) then max and min shou8ld be 1 not prev * 0

            int tmp=maxx* nums[i];
            maxx= max(maxx* nums[i], max(minn* nums[i],nums[i]));

            minn= min( minn * nums[i], min(tmp, nums[i]));

            ans= max( maxx, ans);
        }

        return ans;
    }

 */

}
