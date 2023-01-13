package com.company.LeetCode_DailyChallenge;

import java.util.*;

public class Clone_Graph {

    //133. Clone Graph
    //https://leetcode.com/problems/clone-graph/description/

    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }


    Map<Integer, Node> made;
    public Node cloneGraph(Node node) {

        if(node==null) return null;

        made= new HashMap<>();

        Node ret= new Node(node.val);

        //made.put(node.val, ret);

        Set<Node> vis= new HashSet<>();

        Node temp=ret;
        dfs(node, vis, ret);


        return temp;
    }

    void dfs(Node node, Set<Node> vis, Node ret){


        //vis.add(node);
        made.put(node.val, ret);

        for( Node x: node.neighbors){

            if( made.containsKey(x.val)){
                ret.neighbors.add(made.get(x.val));
            }
            else{
                ret.neighbors.add(new Node(x.val));

                dfs(x, vis, ret.neighbors.get(ret.neighbors.size()-1));
            }

        }

    }


}
