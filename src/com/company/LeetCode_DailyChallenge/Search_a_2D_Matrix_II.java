package com.company.LeetCode_DailyChallenge;

public class Search_a_2D_Matrix_II {

    //240. Search a 2D Matrix II
    //https://leetcode.com/problems/search-a-2d-matrix-ii/
    //https://www.youtube.com/watch?v=VS0BcOiKaGI&ab_channel=AdityaVerma

    public boolean searchMatrix(int[][] matrix, int ele) {

        int i=0, j= matrix[0].length-1;

        while( j>=0 && i<matrix.length){

            System.out.println( matrix[i][j]);
            if( matrix[i][j]== ele) return true;
            else if( matrix[i][j]>ele) j--;
            else i++;
        }
        return false;
    }
}
