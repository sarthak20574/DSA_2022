package com.company.LeetCode_DailyChallenge;

import java.util.Stack;

public class Min_Stack {

    class MinStack {

        //155. Min Stack
        //https://leetcode.com/problems/min-stack/
        //https://www.youtube.com/watch?v=qkLl7nAwDPo&ab_channel=NeetCode

        // we use 2 stacks one is the normal stack and the other stack stores the min element at that that stage/postion,

        Stack<Integer> stack;
        Stack<Integer> minn;

        public MinStack() {
            stack= new Stack<>();
            minn= new Stack<>();
        }

        public void push(int val) {
            stack.add(val);
            if(minn.isEmpty()==true){
                minn.add(val);
            }
            else{
                minn.add( Math.min(minn.peek(),val));
            }
        }

        public void pop() {
            minn.pop();
            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minn.peek();
        }
    }


}
