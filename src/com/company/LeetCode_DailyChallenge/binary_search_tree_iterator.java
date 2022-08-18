package com.company.LeetCode_DailyChallenge;

import java.util.Stack;

public class binary_search_tree_iterator {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }


    //https://leetcode.com/problems/binary-search-tree-iterator/
    //https://www.youtube.com/watch?v=RXy5RzGF5wo
    class BSTIterator {

        Stack<TreeNode> stack;
        public BSTIterator(TreeNode root) {
            stack= new Stack<>();
            update(root);
        }

        public int next() {
            // remove the top of the stack zdn insert its right element

            TreeNode temp= stack.pop();
            update(temp.right);
            return temp.val;

        }

        public boolean hasNext() {

            return !stack.isEmpty();
        }
        public void update(TreeNode x){
            while (x!=null){
                stack.add(x);
                x= x.left;
            }
        }
    }


}
