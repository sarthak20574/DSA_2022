package com.company;

public class Morris_Traversal_Kth_smallest_ {

    //k-th smallest element in BST
    //https://practice.geeksforgeeks.org/problems/find-k-th-smallest-element-in-bst/1
    //https://www.youtube.com/watch?v=80Zug6D1_r4&ab_channel=takeUforward



    static class Node
    {
        int data;
       Node left;
       Node right;

        Node(int x){
            data = x;
        }
    }


    public int KthSmallestElement(Node root, int K) {
        Node t, cur=root;

        while( cur!=null){

            if( cur.left==null){
                K--;
                if( K==0) return cur.data;
                cur=cur.right;
            }
            else{



                t=cur.left;
                while( t.right!=null && t.right!=cur){
                    t=t.right;
                }

                if( t.right==null){
                    t.right=cur;
                    cur=cur.left;
                }
                else{
                    t.right=null;
                    K--;
                    if( K==0) return cur.data;
                    cur=cur.right;

                }


            }
        }

        return -1;
    }

}
