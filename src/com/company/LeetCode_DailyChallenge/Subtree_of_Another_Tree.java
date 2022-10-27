package com.company.LeetCode_DailyChallenge;

public class Subtree_of_Another_Tree {

    //572. Subtree of Another Tree
    //https://leetcode.com/problems/subtree-of-another-tree

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if( root==null) return false;

        else if( equalTree(root, subRoot)) return true;

        else return isSubtree(root.left, subRoot)|| isSubtree(root.right, subRoot);

    }


    boolean equalTree(TreeNode r1, TreeNode r2){
        if( r1==null && r2==null) return true;
        else if( r1==null || r2==null) return false;
        else return r1.val==r2.val && equalTree(r1.right, r2.right) && equalTree(r1.left, r2.left);
    }

}
