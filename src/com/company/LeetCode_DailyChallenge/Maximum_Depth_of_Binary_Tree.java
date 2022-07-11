package com.company.LeetCode_DailyChallenge;

public class Maximum_Depth_of_Binary_Tree {

    //104. Maximum Depth of Binary Tree
    //https://leetcode.com/problems/maximum-depth-of-binary-tree/

    public int maxDepth(TreeNode root) {

        if( root==null) return 0;

        int r= maxDepth(root.right);
        int l= maxDepth(root.left);

        return 1+ Math.max( r,l);

    }
}
