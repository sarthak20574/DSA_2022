package com.company.LeetCode_DailyChallenge;

public class Delete_Node_in_a_Linked_List {
    //237. Delete Node in a Linked List
    //https://leetcode.com/problems/delete-node-in-a-linked-list/

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        public void deleteNode(ListNode node) {

            node.val = node.next.val;
            node.next = node.next.next;
        }
    }

}
