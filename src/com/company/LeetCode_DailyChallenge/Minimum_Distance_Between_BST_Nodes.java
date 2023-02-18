package com.company.LeetCode_DailyChallenge;

public class Minimum_Distance_Between_BST_Nodes {

    //783. Minimum Distance Between BST Nodes
    //https://leetcode.com/problems/minimum-distance-between-bst-nodes/description/

    int ans=Integer.MAX_VALUE, prev= Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {

        ans=Integer.MAX_VALUE;

        fn( root);


        return ans;
    }



    void fn( TreeNode cur){

        if( cur==null) return;

        fn( cur.left);

        ans= Math.min( ans, Math.abs(cur.val-prev));
        prev= cur.val;

        fn( cur.right);
    }

    // lft root ryt inorder
}
