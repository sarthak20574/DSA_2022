package com.company.LeetCode_DailyChallenge;

public class Add_One_Row_to_Tree {

    //623. Add One Row to Tree
    //https://leetcode.com/problems/add-one-row-to-tree/description/

    public TreeNode addOneRow(TreeNode root, int val, int depth) {

        fn( root,val,depth-1);


        if( root==null) return new TreeNode(val);
            // if have to insert at the depth==1
        else if( depth==1) {
            TreeNode x= new TreeNode(val);
            x.left= root;
            return x;
        }
        return root;
    }

    void fn( TreeNode root, int val, int depth){

        if( root== null) return;

        if( depth-1==0){
            TreeNode lft= root.left;
            TreeNode ryt= root.right;

            root.left= new TreeNode(val);
            root.left.left= lft;

            root.right= new TreeNode(val);
            root.right.right= ryt;
            return;
        }
        fn( root.right, val, depth-1);
        fn( root.left, val, depth-1);
    }
}
