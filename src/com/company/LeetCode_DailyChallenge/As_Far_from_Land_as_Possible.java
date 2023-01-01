package com.company.LeetCode_DailyChallenge;

import java.util.LinkedList;
import java.util.Queue;

public class As_Far_from_Land_as_Possible {

    //1162. As Far from Land as Possible
    //https://leetcode.com/problems/as-far-from-land-as-possible/description/?envType=study-plan&id=graph-i

    public int maxDistance(int[][] grid) {

        int n= grid.length, m= grid[0].length;
        int water=0;

        Queue<int[]> q= new LinkedList<>();
        for( int i=0; i<n; i++){

            for( int j=0; j<m; j++){

                if( grid[i][j]==0)water++;
                else q.add( new int[]{i, j});
            }
        }

        //no water or full water,ie,no land exists
        if( water==0 || water== n*m) return -1;

        int ans=0;

        while(water>0){
            ans++;

            int len=q.size();


            for( int c=0; c<len; c++){

                int[] p= q.poll();
                int i=p[0], j=p[1];

                int[][] dirs= {{0,1}, {0,-1}, {1,0}, {-1,0}};

                for( int k=0; k<4; k++){

                    int x= i+ dirs[k][0];
                    int y= j+ dirs[k][1];
                    if( x>=0 && y>=0 && x<n && y<m && grid[x][y]==0){
                        water--;
                        grid[x][y]=1;
                        q.add(new int[]{x,y});
                    }
                }
            }

            if( water==0)return ans;

        }



        return ans;
    }

}
