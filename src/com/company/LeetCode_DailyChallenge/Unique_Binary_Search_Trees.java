package com.company.LeetCode_DailyChallenge;

public class Unique_Binary_Search_Trees {

    //96. Unique Binary Search Trees
    //https://leetcode.com/problems/unique-binary-search-trees/description/
    //https://www.youtube.com/watch?v=Ox0TenN3Zpg&ab_channel=NeetCode



/*
 we chose one of the elements as the root node and the n-1 remaining elements can form the right or the left subtree
 so we consider all the permutations from 0,n-1 +  1, n-2....n-1,0
 for n nodes
 */


    public int numTrees(int n) {

        int[] dp= new int[n+1];

        // base case
        dp[0]=1;
        dp[1]=1;

        for( int i=2; i<=n; i++){

            // eg for i=4
            // we consider 0,3 + 1,2 + 2,1 + 3,0 , here i-1=3
            for( int j=0, k=i-1;j<i; j++, k--){

                dp[i]+= dp[j]*dp[k];
            }
        }
        return dp[n];

    }

}
