package com.company.LeetCode_DailyChallenge;

public class Sum_Root_to_Leaf_Numbers {

    //129. Sum Root to Leaf Numbers
    //https://leetcode.com/problems/sum-root-to-leaf-numbers/


    // global var
    int ans=0;
    public int sumNumbers(TreeNode root) {
        ans=0;

        fn( root, 0);

        return ans;
    }

    void fn( TreeNode root, int cur){

        //base case
        if( root==null) return;

            // if its a root node then we can add the cur integer build to our answer
        else if( root.left==null && root.right==null){
            ans += cur*10+ root.val;
        }

        // call the left and the right subtree
        fn( root.left, cur*10 +root.val);
        fn( root.right, cur*10 +root.val);


    }
}
