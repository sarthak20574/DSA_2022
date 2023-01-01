package com.company.LeetCode_DailyChallenge;

import java.util.LinkedList;
import java.util.Queue;

public class _01_Matrix {

    //542. 01 Matrix
    //https://leetcode.com/problems/01-matrix/description/
    //https://www.youtube.com/watch?v=edXdVwkYHF8&ab_channel=takeUforward

    // see the solution: 2 dp approach soo good
    //https://leetcode.com/problems/01-matrix/solutions/1369741/c-java-python-bfs-dp-solutions-with-picture-clean-concise-o-1-space/

    // from the link
    // Solution 2: Dynamic Programming
    //
    //For convinience, let's call the cell with value 0 as zero-cell, the cell has with value 1 as one-cell, the distance of the nearest 0 of a cell as distance.
    //Firstly, we can see that the distance of all zero-cells are 0, so we skip zero-cells, we process one-cells only.
    //In DP, we can only use prevous values if they're already computed.
    //In this problem, a cell has at most 4 neighbors that are left, top, right, bottom. If we use dynamic programming to compute the distance of the current cell based on 4 neighbors simultaneously, it's impossible because we are not sure if distance of neighboring cells is already computed or not.
    //That's why, we need to compute the distance one by one:
    //Firstly, for a cell, we restrict it to only 2 directions which are left and top. Then we iterate cells from top to bottom, and from left to right, we calculate the distance of a cell based on its left and top neighbors.
    //Secondly, for a cell, we restrict it only have 2 directions which are right and bottom. Then we iterate cells from bottom to top, and from right to left, we update the distance of a cell based on its right and bottom neighbors.



    public int[][] updateMatrix(int[][] mat) {

        int n= mat.length, m= mat[0].length;

        Queue<int[]> q= new LinkedList<>();

        int[][] ans= new int[n][m];
        //List<int[]> zeros= new ArrayList<>();

        for( int i=0; i<n; i++){
            for( int j=0; j<m; j++){
                if( mat[i][j]==0){
                    q.add(new int[]{i,j});
                    ans[i][j]=0;
                }
                else{
                    ans[i][j]=-1;//unvisited
                }

            }
        }



        int[][] dir= {{0,1},{0,-1},{-1,0}, {1,0}};

        int dist=0;

        while( q.isEmpty()==false){

            dist++;
            int len= q.size();

            for( int i=0; i<len ; i++){

                int[] cur=q.poll();

                int x=cur[0];
                int y= cur[1];

                for( int k=0; k<4; k++){

                    int xx= x+dir[k][0];
                    int yy= y+dir[k][1];


                    if( xx>=0 && xx<n && yy>=0 && yy<m && ans[xx][yy]==-1){

                        ans[xx][yy]=dist;
                        q.add( new int[]{xx,yy});

                    }
                }

            }
        }

        return ans;
    }

    }
