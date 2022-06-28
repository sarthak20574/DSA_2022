package com.company.LeetCode_DailyChallenge;

public class Balanced_Binary_Tree {

    //110. Balanced Binary Tree
    //https://leetcode.com/problems/balanced-binary-tree/
    //https://www.youtube.com/watch?v=LU4fGD-fgJQ
    //https://www.youtube.com/watch?v=Yt50Jfbd8Po

    public boolean isBalanced(TreeNode root) {
        return h(root)!=-1;
    }

    int h (TreeNode t){

        if( t==null) return 0;

        int lft_h= h( t.left);
        int ryt_h= h(t.right);

        if( lft_h==-1|| ryt_h==-1) return -1;

        if( Math.abs(lft_h-ryt_h)>1){
            return -1;
        }
        return Math.max( lft_h, ryt_h)+1;
    }
}
