package com.company.LeetCode_DailyChallenge;

import java.util.Stack;

public class Recover_Binary_Search_Tree {
    //99. Recover Binary Search Tree
    //https://leetcode.com/problems/recover-binary-search-tree/
    //https://www.youtube.com/watch?v=LR3K5XAWV5k
    //inorder of BST is sorted DF

    // the best is striver's  https://www.youtube.com/watch?v=ZWGW7FminDM&ab_channel=takeUforward
    public void recoverTree1(TreeNode root) {

        Stack<TreeNode> inorder= new Stack<>();
        // inorder.add(root);

        TreeNode no1= null, no2= null,pre= null;

        while (root!=null || !inorder.isEmpty()  ){
            while (root!=null){
                inorder.add(root);
                root=root.left;
            }
            if (!inorder.isEmpty()){
                root=inorder.pop();

                // not the first value to be chosen as the no1
                if(pre!=null && no1==null && pre.val> root.val){
                    no1= pre;
                }
                if( no1!=null && pre.val> root.val){
                    no2= root;//not pre also same is in the special adjacent case of the 2 swapping numbers
                }
                pre= root;
                root= root.right;
            }
        }
        int t= no1.val;
        no1.val= no2.val;
        no2.val=t;
    }



    TreeNode x1 = null, x2 = null, prev= new TreeNode(Integer.MIN_VALUE);

    public void recoverTree(TreeNode root) {

        fn( root);

        int t= x1.val;
        x1.val= x2.val;
        x2.val=t;

    }

    void fn( TreeNode r){

        if( r==null) return;


        fn( r.left);


        if( prev.val > r.val){

            if( x1==null){
                x1= prev;
                x2= r;
            }
            else {

                // 2nd one will be smaller then the first one that why it belongs to the front
                x2=r;
            }
        }

        fn(r.right);
    }

}
