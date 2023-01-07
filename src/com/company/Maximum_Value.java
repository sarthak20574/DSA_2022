package com.company;

import java.util.ArrayList;
import java.util.Queue;

public class Maximum_Value {

    //Maximum Value
    //https://practice.geeksforgeeks.org/problems/ec277982aea7239b550b28421e00acbb1ea03d2c/1


    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }


    ArrayList<Integer> maximumValue(Node r) {

        ArrayList<Integer> ans= new ArrayList<>();

        Queue<Node> q= new LinkedList<>();;

        q.add(r);


        while( q.isEmpty()==false){

            int n= q.size();

            int res=Integer.MIN_VALUE;

            for( int i=0; i<n; i++){

                Node cur= q.poll();

                res= Math.max(res, cur.data);

                if( cur.right!=null) q.add(cur.right);
                if( cur.left!=null) q.add(cur.left);

            }
            ans. add( res);
        }


        return ans;
    }


}
