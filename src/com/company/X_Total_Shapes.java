package com.company;

public class X_Total_Shapes {

    //X Total Shapes
    //https://practice.geeksforgeeks.org/problems/x-total-shapes3617/1

    int ans=0;
    public int xShape(char[][] grid)
    {
        ans=0;
        int n= grid.length, m= grid[0].length;
        for( int i=0; i<n; i++){
            for( int j=0; j<m; j++){

                if( grid[i][j]=='X'){
                    ans++;
                    fn(grid, n, m, i, j);
                }
            }
        }

        return ans;
    }


    void fn( char[][] grid, int n, int m, int i, int j){

        grid[i][j]='O';

        int[][] dirs= {{0,1}, {0, -1}, {1,0}, {-1,0}};

        for( int k=0; k<4; k++){

            int x= i+dirs[k][0];
            int y= j+dirs[k][1];

            if( x >=0 && x<n && y>=0 && y<m && grid[x][y]=='X')
                fn(grid, n, m, x, y);
        }
    }
}
