package com.company.LeetCode_DailyChallenge;

public class Convert_BST_to_Greater_Tree {

    //https://leetcode.com/problems/convert-bst-to-greater-tree/
    //https://www.youtube.com/watch?v=GX3X5Ami8L8
    //ryt to root to left, ie, reverse inorder traversal
    int sum=0;
    public TreeNode convertBST(TreeNode root) {
        if( root==null)return root;
        convertBST(root.right);
        sum+= root.val;
        root.val=sum;
        convertBST(root.left);
        return root;
    }

    //uisng a stack
    //untested


}
