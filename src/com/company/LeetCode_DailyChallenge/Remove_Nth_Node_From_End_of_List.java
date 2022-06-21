package com.company.LeetCode_DailyChallenge;

public class Remove_Nth_Node_From_End_of_List {

    //19. Remove Nth Node From End of List
    //https://leetcode.com/problems/remove-nth-node-from-end-of-list/



    public class ListNode {
        int val;
        ListNode next;
    }

    //19. Remove Nth Node From End of List
    //https://leetcode.com/problems/remove-nth-node-from-end-of-list/

    public ListNode removeNthFromEnd(ListNode head, int n) {

        //finding the length of the linked list

        int len= 0;
        ListNode temp= head;

        while( temp!= null){
            temp= temp.next;
            len++;
        }

        //if head is to be deleted

        if( n==len){
            head= head.next;
            return head;
        }

        //traverse till len-n+1

        temp= head;
        for( int i=0; i< len-n-1; i++){
            temp= temp.next;
        }

        temp.next= temp. next.next;

        return head;
    }
}
