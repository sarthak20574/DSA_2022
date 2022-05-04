package com.company;

public class NumberofClosedIslands {
    //1254. Number of Closed Islands
    //https://leetcode.com/problems/number-of-closed-islands/

    /*
     int closedIsland(vector<vector<int>>& grid) {

     int row = grid.size();
     int column= grid[0].size();
     int ans=0;
     for( int i=0; i<row;i++){
         for( int j=0 ; j<column; j++){

             if( grid[i][j] ==0 && dfs(i, j, grid ,row, column))ans++;
         }
     }
     return ans;
    }


    bool dfs( int i, int j,vector<vector<int>>& grid, int row, int column){

        if( i>=0 && i<row && j>=0 && j<column){
             if( grid[i][j]==0){

                 grid[i][j]=1;

                 return dfs( i+1, j, grid, row, column) & dfs( i-1, j, grid, row, column)
                 & dfs( i, j-1, grid, row, column) & dfs( i, j+1, grid, row, column);

                 //Yes we need to fill all the islands and that is why we should use '&' rather than using '&&' because when we use bitwise operator '&', it checks both sides of the operation.
                 //&& evaluates the left side of the operation, if it's true, only then it continues and evaluates the right side.
        }
        else return true;
        }
        else{
            return false;
        }
    }
     */
}
