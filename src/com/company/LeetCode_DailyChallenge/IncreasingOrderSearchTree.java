package com.company.LeetCode_DailyChallenge;

public class IncreasingOrderSearchTree {


    // 897. Increasing Order Search Tree
    //https://leetcode.com/problems/increasing-order-search-tree/submissions/
    //https://www.youtube.com/watch?v=6qHflItkcg0
    //naive is create a list of the inorder solution then create a new tree

    /*

    f( root)
    if( root==null) return null;

    f( root.ryt)
    list.add( root)
    f( root.ryt)


    fn( root)

    f( root)

    for(int i=0; i<n-1; i++){

    list.get(i).right= list.get(i+1);
     list.get(i).left=null;
}

 list.get(n-1).right= null;
     list.get(i).left=null;

     return list.get(0);
     */

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    TreeNode cur= null;
    public TreeNode increasingBST(TreeNode root) {
        if( root== null) return  null;

        TreeNode result= new TreeNode(0);
        cur= result;
        inord(root);
        return result.right;
    }

    void inord( TreeNode node){

        if (node== null) return;

        inord(node.left);
        cur.right=node;
        node.left= null;
        cur= node;
        inord(node.right);
    }

}