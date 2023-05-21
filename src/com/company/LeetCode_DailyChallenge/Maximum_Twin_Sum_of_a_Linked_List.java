package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;

public class Maximum_Twin_Sum_of_a_Linked_List {

    //2130. Maximum Twin Sum of a Linked List
    //https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/description/
    public int pairSum(ListNode head) {


        HashMap<Integer,Integer> m= new HashMap<>();

        ListNode h= head;
        int c=0;

        while( h!=null){
            m.put( c++, h.val);
            h= h.next;
        }

        int ans=0, n= m.size();

        for( int i=0; i<n/2; i++){
            // System.out.println( m.get(i)+" "+ m.get(n/2-1-i ));
            //System.out.println( i+" "+(n/2-1-i ));
            ans= Math.max( ans, m.get(i)+ m.get(n-1-i ));
        }


        return ans;
    }

}
