package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations_II {

    //47. Permutations II

    public List<List<Integer>> permuteUnique(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> ans= new ArrayList<>();
        int n= nums.length;

        boolean[] visited= new boolean[n];// all false by default

        backtrack(nums, n,ans, new ArrayList<>(), visited);
        return ans;
    }

    private void backtrack(int[] nums, int n, List<List<Integer>> ans, List<Integer> present_permutation,
                           boolean[] visited){

        if( present_permutation.size()==n) {ans.add(new ArrayList<>(present_permutation)); return ;
        }

        for( int j=0 ; j< n ; j++){

            //already used or duplicates
            if(!visited[j]){

                if( j-1>=0 && nums[j]==nums[j-1] && visited[j-1]==true) return;

                visited[j]= true;
                present_permutation.add(nums[j]);
                backtrack(nums, n,ans, present_permutation, visited);
                present_permutation.remove(present_permutation.size()-1);
                visited[j]= false;
            }

        }
    }
}
