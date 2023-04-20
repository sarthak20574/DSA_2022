package com.company.LeetCode_DailyChallenge;

public class Longest_ZigZag_Path_in_a_Binary_Tree {

    //1372. Longest ZigZag Path in a Binary Tree
    //https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/description/


    int ans=0;
    public int longestZigZag(TreeNode r) {
        ans=0;
        fn( r.left, 1, false);
        fn( r.right, 1, true);

        return ans;

    }

    void fn( TreeNode r, int cur, boolean ryt){

        if( r==null) return;

        ans= Math.max(ans, cur);

        if( ryt==true){

            fn( r.left, cur+1, false);
            fn( r.right, 1, true);

        }
        else{
            fn( r.left, 1, false);
            fn( r.right, cur+ 1, true);
        }


    }
}
