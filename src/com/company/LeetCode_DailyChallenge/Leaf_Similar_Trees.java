package com.company.LeetCode_DailyChallenge;

public class Leaf_Similar_Trees {

    //872. Leaf-Similar Trees
    //https://leetcode.com/problems/leaf-similar-trees/description/

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        StringBuilder x1 = new StringBuilder(), x2= new StringBuilder();

        fn(root1,x1);
        fn(root2,x2);

        System.out.println(x1.toString());
        System.out.println(x2.toString());

        return x1.toString().equals(x2.toString());
    }

    void fn( TreeNode r, StringBuilder x){

        if(r==null) return;
        else if( r.right==null && r.left==null){
            x.append(r.val);
            x.append(" ");
        }


        fn( r.left,x);
        fn( r.right,x);
    }


}
