package com.company;

public class BST_Downward_Traversal {

    //BST Downward Traversal
    //https://practice.geeksforgeeks.org/problems/c85e3a573a7de6dfd18398def16d05387852b319/1

    class Node {
        int data;
        Node left;
        Node right;
        Node(int d)  { data = d;}
    }

    long ans=0;
    long verticallyDownBST(Node root,int k)
    {
        ans=0;

        fn(root, k);

        return ans==0?-1:ans-k;
    }


    void count(Node x, int cur){

        if( x==null) return;

        if(cur==0)
            ans+=x.data;

        count(x.left, cur-1);
        count(x.right, cur+1);

    }


    void fn( Node r, int k){

        if( r==null) return;


        if( k==r.data){
            count(r, 0);
            return;

        }
        else if( k<r.data){

            fn(r.left, k);
        }
        else{
            fn(r.right, k);
        }


    }
}
