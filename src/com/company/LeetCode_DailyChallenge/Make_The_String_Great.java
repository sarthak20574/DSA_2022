package com.company.LeetCode_DailyChallenge;

import java.util.Stack;

public class Make_The_String_Great {

    //1544. Make The String Great
    //https://leetcode.com/problems/make-the-string-great/description/

    /*
    we use a stack and keep check on the last element remaining
we traverse over the sting. If the next and the top element in the
 stack are upper & lower case or lower and upper case. We don't delete
  them (is, stack.pop()) else include them. The remaining elements in the
  stack in reverse order is our answer.
     */

    public String makeGood(String s) {

        Stack<Character> stack= new Stack<>();

        for( char c: s.toCharArray()){

            if( stack.isEmpty()==false && Math.abs( stack.peek()-c)==32){
                stack.pop();
            }
            else{
                stack.add(c);
            }
        }

        StringBuilder ans= new StringBuilder();

        while( stack.isEmpty()==false ){
            ans.append( stack.pop());
        }

        return ans.reverse().toString();
    }

}
