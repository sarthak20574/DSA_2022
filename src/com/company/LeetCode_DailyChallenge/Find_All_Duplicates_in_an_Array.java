package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Duplicates_in_an_Array {

    //Find_All_Duplicates_in_an_Array
    //https://leetcode.com/problems/find-all-duplicates-in-an-array/submissions/
    //https://www.youtube.com/watch?v=aMsSF1Il3IY&ab_channel=NickWhite

    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        int n = nums.length;


        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) ans.add(index + 1);

            nums[index] *= -1;
        }

        return ans;
    }
}
