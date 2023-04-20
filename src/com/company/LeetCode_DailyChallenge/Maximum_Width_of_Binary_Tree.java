package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Maximum_Width_of_Binary_Tree {


    //662. Maximum Width of Binary Tree
    //https://leetcode.com/problems/maximum-width-of-binary-tree/description/
//https://www.youtube.com/watch?v=FPzLE2L7uHs&ab_channel=NeetCodeIO

        class Pair{
            TreeNode treeNode;
            int no;


            public Pair(TreeNode t, int no){
                this.no=no;
                this.treeNode=t;
            }
        }
        public int widthOfBinaryTree(TreeNode root) {

            int ans=1;

            Queue<Pair> q= new LinkedList<>();

            if( root==null) return 1;
            q.add(new Pair(root, 1));

            while( q.size()!=0){
                List<Integer> x= new ArrayList<>();

                // q.size() is changing inside the loop so pre calculate it
                int n=q.size();

                for( int i=0; i< n; i++){

                    Pair p= q.poll();
                    TreeNode aa= p.treeNode;
                    int label=p.no;

                    x.add(p.no);

                    if(aa.left!=null)q.add(new Pair(aa.left,2*label ));
                    if(aa.right!=null)q.add(new Pair(aa.right,2*label+1 ));
                }

                ans= Math.max( ans,x.get(x.size()-1)-x.get(0)+1 );
            }

            return ans;
        }

}
