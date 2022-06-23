package com.company.LeetCode_DailyChallenge;

public class Invert_Binary_tree {
    //226. Invert Binary Tree
    //https://www.youtube.com/watch?v=fKgZiCXb6zs
    //https://leetcode.com/problems/invert-binary-tree/

    public TreeNode invertTree(TreeNode root) {
        if( root==null) return null;

        TreeNode l= invertTree(root.left);
        TreeNode r= invertTree(root.right);

        root.left= r;
        root.right= l;

        return root;
    }

}
