package com.company.LeetCode_DailyChallenge;

public class Find_a_Corresponding_Node_of_a_Binary_Tree_in_a_Clone_of_ThatTree {

    //1379. Find a Corresponding Node of a Binary Tree in a Clone of That Tree
    //https://www.youtube.com/watch?v=uA-xgw-AZbs

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

        //base

        if( original==null) return null;
        if(original==target )return cloned;

        //traverse left can't retutn null so check it
        TreeNode x= getTargetCopy(original.left, cloned.left, target);

        if(x!=null)
            return x;

        return getTargetCopy(original.right, cloned.right,target);
    }

}
