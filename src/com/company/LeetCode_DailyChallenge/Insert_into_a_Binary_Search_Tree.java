package com.company.LeetCode_DailyChallenge;

public class Insert_into_a_Binary_Search_Tree {


    //701. Insert into a Binary Search Tree
    //https://leetcode.com/problems/insert-into-a-binary-search-tree/description/

    public TreeNode insertIntoBST(TreeNode root, int val) {

        if(root==null){
            return new TreeNode(val);
        }

        fn( root, val);

        return root;
    }

    void fn( TreeNode cur, int val){

        if( val < cur.val){
            if( cur.left==null){
                cur.left= new TreeNode(val);
                return;
            }
            else fn( cur.left, val);
        }
        else{

            if( cur.right==null){
                cur.right= new TreeNode(val);
                return;
            }
            else fn( cur.right, val);
        }

    }

}
