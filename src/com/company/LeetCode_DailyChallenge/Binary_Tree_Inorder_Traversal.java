package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Inorder_Traversal {


    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans= new ArrayList<>();

        fn( root, ans);

        return ans;
    }


// inorder traversal = left , root, right

    void fn( TreeNode r , List<Integer> ans){

        // base case
        if( r==null) return;

// left
        fn( r.left, ans);

//node
        ans.add( r.val);

// right
        fn( r.right, ans);

    }
}
