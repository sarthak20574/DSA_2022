package com.company;

public class Unit_Area_of_largest_region_of_1_s {

    //Unit Area of largest region of 1's
    //https://practice.geeksforgeeks.org/problems/length-of-largest-region-of-1s-1587115620/1

    int ans= 0;

    public int findMaxArea(int[][] grid)
    {

        int n=grid.length, m=grid[0].length;

        //when visited we change to -1
        for( int i=0; i<n; i++){

            for( int j=0; j<m; j++){
                if( grid[i][j]==1){
                    grid[i][j]=-1;
                    ans= Math.max(dfs(i, j, n,m, grid), ans);

                }


            }
        }

        return ans;
    }

    int dfs(int i, int j, int n, int m, int[][] grid){

        int dir[][]={{0,1}, {1,0}, {1,1}, {0,-1},
                {-1,0}, {1,-1}, {-1,1}, {-1,-1}};

        int count=0;

        for( int l=0; l<8; l++){

            int x= i+ dir[l][0];
            int y= j+ dir[l][1];

            if( x>=0 && y>=0 && x<n && y<m && grid[x][y]==1){
                grid[x][y]=-1;

                count+=dfs(x,y,n, m, grid);
            }
        }

        return count+1;

    }

}
