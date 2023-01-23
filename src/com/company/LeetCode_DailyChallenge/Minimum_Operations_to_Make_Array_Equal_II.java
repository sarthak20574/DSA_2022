package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Minimum_Operations_to_Make_Array_Equal_II {
    //2541. Minimum Operations to Make Array Equal II
    //https://leetcode.com/problems/minimum-operations-to-make-array-equal-ii/description/

    public long minOperations(int[] nums1, int[] nums2, int k) {

        long ans=0;

        long p=0;
        long n=0;

        int len=nums1.length;


        if( k==0){
            if(Arrays.equals(nums1, nums2))return 0;
            else return -1L;
        }

        for( int i=0; i<len; i++){

            int t=nums1[i]- nums2[i];

            // -2k %k ==0?
            if(t%k!=0) return -1;

            t/=k;

            if( t>0) p+=t;
            else n-=t;
        }

        return n==p?p:-1;
    }

}
