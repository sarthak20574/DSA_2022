package com.company.LeetCode_DailyChallenge;

public class Minimum_Absolute_Difference_in_BST {

    //530. Minimum Absolute Difference in BST
    //https://leetcode.com/problems/minimum-absolute-difference-in-bst/

    long prev= Integer.MIN_VALUE, ans=Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {

        fn( root);
        return (int)ans;

    }
    void fn(TreeNode r){
        if( r==null)return;
        fn( r.left);
        ans= Math.min( r.val-prev, ans);
        prev= r.val;
        fn( r.right);
    }
}
