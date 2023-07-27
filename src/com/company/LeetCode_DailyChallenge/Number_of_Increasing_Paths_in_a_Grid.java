package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Number_of_Increasing_Paths_in_a_Grid {

    //2328. Number of Increasing Paths in a Grid
    //https://leetcode.com/problems/number-of-increasing-paths-in-a-grid/

    public int countPaths(int[][] grid) {

        /*
        0 0
        0 0
        */

        int n=grid.length, m= grid[0].length;
        boolean[][] vis= new boolean[n][m];

        long[][] ans= new long[n][m];

        long ret= 0;
        for( int i=0; i<n; i++){
            for( int j=0; j<m; j++){

                if( vis[i][j]==false){
                    vis[i][j]= true;
                    dfs(grid, i, j, vis, ans, n, m );
                }
                ret+=ans[i][j];
                ret%=1_000_000_007;
            }
        }

        System.out.println(Arrays.deepToString(ans));

        return (int)ret;
    }

    long dfs(int[][] grid, int i, int j,
             boolean[][] vis, long[][] ans, int n, int m){

        int[][] dirs= {{0,1}, {0,-1}, {1,0}, {-1,0}};

        long cur=0L;
        for( int k=0; k<4; k++){
            int x= i+dirs[k][0], y=j+dirs[k][1] ;

            if( x>=0 && y>=0 && x<n && y<m
                    && grid[x][y]> grid[i][j]){

                if(vis[x][y]==false){
                    vis[x][y]= true;
                    cur= (cur+ 1 +dfs(grid, x, y, vis, ans, n, m) % 1_000_000_007) ;
                }
                else  cur= (cur+ 1 +ans[x][y]);


            }

        }

        ans[i][j]= cur;

        return cur;
    }

}
