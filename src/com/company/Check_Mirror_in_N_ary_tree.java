package com.company;

import java.util.HashMap;
import java.util.Stack;

public class Check_Mirror_in_N_ary_tree {

    //https://practice.geeksforgeeks.org/problems/check-mirror-in-n-ary-tree1528/1/
    //https://www.youtube.com/watch?v=oH63SpSshm0
    //  tree1=  1 2 1 3 1 4 4 5 4 6 6 7 7 8 7 9 7 10 7 11
    // tree 2= 1 4 1 3 1 2 4 6 4 5 6 7 7 11 7 10 7 9 7 8
    // so we see that if they are mirror images then they are reverof of each other
    //1 2 1 3 1 4 && 1 4 1 3 1 2
    //so create a stack


    static int checkMirrorTree(int n, int e, int[] A, int[] B) {

        HashMap<Integer, Stack<Integer>> map= new HashMap<>();
        for( int i=0 ; i<2*e; i+=2){
            map.computeIfAbsent(A[i], x->new Stack<>()).push(A[i+1]);
        }

        for( int i=0 ; i< 2*e; i+=2){
            if(map.get(B[i]).pop()!=B[i+1]) return 0;
        }
        return 1;
    }
}
