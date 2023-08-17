package com.company.LeetCode_DailyChallenge;

import java.util.LinkedList;
import java.util.Queue;

public class BFS_DFS_matrix_graph {

    Queue<int[]> q= new LinkedList<>();
    public int shortestBridge(int[][] grid) {

        int n=grid.length, m= grid[0].length;
        boolean[][] vis= new boolean[n][m];

        boolean found=false;

        for( int i=0; i<n; i++){
            if( found==true) break;
            for( int j=0; j<m; j++){

                if( found==false && grid[i][j]==1){
                    found=true;
                    vis[i][j]=true;
                    q.add( new int[]{i,j});
                    dfs(grid,vis, n, m, i, j);
                }
            }
        }


        int len=q.size();

        //ans++;

        for( int l=0; l< len; l++){
            int[] x= q.poll();
            System.out.println(x[0]+ " "+ x[1]);
            q.add(x);
        }


        int ans=bfs(grid,vis, n, m);

        return ans-1;
    }

    void dfs(int[][] grid, boolean[][] vis, int n, int m,
             int i, int j){

        int[][] dirs={ {0,1}, {0,-1}, {1,0}, {-1,0}};

        for( int[] a:dirs ){
            int x=i+ a[0];
            int y= j+ a[1];

            if( x>=0 && y>=0 && x<n && y<m &&
                    vis[x][y]==false && grid[x][y]==1){
                q.add( new int[]{x,y});
                vis[x][y]=true;
                dfs(grid, vis, n, m, x, y);

            }
        }

    }

    int bfs(int[][] grid,boolean[][] vis, int n, int m){

        Queue<int[]> q= new LinkedList<>();
        boolean[][] vis= new boolean[n][m];

        int ans=0;
        q.add(new int[]{0,0});



        while( q.size()!=0){

            // q.size() is changing inside the loop so pre calculate it
            int len=q.size();

            ans++;

            for( int l=0; l< len; l++){

                int[] aa= q.poll();
                int i=aa[0], j=aa[1];

                int[][] dirs={ {0,1}, {0,-1}, {1,0}, {-1,0}};

                for( int[] a:dirs ){
                    int x=i+ a[0];
                    int y= j+ a[1];

                    if( x>=0 && y>=0 && x<n && y<m &&
                            vis[x][y]==false){
                        if( grid[x][y]==1) return ans;
                        q.add( new int[]{x,y});
                        vis[x][y]=true;
                        //bfs(grid, vis, n, m, x, y);
                    }
                }

            }


        }

        return ans;
    }

}
