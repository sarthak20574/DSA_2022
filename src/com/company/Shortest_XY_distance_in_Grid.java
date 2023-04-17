package com.company;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class Shortest_XY_distance_in_Grid {

    //Shortest XY distance in Grid

    //https://practice.geeksforgeeks.org/problems/7366ce450d84b55391fc787a681c4d60de359e72/1

    static int shortestXYDist(ArrayList<ArrayList<Character>> grid, int N,
                              int M) {


        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.get(0).size(); j++) {
                if (grid.get(i).get(j) == 'X') q.add(new int[]{i, j});
            }
        }
        int ans=0;

        while( q.isEmpty()==false){

            int n= q.size();
            ans++;

            for( int l=0; l<n; l++){

                int[] k= q.poll();

                int[][] dirs= {{0,1}, {0,-1}, {1,0}, {-1,0}};

                for (int i = 0; i < 4; i++) {
                    int x=k[0]+dirs[i][0], y=k[1]+dirs[i][1];

                    if( x>=0 && x<grid.size() && y>=0 && y<grid.get(0).size() && grid.get(x).get(y)!='X'){

                        if(grid.get(x).get(y)=='Y')return ans;
                        grid.get(x).set(y, 'X');

                        q.add(new int[]{x, y});
                    }

                }


            }
        }

        return 0;

    }
}
