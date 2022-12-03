package com.company;

public class Construct_Binary_Tree_from_String_with_bracket_representation {

    //Construct Binary Tree from String with bracket representation
    //https://practice.geeksforgeeks.org/problems/construct-binary-tree-from-string-with-bracket-representation/1
    //see sagar malhotra's video


    static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    }



    static int i=0;
    public static Node treeFromString(String s) {

        // Node x;

        i=0;
        return fn(s);


        // return x;

    }


    static Node fn( String s){

        if(i>= s.length() || s.charAt(i)==')') {
            i++;
            return null;

        }

        int n= 0;
        while(  i< s.length() && s.charAt(i)!='(' && s.charAt(i)!=')'){
            n*=10;
            n= n+ (s.charAt(i)-'0');
            i++;
        }


        Node x= new Node(n);

        // if(i== s.length()) return x;

        if( i< s.length() && s.charAt(i)=='('){

            i++;
            x.left=fn(s);
        }
        if( i< s.length() && s.charAt(i)=='('){
            i++;
            x.right=fn(s);
        }

        // for the )
        i++;

        return x;
    }
}
