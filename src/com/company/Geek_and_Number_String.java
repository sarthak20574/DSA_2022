package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Geek_and_Number_String {

    public int minLength(String s, int n) {


        Stack<Character> stack= new Stack<>();

        String[] strings={"12", "21", "34", "43", "56", "65", "78", "87", "09", "90"};
        Set<String> set = new HashSet<>(Arrays.asList(strings));



        int i=0;
        char prev = '0';
        while( i < n){

            stack.add(s.charAt(i++));
            prev=stack.peek();

            while(i<n && set.contains(prev +""+s.charAt(i))==true){
                stack.pop();
                i++;
                if( stack.isEmpty()==true)break;
                prev=stack.peek() ;
            }

        }


        return stack.size();
    }
}
