package com.company.LeetCode_DailyChallenge;

public class Construct_String_from_Binary_Tree {

    //https://leetcode.com/problems/construct-string-from-binary-tree/
    //https://www.youtube.com/watch?v=b1WpYxnuebQ&ab_channel=NeetCode

    String ans="";

    public String tree2str(TreeNode root) {

        fn( root);


        StringBuilder anss= new StringBuilder(ans);


        // delete the first and the last ( & )
        anss.deleteCharAt(0);
        anss.deleteCharAt(anss.length()-1);
        return anss.toString();
    }

    void fn( TreeNode r){

        if(r==null){
            ;// or return
        }
        else{

            // add the opening and the value
            ans+="(";
            ans+=r.val;

            // if root has a right child but not a left child we add a pair of bracket
            if( r.left==null && r.right!=null)ans+="()";

            fn( r.left);

            fn( r.right);

            // at the end, add the the closing bracket
            ans+=")";
        }
    }
}
