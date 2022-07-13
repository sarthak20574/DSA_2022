package com.company.LeetCode_DailyChallenge;

public class Flatten_Binary_Tree_to_Linked_List {

    //114. Flatten Binary Tree to Linked List
    //https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
    //https://www.youtube.com/watch?v=rKnD7rLT0lI&ab_channel=NeetCode

    public void flatten(TreeNode root) {

        fn( root);

    }

    TreeNode fn( TreeNode root){


        if( root==null)return null;


        //first get the tails of both the list from left and the right sides
        TreeNode left_tail= fn(root.left );
        TreeNode right_tail= fn( root.right);

       // insert the left list into the root's right
        if(left_tail!=null){
            left_tail.right= root.right;
            root.right= root.left;
            root.left= null;
        }


        // return the tail of the new list
        return right_tail!=null?right_tail: left_tail!=null?left_tail:root;
    }
}
