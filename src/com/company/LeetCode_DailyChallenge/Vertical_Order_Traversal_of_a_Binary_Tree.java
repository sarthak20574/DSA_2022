package com.company.LeetCode_DailyChallenge;

import java.util.*;

public class Vertical_Order_Traversal_of_a_Binary_Tree {


    //987. Vertical Order Traversal of a Binary Tree
    //https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/description/
    //https://www.youtube.com/watch?v=q_a6lpbKJdw&ab_channel=takeUforward
    class Ele {
        int vert;
        int hori;
        TreeNode node;

        Ele(int vert, int hori, TreeNode node){
            this.vert= vert;
            this.hori= hori;
            this.node= node;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {


        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>> > m= new TreeMap<>();

        Queue<Ele> q= new LinkedList<>();

        q.add( new Ele(0, 0,root));

        while (q.isEmpty()==false){

            Ele x= q.poll();

            int v= x.vert;
            int h= x.hori;
            TreeNode cur= x.node;

            if( m.containsKey(v)== false){
                m.put( v,new TreeMap<>());
            }

            if( m.get(v).containsKey(h)==false){
                m.get(v).put(h, new PriorityQueue<>());
            }

            m.get(v).get(h).add(cur.val);

            if( cur.left!=null){
                q.add(new Ele( v-1, h+1, cur.left));
            }

            if( cur.right!=null){
                q.add( new Ele( v+1, h+1, cur.right));
            }
        }

        List<List<Integer>> ans= new ArrayList<>();

        for( TreeMap<Integer, PriorityQueue<Integer>> x: m.values()){

            List<Integer> a= new ArrayList<>();

            for( PriorityQueue<Integer> y: x.values()){

                while (y.isEmpty()==false) a.add(y.poll());
            }

            ans.add( a);
        }

        return ans;

    }
}
