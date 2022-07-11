package com.company.LeetCode_DailyChallenge;

public class Validate_Binary_Search_Tree {

    //98. Validate Binary Search Tree
    //https://leetcode.com/problems/validate-binary-search-tree/

    //https://www.youtube.com/watch?v=s6ATEkipzow&ab_channel=NeetCode
    //https://www.youtube.com/watch?v=Z_-h_mpDmeg&ab_channel=KevinNaughtonJr.

    public boolean isValidBST(TreeNode root) {

        // initially give the smallest value possible ...Integer.MIN_VALUE can't be used because one of the inputs is [2147483647]😭 so use Long.MIN_VALUE and Long.MAX_VALUE
        return fn( root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    boolean fn( TreeNode root, long min, long max){

        if( root== null) return true;

        if( root.val<=min || root.val>= max) return false;

        //for the right subtree, for it to be a BST we need to make sure that all the elements on the right treehas to be greater than the root/parent, ie, they are the lowerlimit..similarly for the left subtree

        return fn( root.right,root.val, max) && fn( root.left,min, root.val);

    }
}
