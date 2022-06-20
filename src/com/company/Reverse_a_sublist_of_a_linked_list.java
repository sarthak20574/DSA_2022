package com.company;

public class Reverse_a_sublist_of_a_linked_list {
    //https://www.youtube.com/watch?v=RF_M9tX4Eag


    static class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    public static Node reverseBetween(Node head, int m, int n)
    {
        //create a dummy node
        Node dummy= new Node(0);
        dummy.next=head;

        //iterate m-1 times
        Node prev_conn= dummy;
        Node conn= head;


        for( int i=0; i<m-1; i++){
            prev_conn=conn;
            conn= conn.next;
        }

        Node prev= null;
        Node cur= conn;

        for(int i=0; i<n-m+1; i++) {
            Node nxt= cur.next;
            cur.next= prev;
            prev= cur;
            cur= nxt;
        }

        prev_conn.next.next=cur;

        prev_conn.next= prev;

        return dummy.next;
    }
}
