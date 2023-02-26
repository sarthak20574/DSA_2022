package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_Zigzag_Level_Order_Traversal {

    //103. Binary Tree Zigzag Level Order Traversal
    //https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> ans= new ArrayList<>();

        Queue<TreeNode> q= new LinkedList<>();

        if( root==null) return ans;

        q.add(root);

        int straight=0;

        while (q.isEmpty()==false){

            int n= q.size();


            List<Integer> cur= new ArrayList<>();

            for( int i=0; i<n; i++){

                TreeNode x= q.poll();

                if( straight%2==0){
                    cur.add(x.val);
                }
                else{
                    cur.add(0,x.val);
                }

                if(x.left!=null)
                    q.add(x.left);

                if(x.right!=null)
                    q.add(x.right);

            }
            ans.add(cur);

            straight++;
        }

        return ans;
    }


}
