package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Find_all_distinct_subset_or_subsequence_sums {
    //Find all distinct subset (or subsequence) sums
    //https://practice.geeksforgeeks.org/problems/find-all-distinct-subset-or-subsequence-sums4424/1
    //https://www.youtube.com/watch?v=Sc8AnQnNK8A&ab_channel=SagarMalhotra

    public int[] DistinctSum(int[] nums)
    {

        Set<Integer> s= new HashSet<>();

        boolean[][] dp= new boolean[101][10001];

        dfs(nums, nums.length, 0, dp,s, 0);

        int[] ans= new int[s.size()];

        int i=0;
        for(int x: s){
            ans[i++]=x;
        }


        Arrays.sort(ans);

        return ans;
    }

    void dfs(int[] nums, int n, int i, boolean[][] dp, Set<Integer> s, int sum){

        if( i==n){
            s.add(sum);
        }
        else if( dp[i][sum]==true) return;
        else{

            dp[i][sum]=true;
            dfs( nums, n, i+1, dp, s, sum+nums[i]);
            dfs( nums, n, i+1, dp, s, sum);
        }

    }
}
