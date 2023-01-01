package com.company.LeetCode_DailyChallenge;

public class Count_Sub_Islands {

    //1905. Count Sub Islands
    //https://leetcode.com/problems/count-sub-islands/
    /*
    int countSubIslands(vector<vector<int>>& grid1, vector<vector<int>>& grid2) {

        int row= grid1.size();
        int column= grid1[0].size();
        int ans=0;

        for( int i=0; i<row; i++){

            for( int j=0; j<column; j++){
                if (grid2[i][j]==1)
                ans+=dfs( grid1, grid2, i, j,row, column)?1:0;
            }
        }
        return ans;
    }


    bool dfs( vector<vector<int>>& grid1,vector< vector<int>>& grid2
    ,int i, int j, int row, int column ){

        if(i>=0 && i<row && j>=0 && j<column ){
            if(grid1[i][j]==1 && grid2[i][j]==1){
                   grid2[i][j]=0;

            return  dfs(grid1, grid2, i+1,j, row, column )
             & dfs(grid1, grid2, i-1,j, row, column ) &
             dfs(grid1, grid2, i,j+1, row, column ) &
             dfs(grid1, grid2, i,j-1, row, column );
            }
            else if(grid1[i][j]==0 && grid2[i][j]==1){
                return false;
            }
            else{// both 0 or grid 1 =1 and grid 2=0
                return true;
            }


        }
        else return true;
    }
     */

    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int ans=0, n= grid2.length, m= grid2[0].length;

        for( int i=0; i<n; i++){
            for( int j=0; j<m; j++){
                if( grid2[i][j]==1 && grid1[i][j]==1){
                    //grid2[i][j]=0;
                    if(fn( grid1, grid2, i, j, n, m)==true){
                        //System.out.println(i+ " : "+j);
                        ans++;
                    }

                }
            }
        }
        return ans;
    }

    boolean fn( int[][] grid1,  int[][] grid2, int i, int j, int n, int m){
        int[][] dirs= {{0,1}, {0,-1}, {1,0}, {-1,0}};

        grid2[i][j]=0;


        boolean res= true;
        for( int k=0; k<4; k++){
            int x= i+ dirs[k][0];
            int y= j+ dirs[k][1];

            if( x>=0 && y>=0 && x<n && y<m && grid2[x][y]==1){
                //grid2[x][y]=0;
                //  System.out.println(x+ " : "+y);
                if( grid1[x][y]==1){
                    // System.out.println(x+ " : "+y);

                    res = res & fn( grid1, grid2, x, y, n, m);
                }
                else {
                    fn( grid1, grid2, x, y, n, m);
                    res = false;
                }
            }

        }

        return res;
    }

}
