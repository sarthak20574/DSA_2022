package com.company.LeetCode_DailyChallenge;

public class Binary_Tree_Maximum_Path_Sum {

    //124. Binary Tree Maximum Path Sum
    //https://leetcode.com/problems/binary-tree-maximum-path-sum/description/


    int ans=0;
    public int maxPathSum(TreeNode root) {

        ans=Integer.MIN_VALUE;
        fn( root);
        return ans;
    }

    int fn(TreeNode root){
        if( root== null) return 0;

        int ryt= fn( root.right);
        int lft= fn( root.left);

        ans= Math.max( ans, ryt+lft+root.val);

        // 0 is better than negative path, ie, don't take a path instead of taking a negative path
        return Math.max( 0, Math.max(ryt, lft)+ root.val);
    }
}
