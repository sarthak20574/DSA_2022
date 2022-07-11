package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Diagonal_Traversal_of_Binary_Tree {

    //Diagonal Traversal of Binary Tree
    //https://practice.geeksforgeeks.org/problems/diagonal-traversal-of-binary-tree/1
    //https://www.youtube.com/watch?v=LhXPvhrhcIk&ab_channel=CodeLibrary-byYogesh%26Shailesh

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

    public ArrayList<Integer> diagonal(Node root) {

            ArrayList<Integer> ans= new ArrayList<>();
        Queue<Node> q= new LinkedList<>();
        q.add(root);

        while( q.isEmpty()==false){
            Node t= q.poll();

            while( t!=null){

                ans.add(t.data);
                if( t.left!= null){
                    q.add(t.left);
                }

                if( t.right==null) break;
                else {
                    t= t.right;
                }
            }
        }

        return ans;
    }


}
