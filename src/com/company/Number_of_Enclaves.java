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

    public int numEnclaves(int[][] grid) {
        int ans=0, n= grid.length, m= grid[0].length;

        for( int i=0; i<n; i++){
            for( int j=0; j<m; j++){

                if( grid[i][j]==1){
                    int tem=fn( grid,i, j, n,m);
                    if( tem!=Integer.MAX_VALUE)
                        ans= ans+ 1+ tem;
                }
            }
        }

        return ans;
    }

    int fn( int[][] grid, int i, int j, int n, int m){
        int cur=0;
        grid[i][j]=0;

        int dirs[][]= {{0,1}, {0,-1}, {1,0} , {-1, 0}};

        if( i==0 || j==0 || i==n-1 || j==m-1){
            cur= Integer.MAX_VALUE;
        }




        for( int k=0; k<4; k++){

            int x= i+ dirs[k][0];
            int y= j+ dirs[k][1];

            if( x>=0 && y>=0 && x<n && y<m ){
                //if( x==0 || y==0 || x==n-1 || y==m-1){
                //     if( grid[x][y]==1){
                //         grid[x][y]=0;
                //         return Integer.MAX_VALUE;
                //     }

                //   }
                //else{
                if( grid[x][y]==1){

                    int tem=fn( grid,x, y, n,m);
                    if( tem==Integer.MAX_VALUE){
                        cur= Integer.MAX_VALUE;
                    }

                    if( tem!=Integer.MAX_VALUE && cur!=Integer.MAX_VALUE)
                        cur= cur+ 1+ tem;
                }
                //}

            }

        }

        return cur;
    }
}
