package com.company.LeetCode_DailyChallenge;

public class Game_of_Life {

    // 289. Game of Life
    //https://www.youtube.com/watch?v=fei4bJQdBUQ
    //https://leetcode.com/problems/game-of-life/submissions/
    public void gameOfLife(int[][] board) {

        /*
        0 0 0
        1 0 1
        0 1 2
        1 1 3
         */
        int rows= board.length;
        int columns= board[0].length;

        for (int i = 0; i <rows ; i++) {
            for( int j=0; j< columns; j++){

                int no_of_lives=0;

                if ( (i-1)>=0 && (board[i-1][j]==1 ||board[i-1][j]==3 )) no_of_lives++;
                if ( (i-1)>=0 && (j-1) >=0 && (board[i-1][j-1]==1 ||  board[i-1][j-1]==3)) no_of_lives++;
                if ( (j-1) >=0 && (board[i][j-1]==1 || board[i][j-1]==3)) no_of_lives++;
                if ( (i+1)<rows && (j-1) >=0 && (board[i+1][j-1]==1 || board[i+1][j-1]==3)) no_of_lives++;
                if ( (i-1)>=0 && (j+1) <columns && (board[i-1][j+1]==1 || board[i-1][j+1]==3)) no_of_lives++;
                if ( (i+1)<rows && (board[i+1][j]==1 ||  board[i+1][j]==3)) no_of_lives++;
                if ((j+1) <columns && (board[i][j+1]==1 || board[i][j+1]==3)) no_of_lives++;
                if ( (i+1)<rows && (j+1)<columns && (board[i+1][j+1]==1 || board[i+1][j+1]==3)) no_of_lives++;

                if( board[i][j]==1){
                    if( no_of_lives<2){
                        board[i][j]=1;
                    }
                    else if( no_of_lives>3){
                        board[i][j]=1;
                    }
                    else {
                        board[i][j]=3;
                    }
                }
                else {
                    if( no_of_lives==3){
                        board[i][j]= 2;
                    }
                    // rest all still dead so 0
                }
//                0 0 0
//                1 0 1
//                0 1 2
//                1 1 3
            }

        }
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j < columns; j++) {

                if( board[i][j]==2 || board[i][j]==3){
                    board[i][j]= 1;
                }
                else {
                    board[i][j]= 0;
                }
            }
        }


    }
}
