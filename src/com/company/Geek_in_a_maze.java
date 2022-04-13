package com.company;

public class Geek_in_a_maze {
    /*
    //https://practice.geeksforgeeks.org/problems/b5e2a639b39537ea71e4551a4274383bda1c9a34/1#
        //https://www.youtube.com/watch?v=gZFSPihw6gY

        // start from 0,1 you have 3 choices 0,0(up) 1,1 (right), down ( 2,0 )
        // but there is # in 2 of the options so we can move in only 1 directionl, ie, up or
        //to 0,0 that too will have 4 possibilities so we use queue not a stack as first in first out
        // we exhaust all the possibilities, agar upar gaye ho toh uske saare possibilites ko khatam karo
        //unlike in dfs
        // for making sure we don't cross the upper limit for the upper and the downward motion,
        //at the startoing point here 1,0 we put both the upper and the down limit as 0
        // we mark the visited elements as 1 and at thge end we can countht no of the 1s at the end
        // or take a count as 0 and keep incrementing it as you move, we visit the upper node
        // increment count and then after than we pop from the queue and then get the second,
        // from there we can go back to 1,0 we came from there or visit a new node
        //since the origin( 1,0) is already visited so


     int numberOfCells(int n, int m, int r, int c, int u, int d, vector<vector<char>> &mat){

         queue<vector<int>> q;

         q.push({r, c, 0, 0});
         if( mat[r][c]=='#') return 0;
         mat[r][c]='1';
         int count=1;


         while( !q.empty()){
             int x= q.front()[0];
             int y= q.front()[1];
             int ups= q.front()[2];
             int downs= q.front()[3];


             if( y-1>=0 && mat[x][y-1]=='.'){
                 mat[x][y-1]='1';
                 count++;
                 q.push({x,y-1, ups, downs});
             }

             if(ups!=u  && x-1>=0 && mat[x-1][y]=='.'){
                 mat[x-1][y]='1';
                 count++;
                 q.push({x-1, y, ups+1, downs});
             }

             // row = n
             if( downs!=d  && x+1<n && mat[x+1][y]=='.'){
                  mat[x+1][y]='1';
                 count++;
                  q.push( {x+1, y, ups, downs+1});
             }

             if(y+1<m && mat[x][y+1]=='.'){
                  mat[x][y+1]='1';
                  count++;
                  q.push( {x, y+1, ups, downs});
             }

             q.pop();

         }
         return count;
     }
     */
}
