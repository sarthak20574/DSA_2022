package com.company.LeetCode_DailyChallenge;

public class Count_Good_Nodes_in_Binary_Tree {


    //1448. Count Good Nodes in Binary Tree
    //https://leetcode.com/problems/count-good-nodes-in-binary-tree/description/


    //a variable to record our answer
    int ans=0;

    public int goodNodes(TreeNode root) {
        //dfs on the node and note the current max element
        fn( root, root.val);
        return ans;
    }

    void fn( TreeNode r, int max){

        if(r==null) return;

        // if the current node value is greater than or = to the current max, we increment our answer ans update our current max and then call the left and the right tree

        if( r.val >=max) {
            ans++;
            fn(r.left, r.val);
            fn(r.right, r.val);
        }
        else{
            fn(r.left, max);
            fn(r.right, max);
        }
    }

}
