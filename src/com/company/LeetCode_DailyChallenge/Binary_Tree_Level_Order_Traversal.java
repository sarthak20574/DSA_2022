package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_Level_Order_Traversal {

    //102. Binary Tree Level Order Traversal
    //https://leetcode.com/problems/binary-tree-level-order-traversal/

    public List<List<Integer>> levelOrder(TreeNode root) {


        List<List<Integer>> ans= new ArrayList<>();

        Queue<TreeNode> q= new LinkedList<>();

        if( root==null) return ans;
        q.add(root);

        while( q.size()!=0){
            List<Integer> x= new ArrayList<>();

            // q.size() is changing inside the loop so pre calculate it
            int n=q.size();

            for( int i=0; i< n; i++){

                TreeNode aa= q.poll();
                x.add( aa.val);

                if(aa.left!=null)q.add(aa.left);
                if(aa.right!=null)q.add(aa.right);
            }

            ans.add(x);
        }

        return ans;
    }
}
