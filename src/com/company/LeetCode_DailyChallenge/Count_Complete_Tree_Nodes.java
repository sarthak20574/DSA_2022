package com.company.LeetCode_DailyChallenge;

public class Count_Complete_Tree_Nodes {

    //222. Count Complete Tree Nodes
    //https://leetcode.com/problems/count-complete-tree-nodes/description/
    public int countNodes(TreeNode root) {

        if( root==null) return 0;

        int h1=lft_height(root);
        int h2= ryt_height(root);

        if( h1==h2) return (int)Math.pow(2, h1)-1;

        return 1+ countNodes(root.left)+ countNodes(root.right);
    }

    int lft_height(TreeNode r){
        if( r==null) return 0;
        return 1+ lft_height(r.left);
    }

    int ryt_height(TreeNode r){
        if( r==null) return 0;
        return 1+ ryt_height(r.right);
    }

}
