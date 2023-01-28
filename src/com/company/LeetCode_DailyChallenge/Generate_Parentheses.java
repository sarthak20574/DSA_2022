package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses {

    //22. Generate Parentheses
    //https://leetcode.com/problems/generate-parentheses/description/

    List<String> ans;

    public List<String> generateParenthesis(int n) {


        //2 choices put a (  or a )
        ans= new ArrayList<>();

        fn(new StringBuilder(),0,0, n);
        return ans;
    }

    void fn( StringBuilder cur, int n1, int n2, int n){

        if( n1==n && n2==n){
            ans.add(new String(cur.toString()));
        }

        if( n1<n){

            StringBuilder t= new StringBuilder(cur);
            t.append("(");
            fn( t, n1+1, n2, n);
        }

        if( n2<n && n2<n1){

            StringBuilder t= new StringBuilder(cur);
            t.append(")");
            fn(t, n1, n2+1, n);
        }

    }


}
