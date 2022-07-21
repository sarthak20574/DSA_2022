package com.company.LeetCode_DailyChallenge;

public class Out_of_Boundary_Paths {

    //576. Out of Boundary Paths
    //https://leetcode.com/problems/out-of-boundary-paths/submissions/

    Long[][][] dp;

    public int findPaths(int m, int n, int maxMove, int startRow,
                         int startColumn){


        dp= new Long[m+1][n+1][maxMove+1];

        return (int)fn(m, n, maxMove, startRow, startColumn);


    }

    long fn( int m, int n, int M, int x, int y){

        // if out of moves return 0 ways
        if(M<0) return 0;

        // if out of the matrix return 1 ways
        if(x==m || y==n || x<0 || y<0) {
            return 1;
        }

        //if present in the dp storage use it
        if( dp[x][y][M]!=null) return dp[x][y][M];


        // going in all the directions, up, down, left, right
        int[][] d= {{0,1},{0,-1}, {1,0}, {-1,0}};


        long ans=0;
        for( int i=0; i< 4; i++){

            // get the new coordinates
            int xx=x+d[i][0];
            int yy= y+d[i][1];

            ans= (ans+fn( m, n,M-1,xx,yy))%1_000_000_007;;
        }

        dp[x][y][M]=  ans;
        return ans;


    }
}
