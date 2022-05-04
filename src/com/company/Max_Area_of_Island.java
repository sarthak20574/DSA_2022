package com.company;

public class Max_Area_of_Island {
    //695. Max Area of Island
    //https://leetcode.com/problems/max-area-of-island/

    /*
 int maxAreaOfIsland(vector<vector<int>>& grid) {

     int row= grid.size();
     int column= grid[0].size();
     int ans=0;
     for( int i=0; i<row;i++ ){

         for( int j=0 ; j< column; j++){

             ans=max(ans, dfs(i, j, grid,row, column));

         }
     }
     return ans;
    }

    int dfs( int i, int j, vector<vector<int>> &grid, int row, int column){

        // if i,j =0 then already visited or water

        if( j<column && j>=0 && i>=0 && i<row){
            if( grid[i][j]==1){
            grid[i][j]=0;

            return 1+ dfs(i,j-1,grid,row, column)+
            dfs(i,j+1,grid,row, column)+
            dfs(i-1,j,grid,row, column)+
            dfs(i+1,j,grid,row, column);
        }
        }
        return 0;
    }
     */
}
