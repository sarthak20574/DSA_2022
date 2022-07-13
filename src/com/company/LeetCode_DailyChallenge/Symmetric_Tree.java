package com.company.LeetCode_DailyChallenge;

public class Symmetric_Tree {

    //101. Symmetric Tree
    //https://leetcode.com/problems/symmetric-tree/

    public boolean isSymmetric(TreeNode root) {
        return fn(root, root);
    }

    boolean fn(TreeNode x, TreeNode y){


        if( x==null && y==null) return true;
        else if ( x==null|| y==null) return false;


        boolean a=true;
        if(x.left!=null && y.right!=null){
            a=x.left.val==y.right.val;
        }

        boolean b=true;
        if(y.left!=null && x.right!=null){
            b=x.right.val==y.left.val;
        }

        return a && b && fn(x.left, y.right) && fn(x.right, y.left);
    }
}
