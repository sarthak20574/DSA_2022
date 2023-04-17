package com.company.LeetCode_DailyChallenge;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class Partition_List {

    //86. Partition List
    //https://leetcode.com/problems/partition-list/



    public ListNode partition(ListNode head, int x) {

        ListNode t= head;
        ListNode t1= new ListNode(0);
        ListNode t2= new ListNode(0);
        ListNode h1=t1;
        ListNode h2=t2;

        while( t!=null){
            if( t.val<x){
                // System.out.println("in 1 "+t.val);
                h1.next=t;
                h1=h1.next;
            }
            else{

                // System.out.println("in 2 "+t.val);
                h2.next=t;
                h2=h2.next;
            }
            t=t.next;

        }

        h1.next=null;
        h2.next=null;


//        ListNode  y= t1;
//         while( y!=null){
//             System.out.println("in 1 "+y.val);
//             y=y.next;
//         }

//          y= t2;
//         while( y!=null){
//             System.out.println("in 2 "+y.val);
//             y=y.next;
//         }

        h1.next=t2.next;
        return t1.next;

    }
}
