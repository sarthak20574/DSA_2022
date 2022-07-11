package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    //46. Permutations
    //https://leetcode.com/problems/permutations/


    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int n= nums.length;


        fn( n,new ArrayList<Integer>(),ans, nums);

        return ans;
    }

    void fn( int n,List<Integer> present_ans, List<List<Integer>> ans, int[] nums){

        if( present_ans.size()== n){
            ans.add(new ArrayList<>(present_ans));
            return;
        }

        for( int i=0; i<n; i++){

            if( present_ans.contains(nums[i])) continue; // if already there then, skip

            present_ans.add( nums[i]);
            fn( n, present_ans, ans, nums);
            present_ans.remove( Integer.valueOf(nums[i]));
        }
    }
}
