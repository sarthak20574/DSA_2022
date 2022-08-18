package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Word_Search {

    //79. Word Search
    //https://leetcode.com/problems/word-search/

    boolean ans;
    public boolean exist(char[][] board, String word) {
        ans= false;


        int m= board.length, n= board[0].length;
        boolean[][] visited= new boolean[m][n];

        for( int i=0; i<m; i++)
            Arrays.fill( visited[i], false);

        for( int i=0; i<m; i++){
            for( int j=0; j<n; j++){
                if( board[i][j]==word.charAt(0) && ans == false){
                    visited[i][j]= true;
                    fn(board, 1, visited, word, m, n,i, j);
                    visited[i][j]= false;
                }
            }
        }

        return ans;

    }

    void fn( char[][] b, int cur, boolean[][] visited,
             String word, int m, int n, int i, int j){

        if( cur==word.length()){
            ans= true;
        }
        else{

            //System.out.println(i+" "+j);
            int[][] dir= {{0,1}, {1,0}, {0,-1}, {-1,0}};

            for( int k=0; k<4; k++){

                int x= i+ dir[k][0], y= j+dir[k][1];

                //System.out.println(x+" "+y);

                if( x>=0 && y>=0 && x<m && y<n &&
                        visited[x][y]==false && b[x][y]== word.charAt(cur)){

                    //System.out.println(x+" "+y);
                    visited[x][y]= true;
                    fn(b, cur+1, visited, word, m, n,x, y);
                    visited[x][y]= false;
                }

            }
        }

    }
}
