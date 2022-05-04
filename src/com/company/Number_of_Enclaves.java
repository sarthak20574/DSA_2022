package com.company;

public class Number_of_Enclaves {

    //1020. Number of Enclaves
    //https://leetcode.com/problems/number-of-enclaves/

    /*
    int numEnclaves(vector<vector<int>>& grid) {

    int n= grid.size();
    int m= grid[0].size();
    int ans=0;
    for( int i=0; i<n; i++){
        for( int j=0; j<m; j++){
            // remove all islands touching the first,last rows and the columns
            if( i==0 || j==0|| i== n-1|| j==m-1){
                dfs( i, j, grid, n, m);
            }
        }
    }

    // now count the the remaining islands

    for( int i=0 ;i<n;i++){
        for(int j=0; j< m ; j++){

            ans+=dfs( i, j, grid, n, m);
        }
    }

    return ans;
    }

    int dfs( int i, int j, vector<vector<int>> &grid, int n, int m){

        if( !(i>=0 && i<n && j>=0 && j<m)) return 0;
        if( grid[i][j]==0) return 0;

        else{
            grid[i][j]=0;
            return 1 + dfs( i+1, j, grid, n, m)+
            dfs( i-1, j, grid, n, m)+dfs( i, j-1, grid, n, m)+
            dfs( i, j+1, grid, n, m);
    }
    }


     */
}
