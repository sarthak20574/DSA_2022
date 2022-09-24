package com.company.LeetCode_DailyChallenge;

public class Pseudo_Palindromic_Paths_in_a_Binary_Tree {

    //1457. Pseudo-Palindromic Paths in a Binary Tree
    //https://leetcode.com/problems/pseudo-palindromic-paths-in-a-binary-tree/description/
    //https://www.youtube.com/watch?v=vnoIf46JtAo&ab_channel=CodewithAlisha

/*
# Intuition

We traverse from root to the leaf nodes, keeping a count of each no (root.cal) that occurs on the way( in a frequency array), on reaching the leaf node, we check if using the numbers that we have recorded from the root to the leaf node in our counter can form a palindrome. then we back track and hunt for other leaf nodes.
 */

    // global var to store our answer
    int ans;

    public int pseudoPalindromicPaths (TreeNode root) {

        // a counter to count the no of times the number(index+1, so 0 stands for 1, 1 for 2...) occurs
        int[] freq= new int[9];

        ans=0;
        dfs(root, freq);

        return ans;
    }


    void dfs( TreeNode r, int[] freq){

        if( r==null) return;

        //on reaching a new node we update our counter
        freq[r.val-1]++;

        // if its the leaf node we can check if the number is a palindrome
        if( r.left==null && r.right==null){


            // there are 2 types of palindromes even(ie, with 0 odd element count)
            // and odd (with 1 off element count)
            int no_odd=0;
            for( int i=0; i<9; i++){
                if( freq[i]%2!=0)no_odd++;
            }
            if( no_odd<=1) ans++;


        }

        dfs(r.left, freq);

        dfs(r.right, freq);

        // when backtracking we remove the visited element
        freq[r.val-1]--;

    }
}
