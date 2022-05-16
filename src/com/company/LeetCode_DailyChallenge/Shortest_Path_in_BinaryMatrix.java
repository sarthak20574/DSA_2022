package com.company.LeetCode_DailyChallenge;

import java.util.LinkedList;
import java.util.Queue;

public class Shortest_Path_in_BinaryMatrix {

    //https://www.youtube.com/watch?v=p4kOKdLmktg
    //https://leetcode.com/problems/shortest-path-in-binary-matrix/

    public int shortestPathBinaryMatrix(int[][] grid) {
        int n= grid.length;

        if( grid[0][0]==1 || grid[n-1][n-1]==1) return -1;
        int[][] direct=new int[][]{{0,1},{0,-1}, {1,0}, {-1, 0},{1,1}, {1,-1}, {-1, 1}, {-1,-1}};
        boolean visited[][] = new boolean[n][n];// by default all false

        visited[0][0]= true;
        Queue<int[]> queue= new LinkedList<>();
        queue.add(new int[]{0,0});

        int ans=0;

        while (!queue.isEmpty()){
            int size_queue= queue.size();

            // remove all the nodes from that level
            for (int i = 0; i < size_queue; i++) {
                int[] temp= queue.poll();
                int x=temp[0];
                int y= temp[1];

                System.out.println("x="+x +" y= "+y);


                if( x==n-1 && y==n-1) return ans+1;

                for( int c=0; c<8; c++){

                    if( x+direct[c][0]>=0 && x+direct[c][0]<n && y+direct[c][1]>=0 &&  y+direct[c][1]<n
                            && (!visited[x + direct[c][0]][y + direct[c][1]]) &&
                            grid[x + direct[c][0]][y + direct[c][1]]==0){
                        queue.add(new int[]{x+direct[c][0],y+direct[c][1]});
                        visited[x + direct[c][0]][y + direct[c][1]]=true;
                    }
                }

            }

            ans++;
        }
        return -1;
    }

    }
