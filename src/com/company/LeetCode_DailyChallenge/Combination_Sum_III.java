package com.company.LeetCode_DailyChallenge;

import java.util.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_III {


    //216. Combination Sum III
    //https://leetcode.com/problems/combination-sum-iii/
    //https://www.youtube.com/watch?v=KSmI_ES0txI&ab_channel=NareshGupta


    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> ans= new ArrayList();

        backTracking(1,k,n,ans,new LinkedList());

        return ans;
    }
    private void backTracking(int start,int k, int n,List<List<Integer>> ans, LinkedList ll){
        if( k==0 && n==0 ){
            ans.add(new ArrayList(ll));
            return;
        }
        if(n<0 || k<0) return;


        for( int i=start; i<10 ; i++){
            ll.add(i);
            backTracking(i+1, k-1, n-i, ans, ll);

            //back tracking that is comming back to k=2 after passing/failing at k=3
            ll.removeLast();
        }

    }


}
