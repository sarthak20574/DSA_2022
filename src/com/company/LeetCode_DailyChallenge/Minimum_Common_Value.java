package com.company.LeetCode_DailyChallenge;

import java.util.HashSet;
import java.util.Set;

public class Minimum_Common_Value {

    //2540. Minimum Common Value
    //https://leetcode.com/problems/minimum-common-value/description/

    public int getCommon(int[] nums1, int[] nums2) {

        Set<Integer> x= new HashSet<>();

        for( int i: nums1){
            x.add( i);
        }

        int ans=Integer.MAX_VALUE;


        for( int i: nums2){

            if( x.contains(i)==true){
                ans= Math.min(ans, i);
            }
        }

        return ans==Integer.MAX_VALUE? -1: ans;

    }

}
