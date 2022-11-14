package com.company;

public class Floyd_Warshall {

    //Floyd Warshall
    //https://practice.geeksforgeeks.org/problems/implementing-floyd-warshall2042/1
    //https://www.youtube.com/watch?v=oNI0rf2P9gE&ab_channel=AbdulBari


    public void shortest_distance(int[][] matrix)
    {

        int n= matrix.length;


        for( int i=0; i<n; i++){

            for( int j=0; j<n; j++){
                if( matrix[i][j]==-1) matrix[i][j]= (int) 1e7;

            }
        }

        for( int k=0; k<n; k++){
            for( int i=0; i<n; i++){

                for( int j=0; j<n; j++){
                    matrix[i][j]=Math.min(matrix[i][j], matrix[i][k]+ matrix[k][j]);
                }
            }
        }

        for( int i=0; i<n; i++){

            for( int j=0; j<n; j++){
                if( matrix[i][j]==1e7) matrix[i][j]= -1;

            }
        }


    }
}
