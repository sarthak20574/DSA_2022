package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    //78. Subsets
    //https://leetcode.com/problems/subsets/

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans= new ArrayList<>();

        fn( nums, 0, new ArrayList<>(), ans);

        return ans;
    }

    void fn( int[] nums, int i, List<Integer> pres_ans, List<List<Integer>> ans){


        // add the present list's copy to our answer
        ans.add( new ArrayList<Integer>(pres_ans));


        // traverse from the index to the end
        for( int j=i; j<nums.length; j++){

            // we have 2 choiuce either to include or not include the current number

            // we include the element present at the index j
            pres_ans.add(nums[j]);
            fn( nums, j+1, pres_ans, ans);

            // we backtrack or not include the element present at the index j
            pres_ans.remove( pres_ans.size()-1);
        }
    }
}
