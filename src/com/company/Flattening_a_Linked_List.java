package com.company;

public class Flattening_a_Linked_List {

    //Flattening a Linked List
    //https://www.youtube.com/watch?v=ysytSSXpAI0&ab_channel=takeUforward
    //https://practice.geeksforgeeks.org/problems/flattening-a-linked-list/1#


    class Node
    {
        int data;
        Node next;
        Node bottom;

        Node(int d)
        {
            data = d;
            next = null;
            bottom = null;
        }
    }

    Node flatten(Node root)
    {
        if( root== null || root.next== null) return root;

        root.next= flatten( root.next);

        return merge( root.next, root);

    }

    Node merge( Node l1,  Node l2){


        Node ans= new Node(0);
        Node t= ans;

        Node h1= l1;
        Node h2= l2;

        while( h1!=null && h2!=null){

            if( h1.data> h2.data){
                t.bottom= h2;
                h2= h2.bottom;
            }
            else{
                t.bottom= h1;
                h1= h1.bottom;
            }
            t=t.bottom;
        }

        while( h1!=null){
            t.bottom= h1;
            h1= h1.bottom;
            t=t.bottom;
        }

        while( h2!=null){
            t.bottom= h2;
            h2= h2.bottom;
            t=t.bottom;
        }

        // thougt so
        //t.bottom= null;
        return ans. bottom;
    }
}
