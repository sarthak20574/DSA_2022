package com.company.LeetCode_DailyChallenge;

public class Cycle_Length_Queries_in_a_Tree {

    //2509. Cycle Length Queries in a Tree
    //https://leetcode.com/problems/cycle-length-queries-in-a-tree/description/

    public int[] cycleLengthQueries(int n, int[][] q) {
        int len= q.length;
        int[] ans= new int[len];

        for( int i=0;i<len; i++){

            int x=q[i][0], y=q[i][1];
            while(x!=y){
                if( x<y){
                    if( y%2!=0)y--;
                    y/=2;
                    ans[i]++;
                }
                else {
                    if( x%2!=0)x--;
                    x/=2;
                    ans[i]++;
                }
            }
            ans[i]++;
        }
        return ans;
    }

}
