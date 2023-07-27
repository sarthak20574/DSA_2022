package com.company.LeetCode_DailyChallenge;

import java.util.LinkedList;
import java.util.Queue;

public class Last_Day_Where_You_Can_Still_Cross {

    //1970. Last Day Where You Can Still Cross
    //https://leetcode.com/problems/last-day-where-you-can-still-cross/description/


    public int latestDayToCross(int r, int c, int[][] arr) {

        int beg=1, end= arr.length, mid, ans=c;

        while( beg<=end){

            mid= beg + (end-beg)/2;

            if(  fn(arr, r, c, mid)){
                ans=mid;
                beg=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        return ans;
    }


    boolean fn(int[][] arr, int n, int m, int d){

        Queue<int[]> q= new LinkedList<>();
        boolean[][] vis= new boolean[n][m];

        int[][] grid= new int[n][m];

        for( int i=0; i<d; i++){
            grid[arr[i][0]-1][arr[i][1]-1]=1;
        }

        for( int i=0; i<m;  i++){
            if( grid[0][i]!=1){
                q.add(new int[]{0,i});
                if( n-1==0) return true;
                //System.out.println(0+" : "+i+ " d="+d);

                vis[0][i]=true;
            }
        }



        // int ans=0;

        while( q.size()!=0){

            // q.size() is changing inside the loop so pre calculate it
            int len=q.size();

            // ans++;



            for( int l=0; l< len; l++){

                int[] aa= q.poll();
                int i=aa[0], j=aa[1];

                int[][] dirs={ {0,1}, {0,-1}, {1,0}, {-1,0}};

                for( int[] a:dirs ){
                    int x=i+ a[0];
                    int y= j+ a[1];

                    if( x>=0 && y>=0 && x<n && y<m &&
                            vis[x][y]==false && grid[x][y]!=1){
                        // System.out.println(x+" : "+y+ " d="+d);
                        if( x==n-1) return true;
                        q.add( new int[]{x,y});
                        vis[x][y]=true;
                        //bfs(grid, vis, n, m, x, y);
                    }
                }

            }


        }

        return false;
    }
}
