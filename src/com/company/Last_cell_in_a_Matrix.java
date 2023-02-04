package com.company;

public class Last_cell_in_a_Matrix {

    //Last cell in a Matrix
    //https://practice.geeksforgeeks.org/problems/2e068e2342b9c9f40cfda1ed8e8119542d748fd8/1

    static int [] endPoints(int [][]matrix, int r, int c){

        char dir= 'r';
        int i=0, j=0, prev_i=0, prev_j=0;


        while( i>=0 && i<r && j>=0 && j<c){

            if( matrix[i][j]==1){
                matrix[i][j]=0;

                if( dir=='r'){
                    dir= 'd';
                }
                else if( dir=='d'){
                    dir='l';
                }
                else if( dir=='l'){
                    dir='u';
                }
                else if( dir=='u'){
                    dir='r';
                }
            }
            else{
                prev_i=i;
                prev_j=j;

                if( dir=='r'){
                    j++;
                }
                else if( dir=='d'){
                    i++;
                }
                else if( dir=='l'){
                    j--;
                }
                else if( dir=='u'){
                    i--;
                }
            }

        }

        return new int[]{prev_i, prev_j};
    }


}
