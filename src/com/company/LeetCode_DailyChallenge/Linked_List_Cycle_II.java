package com.company.LeetCode_DailyChallenge;

public class Linked_List_Cycle_II {

    //142. Linked List Cycle II
    //https://leetcode.com/problems/linked-list-cycle-ii/


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    public ListNode detectCycle(ListNode head) {

        ListNode slow= head;
        ListNode fast= head;

        while( fast!=null && fast.next!=null){
            slow= slow.next;
            fast=fast.next.next;
            if( fast==slow) break;
        }
        if( fast==null || fast.next==null) return null;

        fast= head;
        while( fast!=slow){
            fast=fast.next;
            slow= slow.next;
        }
        return fast;


    }
}
