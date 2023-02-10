package com.company;

public class Intersection_Point_in_Y_Shaped_Linked_Lists {

    //Intersection Point in Y Shaped Linked Lists
    //https://practice.geeksforgeeks.org/problems/eae1fbd0ac8f213a833d231e26ba4d829e79dd9c/1

    class Node {
        int data;
        Node next;
        Node(int d)  { data = d;  next = null; }
    }

    int intersectPoint(Node h1, Node h2)
    {
        Node n1= h1, n2= h2;

        while(n1 != n2){

            if( n1==null){
                n1=h2;
            }

            if( n2==null){
                n2=h1;
            }

            //  System.out.println(n1.data);
            //  System.out.println(n2.data);
            //  System.out.println();

            n1=n1.next;
            n2=n2.next;
        }

        return n1==null?-1:n1.data;
    }

}
