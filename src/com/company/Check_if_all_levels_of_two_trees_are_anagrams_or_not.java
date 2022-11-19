package com.company;

import java.util.*;
import java.util.LinkedList;

public class Check_if_all_levels_of_two_trees_are_anagrams_or_not {

    //Check if all levels of two trees are anagrams or not
    //https://practice.geeksforgeeks.org/problems/check-if-all-levels-of-two-trees-are-anagrams-or-not/1


    class Node
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

    public static boolean areAnagrams(Node n1, Node n2) {

        List<List<Integer>> ans1=fn( n1);
        List<List<Integer>> ans2=fn( n2);

        for( int i=0; i< ans1.size(); i++){
            List<Integer> a=ans1.get(i);
            List<Integer> b=ans2.get(i);

            if( a.size()!=b.size())return false;
            Collections.sort(a);

            Collections.sort(b);
            if( a.equals(b)==false) return false;


        }
        return true;


    }





    static List<List<Integer>> fn( Node n){

        List<List<Integer>> ans= new ArrayList<>();

        Queue<Node> q= new LinkedList<>();
        if( n!=null) q.add( n);

        while( q.isEmpty()==false){

            int l= q.size();
            List<Integer> cur=new ArrayList<>();

            for( int i=0; i<l; i++){
                Node x= q.poll();
                cur.add( x.data);

                if( x.left!=null)q.add(x.left);
                if( x.right!=null) q.add( x.right);

            }
            ans.add(cur);
        }


        return ans;

    }
}
