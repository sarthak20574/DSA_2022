package com.company.LeetCode_DailyChallenge;

public class Lowest_Common_Ancestor_of_a_Binary_Search_Tree {

    // 235. Lowest Common Ancestor of a Binary Search Tree
    //https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
    //https://www.youtube.com/watch?v=kulWKd3BUcI&ab_channel=KevinNaughtonJr.
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if( root.val>p.val && root.val>q.val)
            return lowestCommonAncestor(root.left, p, q);
        else if( root.val<p.val && root.val<q.val)
            return lowestCommonAncestor(root.right, p, q);
        else
            return root;


    }
}
