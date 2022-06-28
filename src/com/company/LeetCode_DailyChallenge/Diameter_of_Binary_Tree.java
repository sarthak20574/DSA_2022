package com.company.LeetCode_DailyChallenge;

public class Diameter_of_Binary_Tree {

    //543. Diameter of Binary Tree
    //


    int ans=0;
    public int diameterOfBinaryTree(TreeNode root) {

        fn(root);
        return ans;
    }

    int fn( TreeNode root){

        if( root==null) return 0;

        int lft= fn( root.left);
        int ryt= fn( root.right);

        ans= Math.max(lft+ryt+1, ans);
        return Math.max( lft, ryt)+1;
    }
}
