package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_II {


    //40. Combination Sum II
    //https://www.youtube.com/watch?v=rSA3t6BDDwg&ab_channel=NeetCode
    //https://leetcode.com/problems/combination-sum-ii/

    public List<List<Integer>> combinationSum2(int[] arr, int target) {

        List<List<Integer>> ans= new ArrayList<>();

        //we sort the array to collect duplicates together
        Arrays.sort(arr);

        fn(arr,arr.length,target, 0, 0,new ArrayList<>(),ans);

        return ans;
    }

    void fn( int[] arr, int n, int aim, int cur_sum,
             int i, List<Integer> cur, List<List<Integer>> ans){

        // base cases

        // we found a list of required sum, so add a copy of the list in our ans
        if( cur_sum==aim) {
            ans.add( new ArrayList<>(cur));
        }
        // once the sum of a list exceeds the required there is no way that the sum of thwe list can decrease, as we only keep adding positive elements
        else if(cur_sum>aim){
            return;
        }
        else{

            for( int k=i; k<n; k++){

                // to remove duplicates, we don't include(skip) adjacent element if they have the same value
                if( k>i && arr[k-1]== arr[k]) continue;

                cur.add(arr[k]);
                fn(arr,n,aim,cur_sum+arr[k], k+1,cur,ans);

                //backtrack
                cur.remove(cur.size()-1);

            }
        }
    }
}
