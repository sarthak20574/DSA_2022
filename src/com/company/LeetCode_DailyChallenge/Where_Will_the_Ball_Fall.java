package com.company.LeetCode_DailyChallenge;

public class Where_Will_the_Ball_Fall {

    //1706. Where Will the Ball Fall
    //https://leetcode.com/problems/where-will-the-ball-fall/description/

    public int[] findBall(int[][] grid) {

        int rows= grid.length, columns= grid[0].length;

        int[] ans= new int[columns];

        for( int cur_col=0; cur_col< columns; cur_col++){

            int pres_col_no=cur_col, cur_row=0;


            while( cur_row<rows) {

                int future_col=0;

                if( grid[cur_row][pres_col_no]==1){
                    future_col=pres_col_no+1;


                    if( future_col>=columns || future_col<0 || grid[cur_row][future_col] ==-1)  {
                        ans[cur_col]=-1;
                        break;
                    }
                }

                else{ //  if( grid[cur_row][pres_col_no]==-1)
                    future_col= pres_col_no-1;


                    if( future_col>=columns || future_col<0 || grid[cur_row][future_col] ==1)  {
                        ans[cur_col]=-1;
                        break;
                    }

                }
                pres_col_no=future_col;
                cur_row++;
            }

            if( cur_row==rows)
                ans[cur_col]=pres_col_no;
        }

        return ans;

    }

}
