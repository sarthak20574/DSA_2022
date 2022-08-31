package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Pacific_Atlantic_Water_Flow {


    //417. Pacific Atlantic Water Flow
    //https://leetcode.com/problems/pacific-atlantic-water-flow/


    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        int r= heights.length;
        int c= heights[0].length;


        // we start dfs from the atlantic and the pacific ocean to the cells where water can reach and then find the cells where both the ocean's can reach

        boolean[][] atlantic= new boolean[r][c];
        boolean[][] pacific= new boolean[r][c];


        // visit the first and the last row
        for( int i=0; i<c; i++){
            // pacific
            dfs(  heights, pacific, r,c,0,i);
            //atlantic
            dfs(  heights, atlantic, r,c,r-1,i);
        }

        // visit the 1st and the last column
        for(int i=0; i<r; i++){

            //pacific
            dfs(  heights, pacific, r,c,i,0);

            //atlantic
            dfs(  heights,atlantic, r,c,i,c-1);
        }


        // now add common cells to our answer
        List<List<Integer>> ans= new ArrayList<>();
        for( int i=0; i<r; i++){
            for( int j=0; j<c; j++){
                if( atlantic[i][j] && pacific[i][j])
                    ans. add(List.of(i,j));
            }
        }

        return ans;

    }

    void dfs( int[][] nums,boolean[][] ocean, int r, int c, int i, int j){

        ocean[i][j]=true;

        int[][] dir={{0,1}, {0,-1}, {1,0}, {-1,0}};
        for( int k=0; k<4; k++){
            int x= i+ dir[k][0];
            int y= j+ dir[k][1];

            if( x>=0 && y>=0 && x<r && y<c &&
                    ocean[x][y]==false && nums[i][j]<= nums[x][y] ){
                dfs( nums, ocean, r,c,x,y);
            }
        }
    }
}
