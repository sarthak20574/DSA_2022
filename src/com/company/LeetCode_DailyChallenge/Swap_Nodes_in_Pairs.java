package com.company.LeetCode_DailyChallenge;

public class Swap_Nodes_in_Pairs {

    //24. Swap Nodes in Pairs
    //https://leetcode.com/problems/swap-nodes-in-pairs/

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode swapPairs(ListNode head) {


        //create a dummy node,
        ListNode temp= new ListNode(0), t1=head;
        ListNode ret= temp;

        // corner case
        if( head==null || head.next==null) return head;

        //2nd node
        ListNode t2=head.next;

        while(t2!=null && t2.next!=null){

            //store the next 1st and 2nd node in some temporary variables
            ListNode temp1=t2.next;
            ListNode temp2= t2.next.next;

            //add the second node and then the first node
            temp.next=t2;
            temp= temp.next;
            temp.next=t1;
            temp= temp.next;

            //update the first and the second node
            t1= temp1;
            t2=temp2;
        }

        //add the last 2nd node if it is not null this also handles the odd length Linked list case
        if( t2!=null){
            temp.next=t2;
            temp=temp.next;
        }

        // add the last first node
        temp.next=t1;
        temp=temp.next;

        // update the last connection to null to break cycle in case of even linked list
        temp.next=null;

        return ret.next;
    }
}
