package com.company;

public class Find_the_maximum_GCD_of_the_siblings_of_a_Binary_Tree {

    //Find the maximum GCD of the siblings of a Binary Tree
    //https://practice.geeksforgeeks.org/problems/6eb51dc638ee1b936f38d1ab4b2f7062d4425463/1



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


    int[] ans;

    static int gcd(int a,int b){

        if (b==0) return a;
        else return gcd(b,a%b);

    }



    int maxGCD(Node root) {

        if(root==null)return 0;
        ans=new int[]{0, 0};

        fn(root);

        return ans[0];
    }


    void fn( Node r){

        if( r==null) return;

        if( r.right !=null && r.left!=null){
            int x= gcd(r.right.data,r.left.data);
            if( x>=ans[1]){
                ans[0]=r.data;
                ans[1]= x;

                //System.out.println(r.right.data+" : "+r.left.data +" : "+x+" : "+r.data);
            }
        }

        fn( r.right);
        fn( r.left);
    }


}
