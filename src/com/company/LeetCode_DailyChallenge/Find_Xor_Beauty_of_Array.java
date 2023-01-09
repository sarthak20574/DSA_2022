package com.company.LeetCode_DailyChallenge;

public class Find_Xor_Beauty_of_Array {

    //2527. Find Xor-Beauty of Array
    //https://leetcode.com/problems/find-xor-beauty-of-array/description/

    // nice explanation
    //https://leetcode.com/problems/find-xor-beauty-of-array/solutions/3015014/why-just-xor-of-all-numbers-works/

    public int xorBeauty(int[] nums) {
        int ans=0;

        for(int i: nums){
            ans^=i;
        }
        return ans;
    }
}
