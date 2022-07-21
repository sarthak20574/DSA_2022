package com.company.LeetCode_DailyChallenge;

public class Reverse_Linked_List_II {

    //92. Reverse Linked List II
    //https://leetcode.com/problems/reverse-linked-list-ii/


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x, ListNode h) {
            val = x;
            next = h;
        }

    }

    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode to_ret= new ListNode(0, head);

        ListNode t1= to_ret, t2= to_ret;


        for( int i=0; i<left-1;i++){
            t1=t1.next;
        }

        // reversing
        ListNode prev=null;
        ListNode cur= t1.next;
        ListNode cur_old= t1.next;
        ListNode nxt;
        for( int i=0; i<right-left+1; i++){
            nxt= cur.next;
            cur.next=prev;
            prev=cur;
            cur=nxt;
        }

        cur_old.next=cur;
        t1.next=prev;

        return to_ret.next;
    }


}
