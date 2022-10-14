package com.company.LeetCode_DailyChallenge;

import java.util.HashSet;
import java.util.Set;

public class Two_Sum_IV_Input_is_a_BST {

    //653. Two Sum IV - Input is a BST
    //https://leetcode.com/problems/two-sum-iv-input-is-a-bst/description/


    //a  hash set to store the seen root values
    Set<Integer> x;

    boolean ans;
    public boolean findTarget(TreeNode root, int k) {
        x= new HashSet<>();
        ans=false;

        fn( root, k);

        return ans;
    }

    void fn( TreeNode root,int k){

        if( root== null || ans==true) return;

        // if the we have already visited an element which on addition with the current node value gives us k then we are done
        if( x.contains(k-root.val)==true){
            ans= true;
            return;
        }

        // add the current element to our hashset
        x.add(root.val);
        fn( root.left, k);
        fn( root.right, k);
    }

}
