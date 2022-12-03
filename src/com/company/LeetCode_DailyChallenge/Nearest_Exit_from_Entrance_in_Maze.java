package com.company.LeetCode_DailyChallenge;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Nearest_Exit_from_Entrance_in_Maze {

    //1926. Nearest Exit from Entrance in Maze
    //https://leetcode.com/problems/nearest-exit-from-entrance-in-maze/description/

    public int nearestExit(char[][] maze, int[] entrance) {

        Set<String> visited= new HashSet<>();
        visited.add(entrance[0]+" "+entrance[1]);
        if( maze[entrance[0]][entrance[1]]=='+')return -1;


        Queue<int[]> q= new LinkedList<>();
        q.add( entrance);


        int ans=0;

        while( q.isEmpty()==false){

            ans++;


            int size= q.size();

            for( int k=0; k<size; k++){
                int[] p= q.poll();


                int[][] dir= {{1,0}, {-1,0}, {0,-1}, {0,1}};


                for( int i=0; i<4; i++){
                    int x= p[0]+ dir[i][0];
                    int y= p[1]+ dir[i][1];

                    if((x>=0 && x<maze.length && y>=0 && y<maze[0].length)== false)    return ans;

                    if( maze[x][y]!='+' && visited.contains(x+" "+ y)==false){
                        visited.add( x+" "+ y);
                        q.add( new int[]{x,y});
                    }

                }
            }

        }

        return -1;

    }
}
