package com.company.LeetCode_DailyChallenge;

import java.util.HashSet;
import java.util.Set;

public class Validate_Binary_Tree_Nodes {

    //1361. Validate Binary Tree Nodes
    //https://leetcode.com/problems/validate-binary-tree-nodes/description/?envType=daily-question&envId=2023-10-17


    boolean ans= true;
    public boolean validateBinaryTreeNodes(int n, int[] l, int[] r) {

        Set<Integer> vis= new HashSet<>();

        for( int i=0; i<n; i++){
            vis.add(i);
        }

        for( int i: l)
            vis.remove(i);

        for( int i: r)
            vis.remove(i);

        if( vis.size()!=1) return false;

        int root=0;

        for( int i: vis) root=i;

        fn(root,l, r, vis );

        if( vis.size()!=n) return false;

        return ans;
    }

    void fn( int cur, int[] l, int[] r, Set<Integer> vis){

        if( l[cur]!=-1){
            if( vis.contains(l[cur])){
                ans= false;
                return ;
            }
            vis.add(l[cur]);
            fn( l[cur], r, l, vis);
        }

        if( r[cur]!=-1){
            if( vis.contains(r[cur])){
                ans=false;
                return ;
            }
            vis.add(r[cur]);
            fn( r[cur], r, l, vis);
        }
    }
}
