package com.company.LeetCode_DailyChallenge;

public class Middle_of_the_Linked_List {

    //876. Middle of the Linked List
    //https://leetcode.com/problems/middle-of-the-linked-list/

    // fast pointer runs 2 times faster than the slow pointer so when fast finishes the race, slow will be half way , or when the fast reaches the end of the list slow will be in the middle

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode middleNode(ListNode head) {

        ListNode fast=head,slow= head;

        while(fast != null && fast.next!= null){
            slow= slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
