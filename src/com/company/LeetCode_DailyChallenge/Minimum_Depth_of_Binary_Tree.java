package com.company.LeetCode_DailyChallenge;

public class Minimum_Depth_of_Binary_Tree {

    //111. Minimum Depth of Binary Tree
    //https://leetcode.com/problems/minimum-depth-of-binary-tree/description/

    public int minDepth(TreeNode r) {

        if( r==null) return 0;

        return fn( r);
    }

    int fn(TreeNode r){
        if( r==null) return 1_000_00;

        if(r.left==null && r.right==null) return 1;

        return 1+ Math.min( fn(r.right) , fn( r.left) );
    }
}
