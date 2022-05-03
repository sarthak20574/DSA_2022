package com.company.LeetCode_DailyChallenge;

public class Kth_Smallest_Element_in_a_BST {

    //230. Kth Smallest Element in a BST
    //https://leetcode.com/problems/kth-smallest-element-in-a-bst/

    int ans, n;
    public int kthSmallest(TreeNode root, int k) {
        n=k;
        inorder_tra( root);
        return ans;
    }

    private void inorder_tra(TreeNode root) {
        if( root==null)return;

        inorder_tra(root.left);

        n--;//k-1 th ele has to be returned
        if( n==0){
            ans= root.val;
            return;
        }
        inorder_tra(root.right);
    }
}
