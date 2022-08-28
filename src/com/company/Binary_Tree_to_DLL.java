package com.company;

public class Binary_Tree_to_DLL {



//Binary Tree to DLL
//https://practice.geeksforgeeks.org/problems/binary-tree-to-dll/1
//https://www.youtube.com/watch?v=nGNoTdav5bQ&ab_channel=AnujBhaiya

    class Node {
        Node left, right;
        int data;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

        class Solution
    {
        Node head, prev;
        Node bToDLL(Node root)
        {
            head=null;
            prev=null;

            fn(root);

            return head;
        }

        void fn( Node root){

            if( root==null) return;

            fn( root.left);

            //only possible if the node is not null and there his no prev node so it must be the start of the list
            if(prev==null) head=root;
            else{
                root.left=prev;
                prev.right=root;
            }

            //update the prev to the cur node to move on
            prev=root;

            fn(root.right);
        }
    }
}
