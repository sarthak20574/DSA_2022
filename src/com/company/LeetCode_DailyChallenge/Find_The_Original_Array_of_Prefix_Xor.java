package com.company.LeetCode_DailyChallenge;

public class Find_The_Original_Array_of_Prefix_Xor {

    // 2433. Find The Original Array of Prefix Xor
    //https://leetcode.com/problems/find-the-original-array-of-prefix-xor/

    public int[] findArray(int[] pref) {

        int n=pref.length;
        int[] ans= new int[n];
        ans[0]= pref[0];

        for( int i=1; i<n; i++){
            ans[i]=pref[i-1]^ pref[i];
        }

        return ans;
    }
}
