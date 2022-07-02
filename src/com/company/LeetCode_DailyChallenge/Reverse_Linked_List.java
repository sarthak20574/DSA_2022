package com.company.LeetCode_DailyChallenge;

public class Reverse_Linked_List {
    //206. Reverse Linked List
    //https://leetcode.com/problems/reverse-linked-list/


    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode reverseList(ListNode head) {


        // keep 3 pointers prev, cur and nxt, to reverse the LL, we change the cur's next to
        // prev node and the next node is remebered by the nxt pointer,
        // then make  new prev as the old cur and the new cur as the old nxt node



        // start the prev from null else cur.next= head and not null( it becomes the tail at after the reversal) forming a cycle

        ListNode prev= null, cur= head;
        while( cur!=null){
            ListNode nxt= cur.next;

            cur.next= prev;
            prev= cur;
            cur= nxt;
        }

        return prev;

    }
}
