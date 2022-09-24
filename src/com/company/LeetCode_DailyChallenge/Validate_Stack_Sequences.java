package com.company.LeetCode_DailyChallenge;

import java.util.Stack;

public class Validate_Stack_Sequences {

    //946. Validate Stack Sequences
    //https://leetcode.com/problems/validate-stack-sequences/

    public boolean validateStackSequences(int[] x, int[] y) {

        // x= pushed array
        // y= popped array

        int n= x.length;

        Stack<Integer> s= new Stack<>();

        int j=0;

        for( int i=0; i<n; i++){

            // just add a new element from the pushed element
            s.add(x[i]);

            // while the element at the top of the stack keeps matching with the jth element(cur element) in the popped array, pop it from the stack and move to the next element in the popped array

            while( s.isEmpty()==false && s.peek()==y[j]){
                j++;
                s.pop();
            }

        }

        // is the stack is empty then we have used(iterated) all the elements in the popped array
        return s.isEmpty()==true;
    }


}
