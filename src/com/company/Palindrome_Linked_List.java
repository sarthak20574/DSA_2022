package com.company;
public class Palindrome_Linked_List {

    //234. Palindrome Linked List
    //https://leetcode.com/problems/palindrome-linked-list/

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public boolean isPalindrome(ListNode head) {
          boolean ans=true;

          ListNode slow=head, fast= head;

          while (fast.next!=null && fast.next.next!=null){
              fast=fast.next.next;
              slow=slow.next;
          }

          slow=slow.next;
          reverse(slow);// got to reverse the slow pointer too same as list

          fast=head;
          while (slow!=null){


              fast=fast.next;
              slow=slow.next;
          }









    }
    }
}
