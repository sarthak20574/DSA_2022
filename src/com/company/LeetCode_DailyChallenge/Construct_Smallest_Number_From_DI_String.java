package com.company.LeetCode_DailyChallenge;

import java.util.Stack;

public class Construct_Smallest_Number_From_DI_String {

    //2375. Construct Smallest Number From DI String
    //https://leetcode.com/problems/construct-smallest-number-from-di-string/
    // reverse all the numbers when you find 'I'

    public String smallestNumber(String pattern) {

        StringBuilder ans= new StringBuilder(), stack= new StringBuilder();

        int n= pattern.length();

        for( int i=0; i<=n;i++){

            stack.append(i+1);

            if( i==n || pattern.charAt(i)=='I'){

                ans.append(stack.reverse());
                stack= new StringBuilder();
            }
        }

        return ans.toString();


    }


    public String smallestNumber1(String pattern) {


        // analyze various testcases like
        // I I D I =  1 2


        StringBuilder ans= new StringBuilder();
        int n=1;
        Stack<Integer> s= new Stack<>();

        for( int i=0; i<pattern.length(); i++){
            s.add(n++);
            if( pattern.charAt(i)=='I'){

                while( s.isEmpty()==false){

                    ans.append(s.pop());
                }
            }
        }

        s.add(n++);
        while( s.isEmpty()==false){

            ans.append(s.pop());
        }

        return ans. toString();

    }
}
