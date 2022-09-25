package com.company;

public class Queries_on_a_Matrix {

    //Queries on a Matrix
    //https://practice.geeksforgeeks.org/problems/queries-on-a-matrix0443/1
    //https://www.youtube.com/watch?v=7uxlCmQjwE0&ab_channel=SagarMalhotra

    public int[][] solveQueries(int n, int[][] Queries) {

        int[][] ans= new int[n][n];

        for( int[] x:Queries){

            int r1=x[0], r2=x[2], c1=x[1], c2=x[3];

            for( int r=r1; r<=r2;r++){
                ans[r][c1]++;

                if( c2+1<n){
                    ans[r][c2+1]--;
                }
            }

        }

        for( int r= 0; r<n;r++){

            for( int c=1; c<n; c++){

                ans[r][c]+=ans[r][c-1];
            }
        }

        return ans;
    }
}
