package com.company.LeetCode_DailyChallenge;

public class Shift_2D_Grid {

    //1260. Shift 2D Grid
    //https://leetcode.com/problems/shift-2d-grid/

    // convert it into a 1-D list and then

    // converting a 2D to 1D
    // present_row_number * no of columns + present_column_no

    // converting 1D to 2D
    //present index / no of columns + present index % no of columns

    //or
    // in place you can just use initialise the ans 2D list as
    // ans[((i * columns + j + k)% row*columns)/ columns][((i * columns + j + k)%row*columns)% column] = old[i][j]

    /*
    vector<vector<int>> shiftGrid(vector<vector<int>>& grid, int k) {

     int rows=grid.size(), columns=grid[0].size();
     vector<vector<int>> ans(rows,vector<int>( columns, 0));

     for(int i=0 ; i< rows;i++){

         for( int j=0; j< columns; j++){
             int total_ele= (i*columns+ j+k)%( rows* columns);
             ans[total_ele/columns][total_ele%columns]= grid[i][j];
         }
     }

     return ans;
    }
     */


}
