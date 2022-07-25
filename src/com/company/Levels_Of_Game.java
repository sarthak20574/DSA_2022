package com.company;

import java.util.Arrays;

public class Levels_Of_Game {

    //Levels Of Game
    //https://practice.geeksforgeeks.org/problems/levels-of-game/1

    public static int maxLevel(int h,int m) {

        int[][] dp = new int[2000][2000];


        for( int i=0; i<2000 ; i++){
            Arrays.fill(dp[i], -1);
        }

        return fn( dp, h, m)-1;
    }


    static int fn(  int[][] dp ,int h, int m ){

        if( h<=0 || m<=0) return 0;

        if( dp[h][m]!=-1) return dp[h][m];

        int z= fn( dp, h+3 -5, m+2 -10 )+2;
        int p= fn( dp, h+3-20, m+2+5)+2;

        dp[h][m]=Math.max(z,p);
        return dp[h][m];

    }
}
