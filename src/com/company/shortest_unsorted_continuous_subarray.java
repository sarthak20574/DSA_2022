package com.company;

public class shortest_unsorted_continuous_subarray {

    /*

    //https://leetcode.com/problems/shortest-unsorted-continuous-subarray/
    //https://www.youtube.com/watch?v=hZmwvBIJXPg
   int findUnsortedSubarray(vector<int>& nums) {

        int minn= INT_MAX, maxx= INT_MIN, n= nums.size();


        if( n==1)return 0;

        for( int i=0; i<n; i++){

            if( (i-1>=0 && nums[i]<nums[i-1]) || (i+1<n && nums[i]>nums[i+1])){
                minn= min(nums[i], minn);
                maxx= max( maxx, nums[i]);
            }
        }

        if(minn== INT_MAX || maxx== INT_MIN){
            return 0;
        }

        int i, j;

        for( i=0 ; i< n; i++){
            if( nums[i]>minn) break;
        }

        for( j=n-1; j>=0; j--){
            if(maxx>nums[j])break;
        }

        return j-i +1;
    }
 */

}
