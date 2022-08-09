package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {
    //39. Combination Sum
    //https://leetcode.com/problems/combination-sum/

    public List<List<Integer>> combinationSum(int[] arr, int aim) {

        List<List<Integer>> ans= new ArrayList<>();

        fn(arr, 0 ,new ArrayList<Integer>(),aim, arr.length, ans);

        return ans;
    }

    void fn( int[] arr, int i, List<Integer> cur, int aim, int n, List<List<Integer>> ans){


        // s= sum of the current list(cur list)
        int s= 0;

        //calculate the sum
        for( int j=0; j<cur.size(); j++){
            s+=cur.get(j);
        }

        //base case
        if( aim==s){
            // add a copy of the list to our answer
            ans.add( new ArrayList<>(cur));
        }
        else if( aim<s) return;// if the sum of the list > aim since all the elements are +ve so there is no way we can reach the aim

        else {
            for( int k=i; k<n; k++){

                cur.add(arr[k]);
                // since we can use the same element again so we pass k
                fn(arr, k,new ArrayList<Integer>(cur),aim, n, ans);

                // back track or remove the added element
                cur.remove(cur.size()-1);
            }
        }
    }
}
