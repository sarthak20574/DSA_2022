package com.company.LeetCode_DailyChallenge;

public class Binary_Tree_Pruning {

    //814. Binary Tree Pruning
    //https://leetcode.com/problems/binary-tree-pruning/description/

    public TreeNode pruneTree(TreeNode root) {

        // if the root's children has no 1s and also the root's value is 0 then we can delete the root itself
        if(fn( root) && root!=null && root.val==0) return null;

        else
            return root;
    }

    boolean fn( TreeNode root){

        // no children so we have found no 1s
        if( root==null) return true;

        // get the result( if anyone of them have any ones) from root's children
        boolean lft= fn( root.left);
        boolean ryt= fn( root.right);

        // if any of the children have no 1s we can delete the child
        if( lft) root.left=null;
        if( ryt) root.right=null;

        // if both of the children have no 1s and the parent itself is a 0 then we can return true, ie, there is not a single 1
        if( ryt && lft && root.val==0){
            return true;
        }
        else{
            return false;
        }
    }
}
