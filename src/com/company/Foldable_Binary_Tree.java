package com.company;

public class Foldable_Binary_Tree {


    //Foldable Binary Tree
    //https://practice.geeksforgeeks.org/problems/foldable-binary-tree/1

    // similar to symetrric tree leetcode problem


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
    boolean IsFoldable(Node node)
    {
        if( node==null) return true;

        return  fn( node, node);
    }

    boolean fn( Node x, Node y){

        if( x==null && y==null) return true;

        else if( x==null || y==null) return false;

        return fn(x.right,y.left) && fn( x.left, y.right);
    }

}
