package com.company.LeetCode_DailyChallenge;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Implement_Queue_using_Stacks {

    //232. Implement Queue using Stacks
//https://leetcode.com/problems/implement-queue-using-stacks/

    class MyQueue {

        Stack<Integer> s;

        public MyQueue() {
            s= new Stack<>();
        }

        public void push(int x) {

            // add the new element to the end/base of the stack

            Stack<Integer> t= new Stack<>();

            while(s.size()!=0){

                t.add( s.pop());
            }
            s.add(x);

            while(t.size()!=0){

                s.add( t.pop());
            }
        }

        public int pop() {
            int x= s.pop();
            return x;
        }

        public int peek() {

            return s.peek();
        }

        public boolean empty() {
            return s.isEmpty();
        }
    }


}
