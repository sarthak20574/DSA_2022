package com.company;

public class Sum_of_k_smallest_elements_in_BST {

    class Node {
        int data;
        Node left, right;
        Node(int key){
            this.data = key;
            this.left = this.right = null;
        }
    }

    //Sum of k smallest elements in BST
    //https://practice.geeksforgeeks.org/problems/sum-of-k-smallest-elements-in-bst3029/1

    int ans=0, K;
    int sum(Node root, int k) {
        K=k;
        ans=0;

        pre(root);

        return ans;
    }

    void pre( Node r){

        if( r==null) return;

        pre(r.left);

        if(K>0){
            ans+=r.data;
            K--;
        }

        pre(r.right);
    }
}
