package com.company;

import java.util.ArrayList;
import java.util.List;

public class BST_to_max_heap {

    //BST to max heap
    //https://www.youtube.com/watch?v=9GeQwbAg_Tg&ab_channel=SagarMalhotra
    //https://practice.geeksforgeeks.org/problems/bst-to-max-heap/1

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


    static int i=0;
    public static void convertToMaxHeapUtil(Node root)
    {
        List<Integer> l= new ArrayList<>();
        i=0;


        // store the sorted elements in thw list
        inorder(root, l);


        // fill the tree in post order
        postorder(root, l);

    }

    static void inorder( Node r, List<Integer> l){

        if( r== null) return;

        inorder(r.left, l);
        l.add( r.data);
        inorder( r.right, l);
    }

    static void postorder(Node r, List<Integer> l){
        if( r==null) return;

        postorder( r.left,l);
        postorder( r.right, l);

        r.data= l.get(i++);
    }



}
