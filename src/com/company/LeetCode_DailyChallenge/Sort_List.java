package com.company.LeetCode_DailyChallenge;

public class Sort_List {
    //148. Sort List
    //https://leetcode.com/problems/sort-list/
    //https://www.youtube.com/watch?v=TGveA1oFhrc



      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public ListNode sortList(ListNode head) {

          if( head==null || head.next==null){
              return head;
          }

          ListNode temp= head;


          //getting the mid ele
        ListNode mid= head;
        ListNode fast= head;
        ListNode prev= null;

        while( fast!=null && fast.next!=null){
            prev= mid;
            fast= fast.next.next;
            mid= mid.next;
        }

        //setting the prev's next as null
        prev.next= null;

          ListNode temp2= mid;
         ListNode x =sortList(temp);
          ListNode x2= sortList(temp2);

          return merge(x, x2);
    }

    ListNode merge( ListNode head1, ListNode head2){


          ListNode temp1 = new ListNode(0);
        ListNode temp= temp1;

          while (head1!=null && head2!= null){
           if( head1.val<head2.val){
               temp.next= head1;
               head1= head1.next;
               temp= temp.next;
           }
           else if( head2!=null){
               temp.next= head2;
               head2= head2.next;
               temp= temp.next;
           }
          }
          while (head1!=null){
              temp.next= head1;
              head1= head1.next;
              temp= temp.next;
          }
          while (head2!=null){
              temp.next= head2;
              head2= head2.next;
              temp= temp.next;
          }
          return temp1.next;
    }

}
