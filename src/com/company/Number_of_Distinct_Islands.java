package com.company;

import java.util.*;

public class Number_of_Distinct_Islands {
    //Number of Distinct Islands
    //https://www.youtube.com/watch?v=7zmgQSJghpo&ab_channel=takeUforward
    //https://practice.geeksforgeeks.org/problems/number-of-distinct-islands/1

    int countDistinctIslands(int[][] grid) {
        Set< List<List<Integer>> > ans= new HashSet<>();

        int n=grid.length, m= grid[0].length;
        int[][] vis= new int[n][m];

        for( int i=0; i<n; i++){
            for( int j=0; j<m; j++){

                if( vis[i][j]==0 && grid[i][j]==1){

                    List<List<Integer>> cur= new ArrayList<>();
                    dfs(i, j, grid, cur, vis, i, j);
                    ans.add(cur);
                }

            }
        }
        return ans.size();
    }

    void dfs(int i, int j, int[][] grid, List<List<Integer>> cur,
             int vis[][],int base_i, int base_j){

        int n=grid.length, m= grid[0].length;

        vis[i][j]=1;

        cur.add( new ArrayList<>(Arrays.asList(i-base_i,j-base_j)) );
        int[][] dir= {{0,1}, {0,-1}, {1,0}, {-1, 0}};

        for( int k=0; k<4; k++){
            int x= i+dir[k][0];
            int y= j+ dir[k][1];

            if( x>=0 && x<n && y>=0 && y<m && vis[x][y]==0 && grid[x][y]==1){
                dfs(x, y, grid, cur, vis, base_i, base_j);
            }
        }
    }

}
