package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Non_decreasing_Subsequences {


    //491. Non-decreasing Subsequences
    //https://leetcode.com/problems/non-decreasing-subsequences/description/

    public List<List<Integer>> findSubsequences(int[] nums) {

        List<List<Integer>> ans= new ArrayList<>();

        int n=nums.length;

        List<Integer> pres= new ArrayList<>();
        pres.add(nums[0]);
        ans. add( pres);


        for( int i=1; i<n; i++){

            int len=ans.size();
            for( int j=0; j<len; j++){

                if( ans.get(j).get(ans.get(j).size()-1)<= nums[i]){

                    pres= new ArrayList<>(ans.get(j));
                    pres.add(nums[i]);
                    ans.add( pres);
                }
            }

            pres= new ArrayList<>();
            pres.add(nums[i]);
            ans. add( pres);

        }

        int len= ans.size();

        Set<List<Integer>> ans1= new HashSet<>();

        for( int i=0; i<len; i++){
            if( ans.get(i).size()!=1){
                ans1.add(ans.get(i));
            }
        }

        ans= new ArrayList<>();
        for( List<Integer> x: ans1){
            ans.add(x);
        }

        return ans;
    }

}
