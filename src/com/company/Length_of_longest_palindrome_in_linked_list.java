package com.company;

public class Length_of_longest_palindrome_in_linked_list {

    //Length of longest palindrome in linked list
    //https://practice.geeksforgeeks.org/problems/length-of-longest-palindrome-in-linked-list/1
    //https://www.youtube.com/watch?v=nLAnmS4n48I&ab_channel=CodingSimplified


    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    public static int maxPalindrome(Node head) {
        Node t= head, prev=null, nxt=null;
        int ans=1;

        while(t!=null){
            nxt= t.next;
            t.next=prev;

            ans= Math.max( ans,2* common_ele(prev, nxt)+1);
            ans= Math.max(ans, 2* common_ele(t, nxt) );

            prev= t;
            t=nxt;
        }
        return ans;
    }

    static int common_ele(Node x, Node y){
        int ans=0;

        while( x!=null && y!=null && x.data==y.data){
            ans++;
            x=x.next;
            y=y.next;
        }
        return ans;
    }
}
