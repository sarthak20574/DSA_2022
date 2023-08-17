package com.company.premium_problems;

public class Sparse_Matrix_Multiplication {

    //311. Sparse Matrix Multiplication
    //https://leetcode.com/problems/sparse-matrix-multiplication/description/

    /*
    Given two sparse matrices mat1 of size m x k and mat2 of size k x n, return the result of mat1 x mat2. You may assume that multiplication is always possible.
     */

    public int[][] multiply(int[][] mat1, int[][] mat2) {

        // axb X bxc = axc

        int r1= mat1.length, c1= mat1[0].length, r2= mat1.length, c2= mat2[0].length;

        int[][] ans= new int[r1][c2];


        for( int i=0; i<r1; i++){

            for( int j=0; j<c2; j++){
                //System.out.println(i+" "+j);

                for( int k=0; k<c1; k++){
                    ans[i][j]+= mat1[i][k] * mat2[k][j];
                    // System.out.print(mat1[i][k]+" x "+mat2[k][j]+" \n");
                }
                //System.out.println();
            }

        }

        return ans;
    }
}
