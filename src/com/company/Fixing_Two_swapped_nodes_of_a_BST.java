package com.company;

public class Fixing_Two_swapped_nodes_of_a_BST {

    //Fixing Two swapped nodes of a BST
    //https://practice.geeksforgeeks.org/problems/6c4053871794c5e7a0817d7eaf88d71c4bb4c2bc/1

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




    Node x1 = null, x2 = null, prev= new Node(Integer.MIN_VALUE);

    public Node correctBST(Node root) {

        x1 = null; x2 = null; prev= new Node(Integer.MIN_VALUE);

        fn( root);


        // if( x1!=null){
        int t= x1.data;
        x1.data= x2.data;
        x2.data=t;
        //}


        return root;
    }

    void fn( Node r){

        if( r==null) return;


        fn( r.left);



        if( prev.data > r.data){

            // System.out.println("In");
            if( x1==null){
                x1= prev;
                x2= r;
            }
            else {

                // 2nd one will be smaller then the first one that why it belongs to the front
                x2=r;
            }

        }
        prev= r;

        fn(r.right);
    }
}
