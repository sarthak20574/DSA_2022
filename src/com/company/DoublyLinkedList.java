package com.company;

public class DoublyLinkedList {

    class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data= data;
        }
    }

    Node head;


    public void printList(){
        Node cur= head;

        while (cur!=null){
            System.out.print(cur.data);
            cur=cur.next;
        }
        System.out.println();
    }

    public void push(int data){
        Node newNode= new Node(data);

        if(head !=null){
            head.prev = newNode;
        }
        newNode.next=head;
        head= newNode;
    }

    public void insertAfterGivenNode(Node givenNode, int data){

        if( givenNode==null){
            //node doesn't exist
            System.out.println("Given previous node can't be null");
            return;
        }
        Node newNode= new Node(data);

        newNode.next=givenNode.next;
        newNode.prev=givenNode;

        givenNode.next=newNode;

        if(newNode.next!=null){
            newNode.next.prev=newNode;
        }
    }

    public void insertAtEnd(int data){

        Node newNode= new Node(data);
        Node cur= head;
        while (cur.next!=null){
            cur= cur.next;
        }

        if(cur!=null)
            //or just call insert at head function
        cur.next= newNode;

        newNode.prev=cur;

    }
    void addNodeAfterIndex( int pos, int data)
    {

        int count= 0 ;
        Node cur= head;
        while (cur!=null && count!=pos){
            cur=cur.next;
            count++;
        }

        Node newNode=new Node(data);

        newNode.next= cur.next;
        newNode.prev=cur;

        if(cur.next!=null){
            cur.next.prev=newNode;
        }
        cur.next=newNode;

    }

    public void delete(Node givenNode){

        if( givenNode==null || head== null){
            System.out.println("Null node can't be deleted");
            return;
        }

        if(givenNode.prev!=null){
            givenNode.prev.next=givenNode.next;
        }

        if( givenNode.next!= null){
            givenNode.next.prev=givenNode.prev;
        }
    }

    //The task is to delete a node from given position in a doubly linked list.
    Node deleteNode(Node head,int x)
    {

        int count=0;
        Node cur= head;

        //if head is to be deleted the head.next and head.prev will be null
        if( cur==null || head== null){
            System.out.println("Null node can't be deleted");
            return head;
        }

        if( x==1){
            head=head.next;
            return head;
        }

        while (cur!=null && count!= x-1){
            cur= cur.next;
            count++;
        }

        if(cur.prev!=null){
            cur.prev.next=cur.next;
        }

        if( cur.next!= null){
            cur.next.prev=cur.prev;
        }
        return head;

    }

}

