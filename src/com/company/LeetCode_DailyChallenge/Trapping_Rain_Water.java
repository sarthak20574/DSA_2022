package com.company.LeetCode_DailyChallenge;

public class Trapping_Rain_Water {

    //42. Trapping Rain Water
    //https://leetcode.com/problems/trapping-rain-water/description/
    //https://www.youtube.com/watch?v=ZI2z5pq0TqA&ab_channel=NeetCode

    public int trap(int[] height) {

        int ans=0, i=0, j= height.length-1, l_max=height[0], r_max=height[j];

        while( i<j){

            if( l_max<r_max){
                i++;
                l_max= Math.max( l_max, height[i]);
                ans+= l_max-height[i];
            }
            else{
                j--;
                r_max= Math.max(r_max, height[j]);
                ans+=r_max-height[j];
            }
        }

        return ans;
    }
}
