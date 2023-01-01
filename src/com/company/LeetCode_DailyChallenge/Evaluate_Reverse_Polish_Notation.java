package com.company.LeetCode_DailyChallenge;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation {

    //150. Evaluate Reverse Polish Notation
    //https://leetcode.com/problems/evaluate-reverse-polish-notation/description/


    public int evalRPN(String[] tok) {
        Stack<String> s= new Stack<>();

        Set<String> signs= new HashSet<>();
        signs.add("+");
        signs.add("-");
        signs.add("/");
        signs.add("*");

        for( String x: tok){

            if( signs.contains(x)==true){

                int b= Integer.parseInt(s.pop());
                int a= Integer.parseInt(s.pop());

                switch (x) {
                    case "-" -> s.add(String.valueOf(a - b));
                    case "*" -> s.add(String.valueOf(a * b));
                    case "/" -> s.add(String.valueOf(a / b));
                    default -> s.add(String.valueOf(a + b));
                }
            }
            else {
                s.add(x);
            }
        }

        return Integer.parseInt(s.peek());
    }
}
