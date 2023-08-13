package com.company.LeetCode_DailyChallenge;

public class Rotate_List {

    //61. Rotate List
    //https://leetcode.com/problems/rotate-list/
    public ListNode rotateRight(ListNode h, int k) {


        int len=0;

        ListNode cur= h;
        while( cur!=null){
            cur=cur.next;
            len++;
        }

        if(len==0) return h;
        k= k%len;
        if( k==0) return h;

        // break connection b/w k+1 and k+2'th and connect start and end

        ListNode end=h,k_1=h, k_2=h;
        cur=h;

        while( cur.next!=null){
            cur=cur.next;
        }

        // if( k+1==len){
        //      cur.next=h;
        //     ListNode ret=h.next;
        //     h.next=null;

        //     return ret;
        // }
        cur.next=h;

        //2 1


        int c= len-k;
        //3
        while( --c >0){
            k_1=k_1.next;
        }

        k_2=k_1.next;
        k_1.next=null;

        return k_2;


    }
}
