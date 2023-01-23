package com.company.LeetCode_DailyChallenge;

import java.util.Stack;

public class Basic_Calculator_II {

    //227. Basic Calculator II
    //https://leetcode.com/problems/basic-calculator-ii/description/

    public int calculate(String s) {

        int ans=0;

        Stack<Integer> st= new Stack<>();

        int n= s.length();

        int i=0, sign='+', no=0;

        for( i=0; i<n; i++){

            if( s.charAt(i)>='0' && s.charAt(i)<='9'){
                int d=s.charAt(i)-'0';
                no*=10;
                no+=d;

                //st.add(no);
            }
            if((s.charAt(i)>='0' && s.charAt(i)<='9')==false && s.charAt(i)!=' ' || i==n-1){

                if(sign=='/'){
                    st.add( st.pop()/no);
                }
                else if( sign=='*'){
                    st.add(st.pop()*no);
                }
                else if( sign=='-'){
                    st.add(-no);
                }
                else if(sign=='+'){
                    st.add(no);
                }
                sign=s.charAt(i);
                no=0;
            }
        }

        for(int l:st){
            ans += l;
        }
        return ans;

    }
}
