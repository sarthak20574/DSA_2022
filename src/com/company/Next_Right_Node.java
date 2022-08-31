package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Next_Right_Node {


    //Next Right Node
    //https://practice.geeksforgeeks.org/problems/next-right-node/1


    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }

    Node nextRight(Node root, int key)
    {
        Queue<Node> q= new LinkedList<>();

        if( root!=null) q.add(root);

        while(q.isEmpty()==false){
            int n= q.size();

            for( int i=0; i<n;i++){

                Node x= q.poll();

                if(x.data==key){

                    if( i==n-1) return new Node(-1);
                    else return q.poll();
                }

                if( x.left!=null) q.add(x.left);
                if( x.right!=null) q.add(x.right);

            }
        }

        return new Node(-1);
    }

}
