package com.company.LeetCode_DailyChallenge;

import java.util.List;
import java.util.Stack;

public class Beautiful_Towers_II {

    //2866. Beautiful Towers II
    //https://leetcode.com/problems/beautiful-towers-ii/

    public long maximumSumOfHeights(List<Integer> m) {

        //[6,5,3,9,2,7]

        //6 5 3 3 2 2
        //

        //2 2 2 2 2 7
        //2 4 6

        int n= m.size();
        long[] s_l= new long[n];

        Stack<Integer> s= new Stack<>();
        s.add(-1);

        for( int i=0; i<n; i++){

            while( s.peek()!=-1 && m.get(s.peek())> m.get(i)){
                s.pop();
            }
            s_l[i]= (i -  1L * s.peek())*m.get(i) +( s.peek()==-1?0: s_l[s.peek()]);

            s.add(i);
        }

        // System.out.println(Arrays.toString(s_l));


        long[] l_s= new long[n];

        Stack<Integer> s1= new Stack<>();
        s1.add(n);

        for( int i=n-1; i>=0; i--){

            while( s1.peek()!=n && m.get(s1.peek())>m.get(i)){
                s1.pop();
            }
            l_s[i]= ( s1.peek()-i)* 1L * m.get(i) +( s1.peek()==n?0: l_s[s1.peek()]);

            s1.add(i);
        }
        // System.out.println(Arrays.toString(l_s));

        long ans=Math.max(l_s[0], s_l[n-1]);

        for( int i=0; i<n-1; i++){
            ans= Math.max(s_l[i]+l_s[i+1],ans);
        }
        return ans;
    }

}
