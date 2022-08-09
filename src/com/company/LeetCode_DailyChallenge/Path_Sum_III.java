package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Path_Sum_III {

    //437. Path Sum III
    //https://leetcode.com/problems/path-sum-iii/

    public int pathSum(TreeNode root, int targetSum) {

        Map<Long, Integer> m= new HashMap<>();
        m.put(0L,1);

        return fn(root, targetSum, m, 0);

    }

    int fn( TreeNode root, int aim, Map<Long, Integer> m, long cur_sum){

        // base case
        if( root==null) return 0;


        // get the prefix sum till this node
        cur_sum+=root.val;


        // if cur_sum-aim exists in the hash map then we found have found subset/subsets ( similar to "Subarray sum equals K" problem)
        int subsets=0;
        if( m.containsKey(cur_sum-aim)==true){
            subsets+=m.get(cur_sum-aim);
        }

        // add the newly calculated prefix sum too
        m.put(cur_sum,m.getOrDefault(cur_sum, 0)+1);


        // get the subsets from its left and thge right children

        subsets+= fn(root.left, aim, m, cur_sum) + fn(root.right, aim, m, cur_sum);

        //after calculating, we now remove the cur_sum from the map so that it doesn't get counted if the left or the right subarray is still to be traversed...
        m.put(cur_sum, m.get(cur_sum)-1);

        return subsets;

    }

}
