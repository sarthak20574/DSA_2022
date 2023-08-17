package com.company.LeetCode_DailyChallenge;

public class Double_a_Number_Represented_as_a_Linked_List {

    //2816. Double a Number Represented as a Linked List

    //https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/submissions/
    public ListNode doubleIt(ListNode head) {

        ListNode t= new ListNode(0), h= t;
        int c= fn( head);
        if(c!=0){
            t.next=new ListNode(1);
            t=t.next;
        }
        t.next=head;
        return h.next;
    }


    int fn(ListNode t){

        if( t==null) return 0;

        int car=fn( t.next);

        car+= (t.val*2);
        System.out.println(car);

        t.val = car%10;
        return car/10;
    }

}
