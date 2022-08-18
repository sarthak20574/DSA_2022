package com.company;

public class Number_of_Turns_in_Binary_Tree {


    //Number of Turns in Binary Tree
    //https://www.youtube.com/watch?v=kyX8HCDxKdA&ab_channel=SagarMalhotra
    //https://practice.geeksforgeeks.org/problems/number-of-turns-in-binary-tree/1


    class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }

    static int ans;
    static int NumberOfTurns(Node r, int first, int second) {
        ans=0;

        Node l=lca(r,first, second);
        if(l.data==first){
            count( l.left, true,second);
            count( l.right, false,second);

        }
        else if( l.data==second){
            count(l.left, true, first);
            count( l.right, false, first);
        }
        else{
            count( l.left, true,second);
            count( l.right, false,second);
            count(l.left, true, first);
            count( l.right, false, first);
            ans++;
        }

        return ans;
    }


    static boolean count( Node r, boolean left,int x){

        if( r==null) return false;

        if( r.data== x) return true;

        if(left==true){
            if(count( r.left, left,x)==true )return true;

            if( count(r.right,!left, x )==true){
                ans++;
                return true;
            }
        }
        else{

            if( count(r.left,!left, x)==true){
                ans++;
                return true;
            }
            if( count(r.right,left,x)==true) return true;
        }

        return false;
    }

    static Node lca(Node r, int a, int b){

        if( r==null) return null;

        else if( r.data==a || r.data== b) return r;

        Node lft= lca(r.left, a, b);
        Node ryt= lca(r.right, a,b);

        if( lft!=null && ryt!=null)return r;
        return lft!=null?lft:ryt;
    }

}
