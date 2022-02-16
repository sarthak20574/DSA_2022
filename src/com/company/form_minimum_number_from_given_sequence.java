package com.company;

import java.util.Stack;

public class form_minimum_number_from_given_sequence {

    //Input: D        Output: 21
    //   Input: I        Output: 12
    //   Input: DD       Output: 321
    //   Input: II       Output: 123
    //   Input: DIDI     Output: 21435
    //   Input: IIDDD    Output: 126543
    //   Input: DDIDDIID Output: 321654798

    static String printMinNumberForPattern(String S){

        Stack<Integer> stack= new Stack<>();
        int n=1;
        StringBuilder ans = new StringBuilder();
        int lenght= S.length();

        for( int i= 0; i< lenght;i++){

            if( S.charAt(i)=='I'){

                stack.push(n++);

                while (!stack.isEmpty()){
                    ans.append(stack.pop());
                }
            }
            else {
                stack.push(n++);
            }
        }

        stack.push(n);
        while (!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.toString();

    }



}
