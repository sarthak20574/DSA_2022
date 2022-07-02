package com.company.LeetCode_DailyChallenge;

public class Merge_Two_Sorted_Lists {

    //21. Merge Two Sorted Lists
    //https://leetcode.com/problems/merge-two-sorted-lists/

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode a= list1;
        ListNode b= list2;
        ListNode t= new ListNode(0);
        ListNode h= t;

        while( b!=null && a!=null){

            if( a.val<b.val){
                t.next=a;
                a= a.next;
            }
            else{

                t.next= b;
                b= b.next;
            }
            t=t.next;
        }
        while( a!= null){
            t.next=a;
            a= a.next;
            t=t.next;
        }
        while(b!=null){
            t.next=b;
            b= b.next;
            t=t.next;
        }

        t.next=null;

        return h.next;
    }
}
