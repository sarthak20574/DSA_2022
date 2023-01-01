package com.company.LeetCode_DailyChallenge;

import java.util.Stack;

public class Daily_Temperatures {

    //739. Daily Temperatures
    //https://leetcode.com/problems/daily-temperatures/description/

    public int[] dailyTemperatures(int[] t) {

        int n= t.length;

        Stack<Integer> s= new Stack<>();
        int[] ans= new int[n];

        for( int i=0; i< n; i++){

            if( s.isEmpty()==true || t[s.peek()]>=t[i]) s.add(i);

            else{
                while( s.isEmpty()==false && t[s.peek()]<t[i]){

                    //System.out.println(i+" "+s.peek()+" "+t[s.peek()]+" "+t[i] );

                    ans[s.peek()]= i-s.peek();
                    s.pop();
                }
                s.add(i);
            }
        }

        return ans;


    }
}
