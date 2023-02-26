package com.company;

public class Reverse_both_parts {

    //Reverse both parts
    //https://practice.geeksforgeeks.org/problems/bae68b4d6a2a77fb6bd459cf7447240919ebfbf5/1


    class Node
    {
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }
    }


    public static Node reverse(Node head, int k) {

        // 1 2 3

        Node prev=null, cur= head;

        for( int i=0; i<k; i++){
            prev= cur;
            cur= cur.next;
        }
        prev.next=null;


        // 1 2   3 4 5

        // 2 1   5 4 3

        Node h1=reverse(head);
        Node h2= reverse(cur);

        head.next=h2;

        return h1;
    }


    static Node reverse(Node h){

        Node prev= null, cur= h, nxt;

        while(cur!=null){

            nxt= cur.next;

            cur.next= prev;

            prev= cur;
            cur= nxt;
        }

        return prev;
    }
}
