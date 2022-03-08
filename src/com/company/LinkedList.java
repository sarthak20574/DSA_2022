package com.company;

import java.util.HashSet;

public class LinkedList {
    static class Node{
        int value;
        Node next;

        Node(int value){
             this.value= value;
        }
    }

    Node head;

    public void push(int new_value){

        Node newNode= new Node(new_value);
        newNode.next= head;
        head= newNode;
    }

    //Add a node after a given node
    public void insertAfterGivenNode(Node givenNode, int new_value){

        if(givenNode== null){
            System.out.println("previous node can't be null");
            return;
        }
        Node newNode= new Node(new_value);
        newNode.next= givenNode.next;
        givenNode.next= newNode;
    }

    //Add a node at the end
    public void appendANewNode(int newValue){
        Node newNode= new Node(newValue);

        if( head==null){
            head= newNode;
            return;
        }

        Node cur= head;

        while (cur.next!=null){
            cur= cur.next;
        }
        cur.next=newNode;
    }

    //Delete xth node from a singly linked list
    void deleteNodeAtPosition(int x) {
        if (x==1) {
            head=head.next;
            return;
        }

        Node cur= head;
        for( int i=0; i<x-2; i++){
            cur=cur.next;
        }
        cur.next= cur.next.next;
    }

    //havn't checked
    void  deleteNodeWithAKey(int key){
        if( head!=null && head.value==key){
            head=null;
            return;
        }
        Node cur= head;
        while (cur!=null && cur.next.value!=key){
            cur=cur.next;
        }

        if(cur==null ) return;

        cur.next= cur.next.next;
    }

    public void length(){
        int count=0;
        Node cur= head;
        while (cur!=null){
            cur=cur.next;
            count++;
        }
        System.out.println (count);
    }


    public void lengthUsingRecursion(){
        Node cur= head;
        System.out.println(secondaryFunctionLength(cur));
    }

    private int secondaryFunctionLength(Node head) {
        if(head==null) return 0;
        return 1+ secondaryFunctionLength(head.next);
    }


    public void printLinkedList(){

        Node cur= head;
        while (cur!=null){
            System.out.print(cur.value+" ");
            cur=cur.next;
        }

    }

    public void deleteAlternate (Node head) {
        Node cur, prev=head;
        cur= prev.next;

        if( head==null){
            return;
        }

        while (prev!=null && prev.next!=null){
            cur= prev.next;
            prev.next= cur.next;
            prev=prev.next;
        }


//      their solution
//    if (head == null)
//            return;
//
//    Node prev = head;
//    Node now = head.next;
//
//       while (prev != null && now != null)
//    {
//        /* Change next link of previous node */
//        prev.next = now.next;
//
//        /* Free node */
//        now = null;
//
//        /*Update prev and now */
//        prev = prev.next;
//        if (prev != null)
//            now = prev.next;
//    }
}

    //Nth node from end of linked list
    int getNthFromLast(Node head, int n)
    {
        Node cur= head;
        int length=0;
        while (cur!=null) {length++;
            cur=cur.next;
        }
        if( n>length) return -1;

        //System.out.println("cur data:"+cur.data);
        //System.out.println("l:"+length);
        int position=length-n+1;
        //System.out.println("pos:"+position);

        if( position==1) return head.value;
        for (int i=0 ; i< position-1; i++){
            head=head.next;
        }
        //System.out.println("cur data:"+cur.data);
        //System.out.println("head data:"+head.data);
        return head.value;

    }

    //recursive solution learn
    static void printNthFromLast( int n)
    {
//        int i = 0;
//
//        if (head == null)
//            return;
//        printNthFromLast(head.next, n);
//
//        if (++i == n)
//            System.out.print(head.value);
    }
    //Maintain two pointers – reference pointer and main pointer. Initialize
    // both reference and main pointers to head. First, move the reference pointer
    // to n nodes from head. Now move both pointers one by one until the reference
    // pointer reaches the end. Now the main pointer will point to nth node from the
    // end. Return the main pointer

    int method2pointer(int n){
        Node main_ptr=head;
        Node ref_ptr=head;

        while (ref_ptr!=null && n>0){
            ref_ptr=ref_ptr.next;n--;
        }
        if (n!=0){
            return -1;
        }

        while (ref_ptr!=null){
            ref_ptr=ref_ptr.next;
            main_ptr=main_ptr.next;
        }
        return main_ptr.value;
    }

    //Finding middle element in a linked list
    int getMiddle(){

        Node slow= head;
        Node fast= head;

        while (fast!=null && fast.next!=null){
            slow= slow.next;
            fast= fast.next.next;
        }

        return slow.value;

    }

    //Detect loop in a linked list

    boolean detectALoop(){
        Node cur= head;
        HashSet<Node> set= new HashSet<>();
        while (cur!= null){
            if( set.contains(cur)){
                return true;
            }

            set.add(cur);
            cur=cur.next;
        }
        return false;
    }


    void makingALoop(int pos){

        Node ptr_at_pos = head;

        for( int i=0; i< pos-1; i++){
            ptr_at_pos = ptr_at_pos.next;
        }

        Node cur= ptr_at_pos;

        while (cur.next!= null){
            cur= cur.next;
        }

        cur.next= ptr_at_pos;

    }
    void reversListIterative(){
        Node ptr1=null;
        Node ptr2=head;
        Node ptr3;

        while (ptr2!= null){
            ptr3= ptr2.next;
            ptr2.next= ptr1;// 1 <-2  3

            ptr1= ptr2;  // 1 <- 2  3 -> 4
            ptr2=ptr3;

        }
        //return ptr1 as the new head

    }
    Node reversListRecursive(Node head){
        // 1 -> 2 <- 3 <- 4 suppose all the previous ones were reversed
        //then we will get the head of the next node or the head from other side or
        // the node whose next we will have to set to next so just need to reverse the second node or 2 should point to 1
        // and we will get next= first node

        if( head==null || head.next==null){
            return head;
        }

        Node newHead= reversListRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }

//    Node iterating_K_nodes(Node h){
//
//
//    }


    Node Reverse_K_nodes_in_a_LinkedList() {
        //first reverse the 1st k nodes suing the iterative method then the remaining k nodes
        //  after (k+1)th nodes call the function again, ie, use recursion...while reversing
        // using the iterative way, the prev ptr pts to the last element( remember the cond
        // while(cur!=null) but the head still points to the first node
        //  1 <- 2  4 -> 3 -> 6 -> 5  now head.next= incoming head from the recursive funciton
        //prev is the new head


        Node prev=null, cur=head,next;


       // while ()
        while (cur!= null){
            next= cur.next;
            cur.next= prev;

            prev=cur;
            cur= next;
        }
        return prev;
        //head.next=iterating_K_nodes(head);

        //return prev;

    }
}
