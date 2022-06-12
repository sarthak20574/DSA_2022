package com.company;
public class Palindrome_Linked_List {

    //234. Palindrome Linked List
    //https://leetcode.com/problems/palindrome-linked-list/

    public class ListNode {
        int val;
        ListNode next;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head, fast= head;

        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        if( fast!=null) slow=slow.next;
        slow= reverse(slow);// got to reverse the slow pointer too same as list

        fast=head;
        while (slow!=null){
            if( slow.val!=fast.val){
                return false;
            }
            fast=fast.next;
            slow=slow.next;
        }
        return true;
    }


    private ListNode reverse(ListNode slow) {

        ListNode prev= null, cur= slow,nexxt;

        while (cur!=null){
            nexxt= cur.next;
            cur.next= prev;
            prev= cur;
            cur=nexxt;

        }
        return prev;
    }
}
