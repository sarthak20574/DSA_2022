package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Copy_List_with_Random_Pointer {

    //138. Copy List with Random Pointer
    //https://leetcode.com/problems/copy-list-with-random-pointer/description/


    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {

        Map<Node, Node> m= new HashMap<>();

        if( head==null) return null;

        Node ans= new Node( head.val), h= head;

        Node a= ans;
        m.put(h,a);

        while( h!=null){
            //Node prevv=m.get(h);

            Node nexxt= h.next;

            if(nexxt!=null){
                if( m.containsKey(nexxt)==false){
                    Node neww= new Node(nexxt.val);
                    m.put( nexxt,neww);
                }

                Node new_nexxt= m.get(nexxt);

                a.next=new_nexxt;
            }


            Node raand= h.random;

            if(raand!=null){
                if( m.containsKey(raand)==false){
                    Node neww= new Node(raand.val);
                    m.put( raand,neww);
                }

                Node new_raand= m.get(raand);

                // if( h.next!=null)
                // System.out.println(h.val+" "+h.random.val);

                // if( new_raand!=null)
                // System.out.println(a.val+" "+new_raand.val);

                a.random=new_raand;
            }
            h=h.next;
            a=a.next;
        }

        return ans;
    }
}
