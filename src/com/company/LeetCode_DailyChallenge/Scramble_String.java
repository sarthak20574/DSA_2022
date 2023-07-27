package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Scramble_String {

    //87. Scramble String
    //https://leetcode.com/problems/scramble-string/description/

    Map<String, Boolean> m= new HashMap<>();

    public boolean isScramble(String s1, String s2) {

        // dfs( s,  e)|| dfs( s1, e1,), dfs( s2, e2)

        //but in dfs( a, b) both a and b have to be the same size

        if( s1.equals(s2)) return true;

        int n= s1.length();

        if( n==1) return false;

        StringBuilder x= new StringBuilder(s1);
        x.append(" ");
        x.append(s2);

        String key=x.toString();

        if( m.containsKey(key)) return m.get(key);

        // r, r && l,l  || r,l && l,r

        boolean ans=false;

        for( int i=1; i<n; i++){

            // substring ( beg, end)// end=exclusive and beg = inclusive
            ans = ans|| (isScramble(s1.substring(0,i), s2.substring(0,i)) &&

                    isScramble(s1.substring(i), s2.substring(i)) )

                    ||

                    (isScramble(s1.substring(0,i), s2.substring(n-i)) &&

                            isScramble(s1.substring(i), s2.substring(0,n-i)) );

        }

        m.put(key, ans);

        return ans;


    }
}
