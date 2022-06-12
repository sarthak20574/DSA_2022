package com.company;

import java.util.Stack;

public class Valid_Parentheses {

    //20. Valid Parentheses
    //https://leetcode.com/problems/valid-parentheses/
    public boolean isValid(String s) {

        Stack<Character> stack= new Stack<>();
        boolean ans=false;

        for( char x: s.toCharArray()){
            if( x=='{') stack.add('}');
            else if( x=='(') stack.add(')');
            else if( x=='[') stack.add(']');
            else {
                //can become empty while checking
                if(stack.isEmpty() || x!=stack.pop()) {
                    return false;
                }
            }


        }
        return stack.isEmpty();

    }
}
