package com.company.LeetCode_DailyChallenge;

public class Populating_Next_Right_Pointers_in_Each_Node {

    //116. Populating Next Right Pointers in Each Node
    //https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
    //https://www.youtube.com/watch?v=U4hFQCa1Cq0&ab_channel=NeetCode


    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    public Node connect(Node root) {

        Node cur= root;
        Node nxt= null;

        if( cur!=null){
            nxt= cur.left;
        }

        while(true){

            while(cur!=null){
                if( cur.left!=null)
                    cur.left.next= cur.right;


                if( cur.next!=null && cur.right!=null){
                    cur.right.next= cur.next.left;
                }

                cur= cur.next;
            }

            cur=nxt;

            if( nxt!=null){
                nxt= nxt.left;
            }
            else{
                break;
            }
        }

        return root;

    }

}
