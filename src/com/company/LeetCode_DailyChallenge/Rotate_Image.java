package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Rotate_Image {
    //48. Rotate Image
    //https://leetcode.com/problems/rotate-image/
    //https://www.youtube.com/watch?v=IdZlsG6P17w&ab_channel=NickWhite

    public void rotate(int[][] matrix) {


        int n= matrix.length;

        for( int i=0; i< n ; i++){

            for( int j=i+1; j<n ; j++){
                int t= matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]= t;
            }
        }

        //System.out.println(Arrays.deepToString(matrix));

        for( int i=0; i<n ; i++){
            for( int j=0; j<n/2; j++){
                int t= matrix[i][j];
                matrix[i][j]= matrix[i][n-j-1];
                matrix[i][n-j-1]= t;

            }
        }

    }


    // another crazy idea

    // reverse the matrix anf then traverse it

    /*

     void rotate(vector<vector<int>>& matrix) {

        int n= matrix.size();
        reverse(matrix.begin(), matrix.end());

            for( int i=0; i< n ; i++){

                for( int j=i+1; j< n; j++){

                    int t= matrix[i][j];
                    matrix[i][j]= matrix[j][i];
                    matrix[j][i]= t;
                }
            }
    }

     */

}
