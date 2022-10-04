package com.company.LeetCode_DailyChallenge;

public class Bitwise_XOR_of_All_Pairings {
    //2425. Bitwise XOR of All Pairings
    //https://leetcode.com/problems/bitwise-xor-of-all-pairings/description/

    public int xorAllNums(int[] nums1, int[] nums2) {
        int n1=  nums1.length;
        int n2= nums2.length;

        int ans=0;
        if( n1%2!=0){
            for( int i: nums2){
                ans= ans^i;
                //System.out.println(i);
            }
        }

        if( n2%2!=0){
            for( int i: nums1){
                //System.out.println(i);
                ans= ans^i;
            }
        }

        return ans;
    }
}
