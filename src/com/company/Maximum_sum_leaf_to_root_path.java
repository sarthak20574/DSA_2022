package com.company;

public class Maximum_sum_leaf_to_root_path {

    //Maximum sum leaf to root path
    //https://practice.geeksforgeeks.org/problems/maximum-sum-leaf-to-root-path/1

    class Node{
        int data;
        Node left;
       Node right;
    }

    static int ans=0;
    public static int maxPathSum(Node root)
    {

        ans=0;
        fn( root, 0);

        return ans;
    }


    static void fn( Node root, int sum){

        if( root== null){
            ans = Math.max( sum, ans);
            return;
        }


        fn( root.left, sum+root.data);
        fn( root.right, sum+root.data);

    }

}
