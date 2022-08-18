package com.company.LeetCode_DailyChallenge;

import java.util.PriorityQueue;

public class Merge_k_Sorted_Lists {
    //23. Merge k Sorted Lists
    //https://leetcode.com/problems/merge-k-sorted-lists/


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {

        // a min heap
        PriorityQueue<ListNode> minHeap= new PriorityQueue<>((a, b)-> a.val-b.val);

        int n= lists.length;

        // insert the first value of each list
        for( int i=0; i<n; i++){

            if( lists[i]!=null)
                minHeap.add( lists[i]);
        }

        // dummy node
        ListNode ans= new ListNode(0);
        // a pointer pointing to the head of the dummy node, we will use it later, to return the head of our new node
        ListNode ans_ret= ans;

        while( minHeap.isEmpty()==false){

            // get the smallest element
            ListNode t= minHeap.poll();

            // add the smallest element to our dummy node's next
            ans.next=t;

            // update the dummy pointer to its next
            ans = ans.next;

            // add the next node of the smallest node that we just popped provided it is not null
            if( t.next!=null)
                minHeap.add(t.next);

        }

        //return the next of the dummy node we created earlier
        return ans_ret.next;

    }

}
