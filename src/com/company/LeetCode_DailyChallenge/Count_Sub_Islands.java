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
}
