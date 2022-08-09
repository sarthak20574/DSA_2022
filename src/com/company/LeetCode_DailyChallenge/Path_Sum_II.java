package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Path_Sum_II {


    //113. Path Sum II
    //https://leetcode.com/problems/path-sum-ii/


    // if we have reached a null then just return as we couldn't find any path whose val us the target sum
// else if this is a leaf node then we check if the differnce of the sum and the node's val is 0 then we add the current lsit to our answer
// else just reduce the sum by the node's value after adding the current element to our list

    public List<List<Integer>> pathSum(TreeNode root, int target) {

        List<List<Integer>> ans=new ArrayList<>();
        fn( root, target,new ArrayList<>() , ans);

        return ans;
    }

    void fn( TreeNode root, int target, List<Integer> pres_ans, List<List<Integer>> ans){

        if( root== null) return;

        else if( root.left==null && root.right== null && target-root.val==0){
            pres_ans.add(root.val);
            ans. add( new ArrayList<>(pres_ans));
        }
        else {

            // lists are passed by reference in java so we create a copy of the list(temp) and pass it around.
            List<Integer> temp= new ArrayList<>(pres_ans);
            pres_ans.add(root.val);
            fn( root.left,target-root.val,pres_ans , ans);
            temp.add(root.val);
            fn( root.right,target-root.val, temp, ans);
        }

    }
}
