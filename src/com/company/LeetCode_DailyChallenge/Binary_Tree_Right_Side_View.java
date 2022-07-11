package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_Right_Side_View {

    //199. Binary Tree Right Side View
    //https://leetcode.com/problems/binary-tree-right-side-view/submissions/
    //https://www.youtube.com/watch?v=jCqIr_tBLKs&ab_channel=KevinNaughtonJr.


    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> ans= new ArrayList<>();

        if( root==null) return ans;

        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);

        while( q.isEmpty()==false){
            int n= q.size();

            for( int i=0; i< n; i++){
                TreeNode x= q.poll();
                if( x.left!=null) q.add( x.left);
                if( x.right!=null) q.add( x.right);
                if( i==n-1)ans.add( x.val);
            }

        }
        return ans;
    }


    List<Integer> ans= new ArrayList<>();
    public List<Integer> rightSideView1(TreeNode root) {
        fn( root, 0);

        return ans;
    }

    void fn( TreeNode root, int level){

        if( root==null) return;

        if( level== ans.size()){
            ans.add( root.val);
        }

        fn( root.right, level+1);
        fn(root.left, level+1);
    }
}
