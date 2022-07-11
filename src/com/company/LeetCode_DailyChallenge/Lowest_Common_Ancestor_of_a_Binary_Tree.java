package com.company.LeetCode_DailyChallenge;

public class Lowest_Common_Ancestor_of_a_Binary_Tree {

    //236. Lowest Common Ancestor of a Binary Tree
    //https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
    //https://www.youtube.com/watch?v=13m9ZCB8gjw&ab_channel=TusharRoy-CodingMadeSimple


    // idea is simple if while traversing the tree from top to bottom if you meet any of the 2 nodes then return the node if a parent is getting 2 nodes that are not null, then it will be the LCA so it will return itslef to its parent...

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if( root== null) return null;

        if( root== p || root==q) return root;

        TreeNode lft=  lowestCommonAncestor( root.left, p, q);

        TreeNode ryt=  lowestCommonAncestor( root.right, p,q);

        if( lft!= null && ryt!=null) return root;

        return lft!=null? lft: ryt!=null? ryt:null;

    }
}
