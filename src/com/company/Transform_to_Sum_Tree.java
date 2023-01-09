package com.company;

public class Transform_to_Sum_Tree {

    //Transform to Sum Tree
    //https://practice.geeksforgeeks.org/problems/d7e0ce338b11f0be36877d9c35cc8dfad6636957/1

    class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = null;
            right = null;
        }
    }



    public void toSumTree(Node root){
        fn( root);
    }

    int fn( Node r){

        if(r==null) return 0;

        int x1= fn( r.left);
        int x2= fn( r.right);

        int temp= r.data;

        r.data= x1+x2;

        return temp+ r.data;
    }
}
