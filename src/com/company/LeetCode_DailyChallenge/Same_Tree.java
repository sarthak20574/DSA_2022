package com.company.LeetCode_DailyChallenge;

public class Same_Tree {
    //100. Same Tree
    //https://leetcode.com/problems/same-tree/

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if( p== null && q==null) return true;
        else if(  p== null && q!=null) return false;
        else if(  p!= null && q==null) return false;
        else return (p.val== q.val &&
                    isSameTree(p.right, q.right) && isSameTree(p.left, q.left));

    }
        }
