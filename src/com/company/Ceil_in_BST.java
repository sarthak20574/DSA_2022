package com.company;

public class Ceil_in_BST {

    //Ceil in BST
    //https://practice.geeksforgeeks.org/problems/implementing-ceil-in-bst/1#
    //https://www.youtube.com/watch?v=KSsk8AhdOZA&ab_channel=takeUforward


    class Node {
        int data;
       Node left;
       Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    int ans;
    int findCeil(Node root, int key) {

        fn( root, key, -1);
        return ans;

    }

    void fn( Node root, int x, int prev){

        if( root==null){
            ans= prev;
            return;
        }

        if( root.data==x){
            ans= x;
        }

        else if(root.data>x){
            fn(root.left, x, root.data);
        }
        else{
            fn( root.right,x,prev);
        }
    }
}
