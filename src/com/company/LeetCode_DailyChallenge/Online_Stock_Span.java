package com.company.LeetCode_DailyChallenge;

import java.util.Stack;

public class Online_Stock_Span {

    class StockSpanner {

        //901. Online Stock Span
        //https://leetcode.com/problems/online-stock-span/
        // can see neetcode's video


        Stack<int[]> s;
        int cur=0;
        public StockSpanner() {
            s= new Stack<>();
            s.add( new int[]{Integer.MAX_VALUE, 0});
        }

        public int next(int p) {
            cur++;

            while( s.peek()[0]<=p){
                s.pop();
            }

            int ans=cur-s.peek()[1];
            s.add(new int[]{p, cur});

            return ans;
        }

    }
}
