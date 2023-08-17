package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Unique_Binary_Search_Trees_II {

    //95. Unique Binary Search Trees II
    //https://leetcode.com/problems/unique-binary-search-trees-ii/description/
    // see neetcode's vid

    public List<TreeNode> generateTrees(int n) {

        return fn( 1, n);

    }


    List<TreeNode> fn( int l, int r){

        List<TreeNode> li= new ArrayList<>();

        if( l>r){
            li.add(null);
            return new ArrayList<>(li);


        }

        //  System.out.println( l+" "+r);


        for( int i=l; i<=r; i++){

            List<TreeNode> x=fn( l,i-1 );
            List<TreeNode> y= fn( i+1, r);




            for( TreeNode j: x){

                for( TreeNode jj: y){

                    TreeNode c= new TreeNode(i);
                    c.left= j;
                    c.right= jj;
                    li.add(c);
                }
            }

        }

        return new ArrayList<>(li);
    }


    }
