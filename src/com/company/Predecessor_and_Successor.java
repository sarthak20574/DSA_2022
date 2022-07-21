package com.company;

public class Predecessor_and_Successor {

    //Predecessor and Successor
    //https://practice.geeksforgeeks.org/problems/predecessor-and-successor/1#
    //https://www.youtube.com/watch?v=SXKAD2svfmI&ab_channel=takeUforward


    class Node
    {
        int data;
        Node left, right;

        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }

    class Res
    {
        Node pre = null;
        Node succ = null;
    }

    public static void findPreSuc(Node root, Res p, Res s, int x)
    {


        succ(root, p,s,x);
        pre(root, p,s,x);



    }

    static void succ(Node root, Res p, Res s, int x){

        Node t= root;

        while( t!=null){

            if( x<t.data){
                s.succ=t;
                t=t.left;

            }
            else if(t.data<=x){
                t=t.right;
            }


        }


    }

    static void pre(Node root, Res p, Res s, int x){

        Node t= root;

        while(t!=null){

            if(x<=t.data){
                t= t.left;
            }
            else if( t.data<x){
                p.pre=t;
                t=t.right;
            }

        }
    }
}
