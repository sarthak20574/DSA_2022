package com.company.LeetCode_DailyChallenge;

public class Reorder_List {


    public static class ListNode {
        int val;
      ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    //143. Reorder List
    //https://leetcode.com/problems/reorder-list/
    //Neetcode's video


    // we reverse the 2nd half of the list and then alternatively add the element from the first half's and from the 2nd half reversed list till the 2 pointers meet


    public void reorderList(ListNode head) {

        //find the mid of the list
        ListNode slow= head, fast= head;

        while( fast!= null && fast.next!=null){
            fast= fast.next.next;
            slow= slow.next;
        }



        // reverse the 2nd half of the list
        ListNode h_rev=reverse(slow);
        ListNode h=head;


        //dummy node
        ListNode t= new ListNode(0);
        ListNode newHead=t;


        // now alternatively add the element from the first half's and from the 2nd half reversed list till the 2 pointers meet
        while(h_rev!=h && h_rev!=null){

            t.next=h;
            t=t.next;
            h=h.next;

            t.next= h_rev;
            t=t.next;
            h_rev=h_rev.next;
        }

        //updating the head
        head=newHead.next;

    }


    // reverses the linked list and returns the head of the reversed list
    ListNode reverse(ListNode h){

        ListNode prev= null, cur=h,nxt ;

        while( cur!=null){
            nxt= cur.next;
            cur.next=prev;
            prev=cur;
            cur=nxt;
        }
        return prev;
    }



}
