package com.company;
import com.company.Palindrome_Linked_List.ListNode;

public class Odd_Even_Linked_List {

    //328. Odd Even Linked List
    //https://leetcode.com/problems/odd-even-linked-list/

    public ListNode oddEvenList(ListNode head) {

        if( head==null) return head;
        ListNode ev_H=head.next,odd=head, even= head.next;

        while(even!=null && even.next!=null){

            odd.next=odd.next.next;
            even.next=even.next.next;
            even= even.next;
            odd= odd.next;

        }
        odd.next= ev_H;
        return head;

    }
}
