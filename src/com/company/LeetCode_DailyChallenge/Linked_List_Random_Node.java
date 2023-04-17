package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Linked_List_Random_Node {

    //382. Linked List Random Node
    //https://leetcode.com/problems/linked-list-random-node/description/

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */


    public class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }

    class Solution {

        List<Integer> li;

        public Solution(ListNode head) {

            li= new ArrayList<>();

            while(head!=null ){
                li.add(head.val);
                head= head.next;
            }
        }

        public int getRandom() {

            Random random = new Random();
            int i= random.nextInt(li.size());

            return li.get(i);
        }
    }

}
