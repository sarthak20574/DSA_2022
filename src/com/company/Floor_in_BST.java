package com.company;

public class Floor_in_BST {

    //Floor in BST
    //https://www.codingninjas.com/codestudio/problems/floor-from-bst_920457?source=youtube&campaign=Striver_Tree_Videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=Striver_Tree_Videos&leftPanelTab=0

    class TreeNode<T>
    {

        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static int ans=-1;
    public static int floorInBST(TreeNode<Integer> root, int x) {

        fn( root, x,-1);

        return ans;
    }

    static void fn( TreeNode<Integer> root,int x, int prev){

        if( root==null){
            ans=prev;
            return;
        }
        if( root.data==x){
            ans= x;
            return;
        }

        else if(x<root.data){
            fn( root.left,x, prev);
        }
        else{
            fn( root.right, x, root.data);
        }
    }
}
