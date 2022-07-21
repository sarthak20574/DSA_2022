package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {

    //105. Construct Binary Tree from Preorder and Inorder Traversal
    //https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
    //https://www.youtube.com/watch?v=aZNaLrVebKQ&ab_channel=takeUforward

    /*
    pre order traversal is root-left-right so the first element is always the root of the list of the tree, we find the postion of the root in the given inorder travedrsal array(left-root-right) and then all the element to the left of the root in the array belong to the left subtree of the tree and....
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        Map<Integer, Integer> map= new HashMap<>();

        for( int i=0; i<inorder.length; i++){
            map.put( inorder[i], i);
        }

        return fn(preorder,0, preorder.length-1 ,
                inorder, 0, inorder.length-1,map);
    }

    TreeNode fn( int[] pre, int pre_s, int pre_e,
                 int[] in, int in_s, int in_e, Map<Integer,Integer> map){

        if( in_s>in_e || pre_s>pre_e) return null;

        int mid_index=map.get(pre[pre_s]);

        int len= mid_index-in_s;

        TreeNode t= new TreeNode(pre[pre_s]);

        t.left= fn(pre, pre_s+1, pre_s+len,in, in_s, mid_index-1, map);

        t.right=fn(pre, pre_s+len+1, pre_e,in, mid_index+1, in_e, map);

      return t;
    }
}
