package com.company.LeetCode_DailyChallenge;

public class Set_Matrix_Zeroes {

    //73. Set Matrix Zeroes
    //https://leetcode.com/problems/set-matrix-zeroes/
    //https://www.youtube.com/watch?v=djt9mwch-Xo&ab_channel=CodewithAlisha

    public void setZeroes(int[][] matrix) {

        int r=1, c=1;
        int m= matrix.length;
        int n= matrix[0].length;

        for( int i=0; i<m ; i++){
            if( matrix[i][0]==0){
                r=0;
                break;
            }
        }
        for( int i=0; i<n; i++){
            if( matrix[0][i]==0) {
                c=0;
                break;
            }
        }

        for( int i=1; i<m ; i++){
            for( int j=1;j<n; j++){
                if( matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for( int i=1; i< n; i++){
            if( matrix[0][i]==0)
            for( int j=0; j<m; j++){
                matrix[j][i]=0;
            }
        }

        for( int i=1; i<m; i++){
            if( matrix[i][0]==0){
                for( int j=0; j<n; j++){
                    matrix[i][j]=0;
                }
            }
        }

        if( r==0){
            for( int i=0; i<m; i++){
                matrix[i][0]=0;
            }
        }

        if( c==0){
            for (int i = 0; i < n; i++) {
                matrix[0][i]=0;
            }
        }

    }
}
