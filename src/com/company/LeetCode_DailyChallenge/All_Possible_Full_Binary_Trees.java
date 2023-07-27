package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class All_Possible_Full_Binary_Trees {

    //894. All Possible Full Binary Trees
    //https://leetcode.com/problems/all-possible-full-binary-trees/
    //see neetcode's vid

    public List<TreeNode> allPossibleFBT(int n) {

        return fn( n);
    }
    List<TreeNode> fn(int n){
        List<TreeNode> res= new ArrayList<>();

        if( n==0) return res;

        if( n==1){
            res.add( new TreeNode(0));
            return res;
        }

        // List<TreeNode> res= new ArrayList<>();

        for( int i=1; i<n; i+=2){

            List<TreeNode> l= fn( i);
            List<TreeNode> r= fn( n-i-1);

            for( TreeNode lt: l){

                for( TreeNode rt: r){
                    res.add(new TreeNode(0,lt,rt));
                }
            }
        }
        return res;
    }

}
