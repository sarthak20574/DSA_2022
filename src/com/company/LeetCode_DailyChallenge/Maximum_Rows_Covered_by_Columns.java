package com.company.LeetCode_DailyChallenge;

public class Maximum_Rows_Covered_by_Columns {

    //2397. Maximum Rows Covered by Columns
    //https://leetcode.com/problems/maximum-rows-covered-by-columns/

    // global var to store our ans
    int ans=0;

    public int maximumRows(int[][] mat, int cols) {

        fn( mat,mat.length, mat[0].length,0,cols);

        return ans;
    }

    void fn( int[][] mat, int n, int m, int i, int cols){

        // if we are out of columns to select or no more columns to select then we check if we have found a new ans and return
        if( cols==0 || i==m){
            ans= Math.max( ans, countRows(mat, n, m));
        }
        else{

            // either u don't include the column or u include the column

            // u don't include the current column
            fn( mat, n, m,i+1,cols);

            // include the current column

            // create a copy of the matrix
            int[][] temp= new int[n][m];

            for( int ii=0; ii<n; ii++){
                for( int jj=0; jj<m;jj++){
                    temp[ii][jj]= mat[ii][jj];
                }
            }

            // put all the elements in the cur column as 0 of the copy
            for( int k=0; k<n; k++){
                temp[k][i]=0;
            }

            fn(temp, n, m,i+1, cols-1);

        }
    }

    // count the number of covered rows
    int countRows( int[][] mat, int n, int m){

        int rows= 0;

        for( int i=0; i<n; i++){

            boolean ones=false;
            for( int j=0; j<m;j++){
                if( mat[i][j]==1){
                    ones=true;
                    break;
                }
            }
            if( ones==false) rows++;
        }
        return rows;
    }
}
