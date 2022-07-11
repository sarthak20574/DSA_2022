package com.company;

public class Count_BST_nodes_that_lie_in_a_given_range {

    //Count BST nodes that lie in a given range
    //https://www.youtube.com/watch?v=gDIGHeLogyM&ab_channel=Let%27sPracticeTogether
    //https://practice.geeksforgeeks.org/problems/count-bst-nodes-that-lie-in-a-given-range/1#


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


    int getCount(Node root,int l, int h)
    {

        if( root==null) return 0;

        int ans=0;

        if( root.data>=l && root.data<=h) ans++;

        // its BST so if root>h then no need to go to its right side
        //and if root<l then no need to go to its r

        //get the values from its right and left trees
        if(root.data>=l && root.data<=h){
            ans+= getCount(root.left,l,h);
            ans+= getCount(root.right,l,h);
        }
        else if( root.data>h){
            ans+= getCount(root.left,l,h);
        }
        else{
            ans+= getCount(root.right,l,h);
        }


        return ans;
    }

}
