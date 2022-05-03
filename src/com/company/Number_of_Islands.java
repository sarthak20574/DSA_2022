package com.company;

public class Number_of_Islands {

    //200. Number of Islands
    //https://leetcode.com/problems/number-of-islands/
    //https://www.youtube.com/watch?v=o8S2bO3pmO4
    public int numIslands(char[][] grid) {

        int row= grid.length;
        int column= grid[0].length;

        if( row==0|| column==0)return 0;

        int ans=0;
        for(int i=0; i<row; i++){

            for(int j=0;j < column;j++){

                ans+=dfs(grid,i, j);
            }
        }
        return ans;
    }

    private int dfs(char[][] grid, int i, int j) {

        if( i>=grid.length || i<0 || j>=grid[0].length || j<0 || grid[i][j]=='0')
            return 0;

        grid[i][j]='0';

        dfs(grid, i+1, j);
        dfs(grid,i,j+1);
        dfs(grid,i-1,j);
        dfs(grid,i,j-1);

        return 1;
    }

}
