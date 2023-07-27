package com.company.LeetCode_DailyChallenge;

public class Count_Negative_Numbers_in_a_Sorted_Matrix {

    //1351. Count Negative Numbers in a Sorted Matrix
    //https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/
    // see aryan mittal's video
    public int countNegatives(int[][] grid) {

        /*
        [4,3,2,-1]
        [3,2,1,-1]
        [1,1,-1,-2]
        [-1,-1,-2,-3]
        */

        int r=grid.length-1, c=0, ans=0;

        for( ; r>=0; r--){
            while(c<grid[0].length && grid[r][c]>=0 ){
                c++;
            }
            ans+=grid[0].length-c;
        }
        return ans;
    }
}
