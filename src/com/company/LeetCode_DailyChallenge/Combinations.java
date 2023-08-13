package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    //77. Combinations
    //https://leetcode.com/problems/combinations/description/

    List<List<Integer>> ans;
    public List<List<Integer>> combine(int n, int k) {
        ans= new ArrayList<>();
        fn(1,n,k, new ArrayList<>());

        return ans;
    }

    void fn( int j, int n, int k, List<Integer> cur){

        if( k==0){
            ans.add( cur);
        }
        if( j>n){
            return;
        }

        // 1 2 3 4 5 6
        for( int i=j; i<=n; i++){
            cur.add(i);
            fn(i+1,n, k-1,new ArrayList<>(cur) );
            cur.remove( cur.size()-1);
        }
    }
}
