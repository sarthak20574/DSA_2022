package com.company.LeetCode_DailyChallenge;

import java.util.LinkedList;
import java.util.Queue;

public class Check_Completeness_of_a_Binary_Tree {

    //958. Check Completeness of a Binary Tree
    //https://leetcode.com/problems/check-completeness-of-a-binary-tree/
    //https://www.youtube.com/watch?v=j16cwbLEf9w&ab_channel=NickWhite


    // we do a level order traversal and if we meet a null node which is not the last node on the level order traversal we return false
    public boolean isCompleteTree(TreeNode root) {

        boolean catch_null_node= false;

        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);

        while( q.isEmpty()==false){

            TreeNode x= q.poll();

            if(x!= null && catch_null_node==true) return false;

            if(x==null){
                catch_null_node=true;
            }
            if( x!=null){
                q.add(x.left);
                q.add(x.right);
            }


        }
        return true;
    }
}
