package com.company.LeetCode_DailyChallenge;

public class Minimum_Path_Sum {


    //64. Minimum Path Sum
    //https://leetcode.com/problems/minimum-path-sum/


    public int minPathSum(int[][] grid) {

        int n=grid.length, m=grid[0].length;

        //finding the sum across the first row, we have no choice and must reach the element from its left(grid[0][i-1])
        for( int i=1; i<m; i++){
            grid[0][i]+=grid[0][i-1];
        }

        //finding the sum across the first col, we have no choice and must reach the element from its top(grid[i-1][0])
        for( int i=1; i<n; i++){
            grid[i][0]+=grid[i-1][0];
        }



        // since we can reach an element(arr[i][j]) from top(grid[i-1][j])
        //or from its left(grid[i][j-1]), we choose the min of the 2 and add to the cose of the grid to get the total cost to reach the element
        for( int i=1; i<n;i++){

            for( int j=1;j<m;j++){
                grid[i][j]+=Math.min(grid[i][j-1], grid[i-1][j]);
            }
        }

        return grid[n-1][m-1];


    }
}
