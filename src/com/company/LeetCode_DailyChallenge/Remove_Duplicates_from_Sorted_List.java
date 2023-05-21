package com.company.LeetCode_DailyChallenge;

public class Remove_Duplicates_from_Sorted_List {

    //83. Remove Duplicates from Sorted List
    //https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

    public ListNode deleteDuplicates(ListNode head) {

        ListNode h= head;
        if( h==null) return null;

        while( h.next!=null){
            if( h.val==h.next.val){
                h.next= h.next.next;
            }
            else h= h.next;
        }


        return head;
    }
}
