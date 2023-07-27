package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Knight_Probability_in_Chessboard {

    //688. Knight Probability in Chessboard
    //https://leetcode.com/problems/knight-probability-in-chessboard/

    int[][] dirs= {{2,1}, {1,2},
            {-1,2}, {1,-2},
            {-2, 1}, {2, -1},
            {-1,-2}, {-2,-1}};


    double[][][] dp;
    public double knightProbability(int n, int k, int row, int col) {

        dp=new double[k+1][n+1][n+1];

        for( int i=0; i<k+1; i++){
            for( int j=0; j<=n; j++){
                Arrays.fill(dp[i][j], -1.0);
            }
        }
        return fn( n, k, row, col);
    }


    double fn(int n, int k, int r, int c ){

        if( k==0) return 1;

        if( dp[k][r][c]!=-1.0)
            return dp[k][r][c];


        double cur=0.0;

        for( int[] i:  dirs){

            int x= r+ i[0], y= c+ i[1];

            if( x<n && y<n && x>=0 && y>=0){
                cur+= 0.125 * fn( n, k-1, x, y);
            }
        }

        dp[k][r][c]=cur;

        return cur;
    }

}
