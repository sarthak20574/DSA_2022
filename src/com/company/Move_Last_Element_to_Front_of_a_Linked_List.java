package com.company;

public class Move_Last_Element_to_Front_of_a_Linked_List {

    //Move Last Element to Front of a Linked List
    //https://practice.geeksforgeeks.org/problems/move-last-element-to-front-of-a-linked-list/1

    static class Node
    {
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }
    }

    public static Node moveToFront(Node head) {

        if( head==null || head.next==null) return head;

        Node t= head, prev=null;


        while( t.next!=null){
            prev= t;
            t= t.next;
        }


        Node new_head= new Node(t.data);
        prev.next=null;
        new_head.next=head;
        return new_head;
    }


}
