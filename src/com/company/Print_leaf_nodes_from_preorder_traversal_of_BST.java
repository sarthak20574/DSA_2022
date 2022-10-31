package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class Print_leaf_nodes_from_preorder_traversal_of_BST {


    //Print leaf nodes from preorder traversal of BST
    //https://practice.geeksforgeeks.org/problems/print-leaf-nodes-from-preorder-traversal-of-bst2657/1
    //https://www.youtube.com/watch?v=RNCqqF-hQYM&ab_channel=SagarMalhotra


    public int[] leafNodes(int arr[], int N)
    {


        ArrayList<Integer> ans= new ArrayList<>();
        Stack<Integer> s=  new Stack<>();

        for( int i: arr){

            int temp=0;
            int count=0;


            if(s.isEmpty()==false){
                temp= s.peek();
            }



            while( s.isEmpty()==false && s.peek()<i){

                s.pop();
                count++;
            }
            if( count>=2){
                ans.add(temp);
            }

            s.add( i);
        }

        ans.add(s.pop());

        int k=0;
        int[] ret=new int[ans.size()];
        for( int i: ans){
            ret[k++]=i;
        }



        return ret;
    }

}
