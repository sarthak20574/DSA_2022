package com.company;

import java.util.Stack;

public class Stack_Permutations {

    //Stack Permutations
    //https://practice.geeksforgeeks.org/problems/stack-permutations/1

    public static int isStackPermutation(int n, int[] in, int[] out) {
        Stack<Integer> s= new Stack<>();

        int j=0;
        for( int i: in){

            s.add(i);
            while( s.isEmpty()== false && s.peek()==out[j]){
                s.pop();
                j++;
            }
        }
        return s.isEmpty()==true?1:0;

    }
}
