package com.company.LeetCode_DailyChallenge;

import java.util.Stack;

public class Basic_Calculator {

    //224. Basic Calculator
    //https://leetcode.com/problems/basic-calculator/description/
    //https://www.youtube.com/watch?v=081AqOuasw0&ab_channel=JessicaLin

    public int calculate(String s) {
        int ans=0, sign=1, n=s.length();
        Stack<Integer> st= new Stack<>();

        for( int i=0; i<n; i++){


            int number=0;

            if( s.charAt(i)>='0' && s.charAt(i)<='9'){
                while( i<n && s.charAt(i)>='0' && s.charAt(i)<='9'){

                    number= number*10 +(s.charAt(i)-'0');
                    i++;
                }
                ans= ans + number*sign;
                i--;
            }
            else if( s.charAt(i)=='+'){
                sign=1;
            }
            else if(  s.charAt(i)=='-'){
                sign=-1;
            }
            else if( s.charAt(i)=='('){
                st.add(ans);
                st.add(sign);
                ans=0;
                sign=1;
            }
            else if(  s.charAt(i)==')'){

                ans = ans* st.pop() + st.pop();
            }
        }
        return ans;
    }
}
