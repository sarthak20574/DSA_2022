package com.company;

import java.util.HashSet;
import java.util.Set;

public class Single_valued_subtree {

    //Single valued subtree
    //https://practice.geeksforgeeks.org/problems/single-valued-subtree/1

    class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

    int ans=0;
    public int singlevalued(Node root) {

        ans=0;

        fn(root);

        return ans;
    }

    boolean fn( Node r){

        if( r==null) return true;

        boolean lft= fn( r.left);
        boolean ryt= fn( r.right);

        if( lft==false || ryt==false) return false;

        if( r.right!=null && r.data!=r.right.data) return false;

        if( r.left!=null && r.left.data!=r.data) return false;

        // if the root's val is not equal to the ryt or the lft subtree's value we return false
        // so root.val == lft.val== ryt.val

        ans++;
        return true;
    }
}
