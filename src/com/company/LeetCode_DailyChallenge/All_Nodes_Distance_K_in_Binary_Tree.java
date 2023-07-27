package com.company.LeetCode_DailyChallenge;

import java.util.*;

public class All_Nodes_Distance_K_in_Binary_Tree {

    //863. All Nodes Distance K in Binary Tree
//https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/


    class Solution {
        class Ob{
            TreeNode x;
            int dist;

            Ob(TreeNode x, int dist){
                this.x=x;
                this.dist=dist;
            }
        }

        public List<Integer> distanceK(TreeNode r, TreeNode target, int k) {


            int d=0;
            TreeNode[] p= new TreeNode[501];

            List<Integer> ans= new ArrayList<>();


            //Arrays.fill(p,-1);

            if( r==null) return ans;
            p[r.val]=null;
            fn( r, p);

            // for( int i=0; i<p.length; i++){
            //     if( p[i]!=null) System.out.println(" p= "+ i+ " "+p[i].val);
            // }

            Set<Integer> vis= new HashSet<>();
            Queue<Ob> q= new LinkedList<>();
            q.add(new Ob(target,0));
            vis.add(target.val);
            while( q.isEmpty()==false){

                // d++;

                // System.out.println("inn");

                int len= q.size();

                ans= new ArrayList<>();

                for( int i=0; i<len; i++){

                    Ob kk= q.poll();
                    ans.add(kk.x.val);


                    if( kk.x.right!=null && vis.contains(kk.x.right.val)==false ){
                        vis.add(kk.x.right.val);
                        q.add(new Ob(kk.x.right, kk.dist+1));
                    }
                    if( kk.x.left!=null && vis.contains(kk.x.left.val)==false ){
                        vis.add(kk.x.left.val);
                        q.add(new Ob(kk.x.left, kk.dist+1));
                    }
                    if( p[kk.x.val]!=null && vis.contains(p[kk.x.val].val)==false){
                        vis.add(p[kk.x.val].val);
                        q.add(new Ob(p[kk.x.val], kk.dist+1));
                    }

                }

                if( d==k) {
                    return ans;
                }
                d++;
            }

            return new ArrayList<>();

        }

        void fn(TreeNode r, TreeNode[] p){

            if( r==null) return ;

            if( r.right!=null) p[r.right.val]=r;
            if( r.left!=null) p[r.left.val]=r;

            fn(r.right, p); fn(r.left, p) ;
        }
    }
}
