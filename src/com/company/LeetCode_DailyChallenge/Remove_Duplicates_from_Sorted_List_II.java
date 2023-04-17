package com.company.LeetCode_DailyChallenge;

public class Remove_Duplicates_from_Sorted_List_II {

    //82. Remove Duplicates from Sorted List II
    //https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/description/

    public ListNode deleteDuplicates(ListNode head) {

        ListNode h= new ListNode(0);

        ListNode ret=h, prev=head, cur;

        // 1 ele, 2 ele, 0 ele

        boolean uniq=true;

        while( prev!=null){
            cur= prev.next;

            uniq=true;

            while( cur!=null && prev.val==cur.val){
                uniq=false;
                cur= cur.next;
            }

            if( uniq==true){
                h.next= prev;
                h=h.next;
                h.next=null;
            }

            prev=cur;
        }
        return ret.next;

    }

}
