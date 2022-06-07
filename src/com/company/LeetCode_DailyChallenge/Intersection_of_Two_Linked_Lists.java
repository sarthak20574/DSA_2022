package com.company.LeetCode_DailyChallenge;

public class Intersection_of_Two_Linked_Lists {

    //160. Intersection of Two Linked Lists
    //https://leetcode.com/problems/intersection-of-two-linked-lists/

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode x= headA;

        ListNode y= headB;

        while( x!=null && y!=null){
            y=y.next;
            x=x.next;
        }


        if( x==null){
            x=headB;
        }

        if( y==null){
            y=headA;
        }

        while( x!=null && y!=null){
            y=y.next;
            x=x.next;
        }
        if( x==null){
            x=headB;
        }

        if( y==null){
            y=headA;
        }
        System.out.println(x!=null && y!=null);

        while( x!=null && y!=null){ System.out.println(x.val+" "+y.val+"    ");

            if( x==y){
                return x;
            }
            y=y.next;
            x=x.next;
        }

        return null;

    }
}
