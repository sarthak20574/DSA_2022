package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Serialize_and_Deserialize_Binary_Tree {

    public class Codec {


        //297. Serialize and Deserialize Binary Tree
        //https://leetcode.com/problems/serialize-and-deserialize-binary-tree/description/
        //see neetcode's vid or striver's

        List<String> li;
        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            li= new ArrayList<>();

            fn1(root);

            return String.join(",",li);
        }

        void fn1( TreeNode r){
            if( r==null) {
                li.add("N");
                return;
            }
            li.add(String.valueOf(r.val));
            fn1( r.left);
            fn1(r.right);
        }


        int j;
        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            System.out.println(data);

            j=0;

            return fn(data.split(","));

        }



        TreeNode fn(String[] l){

            String vall=l[j++];
            if( vall.equals("N")) return null;
            TreeNode neww= new TreeNode(Integer.parseInt(vall));
            neww.left=fn(l);
            neww.right=fn(l);
            return neww;
        }
    }

}
