package com.company.LeetCode_DailyChallenge;

public class Delete_the_Middle_Node_of_a_Linked_List {

    //2095. Delete the Middle Node of a Linked List
    //https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/


    /*
     stop just before the mid node and then delete the mid node.
            (we find the mid node using the slow(moves 1 node/iteration) and fast pointer(moves 2 noses/ iteration))
     */

    public static class ListNode {
        int val;
       ListNode next;

        ListNode(int x, ListNode next) {
            val = x;
            this.next = next;
        }
    }
    public ListNode deleteMiddle(ListNode head) {

        //we create a dummy and set the slow and the fast pointer to it
        ListNode temp=new ListNode(0,head);
        ListNode slow= temp;
        ListNode fast= slow;

        //stop just before the mid node
        while( fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        //delete the next,ie, the middle node
        slow.next=slow.next.next;

        //return our dummy nodes's next as the new head
        return temp.next;
    }



}
