package com.company;

public class Polynomial_Addition {

    //Polynomial Addition
    //https://practice.geeksforgeeks.org/problems/polynomial-addition/1#

    //nice video ...
    //https://www.youtube.com/watch?v=AxhB74qBtzc&ab_channel=Let%27sPracticeTogether

    static class Node{
    int coeff;
    int pow;
    Node next;
    Node(int a,int b)
    {
        coeff=a;
        pow=b;
        next=null;
    }
}

    public static Node addPolynomial(Node p1,Node p2)
    {
        Node h= new Node(0,0);
        Node return_this= h;
        Node prev= null;

        while( p1!=null && p2!=null){

            if( p1.pow==p2.pow){
                p1.coeff=p1.coeff+p2.coeff;
                h.next= p1;
                prev= h;
                h= h.next;
                p1= p1.next;
                p2=p2.next;
            }
            else if( p1.pow>p2.pow){
                h.next= p1;
                prev= h;
                h= h.next;
                p1= p1.next;
            }
            else{
                h.next= p2;
                prev= h;
                h= h.next;
                p2= p2.next;
            }

        }

        if( p1!=null){
            h.next=p1;
        }
        if( p2!=null){
            h.next=p2;
        }
        return return_this.next;
    }

}
