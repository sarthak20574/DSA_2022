package com.company.LeetCode_DailyChallenge;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

public class N_ary_Tree_Level_Order_Traversal {

    public List<List<Integer>> levelOrder(Node root) {

        // ans array List
        List<List<Integer>> ans= new ArrayList<>();

        // initialize the queue
        Queue<Node> q= new LinkedList<>();

        // of the root is not null then add it
        if( root!=null)
            q.add(root);

        // while there are some elements in each level of the tree we keep on going
        while( q.isEmpty()==false){

            // get the size of the current level
            int n= q.size();

            // new list to store elements for the current level
            List<Integer> cur_li=  new ArrayList<>();

            // iterate over all the elements from the current level
            for( int i=0; i<n;i++){
                Node cur= q.poll();

                // add it to our cur list
                cur_li.add( cur.val);

                // add their children to our queue for the next level iteration
                for( Node child:cur.children){
                    q.add( child);
                }
            }
            // add the current list having all the elements oif the cur list
            ans.add(cur_li);
        }
        return ans;
    }
}
