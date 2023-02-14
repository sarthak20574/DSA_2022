package com.company.LeetCode_DailyChallenge;

import java.util.*;

public class Pacific_Atlantic_Water_Flow {

    //417. Pacific Atlantic Water Flow
    //https://leetcode.com/problems/pacific-atlantic-water-flow/description/
    // see neetcode's video

    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        int r= heights.length;
        int c= heights[0].length;


        // we start dfs from the atlantic and the pacific ocean to the cells where water can reach and then find the cells where both the ocean's can reach

        boolean[][] atlantic= new boolean[r][c];
        boolean[][] pacific= new boolean[r][c];


        // visit the first and the last row
        for( int i=0; i<c; i++){
            // pacific
            dfs(  heights, pacific, r,c,0,i);
            //atlantic
            dfs(  heights, atlantic, r,c,r-1,i);
        }

        // visit the 1st and the last column
        for(int i=0; i<r; i++){

            //pacific
            dfs(  heights, pacific, r,c,i,0);

            //atlantic
            dfs(  heights,atlantic, r,c,i,c-1);
        }


        // now add common cells to our answer
        List<List<Integer>> ans= new ArrayList<>();
        for( int i=0; i<r; i++){
            for( int j=0; j<c; j++){
                if( atlantic[i][j] && pacific[i][j])
                    ans. add(List.of(i,j));
            }
        }

        return ans;

    }

    void dfs( int[][] nums,boolean[][] ocean, int r, int c, int i, int j){

        ocean[i][j]=true;

        int[][] dir={{0,1}, {0,-1}, {1,0}, {-1,0}};
        for( int k=0; k<4; k++){
            int x= i+ dir[k][0];
            int y= j+ dir[k][1];

            if( x>=0 && y>=0 && x<r && y<c &&
                    ocean[x][y]==false && nums[i][j]<= nums[x][y] ){
                dfs( nums, ocean, r,c,x,y);
            }
        }
    }



    //BFS
    public List<List<Integer>> pacificAtlantic1(int[][] mat) {

        List<List<Integer>> ans= new ArrayList<>();
        int n= mat.length, m=mat[0].length;


        boolean[][] in= new boolean[n][m];
        boolean[][] ar= new boolean[n][m];

        Queue<int[]> q= new LinkedList<>();

        for( int i=0; i< m; i++){
            in[0][i]=true;
            q.add(new int[]{0, i});
        }
        for( int i=0; i< n; i++){
            in[i][0]=true;
            q.add(new int[]{i, 0});
        }

        while( q.isEmpty()==false){

            int len= q.size();

            for( int k=0; k<len; k++){

                int[] t= q.poll();
                int x=t[0], y=t[1];

                int[][] dir= {{0,1}, {1,0}, {0,-1}, {-1,0}};

                for( int l=0; l<4; l++){
                    int xx= x+ dir[l][0], yy= y+ dir[l][1];

                    if( xx>=0 && yy>=0 && xx<n && yy<m &&
                            in[xx][yy]==false && mat[x][y] <= mat[xx][yy] ){
                        in[xx][yy]=true;
                        //System.out.println(x+ " "+y+" ie "+mat[x][y]+
                        //" to "+xx +" "+yy+" ie "+mat[xx][yy]);
                        q.add(new int[]{xx, yy});
                    }
                }
            }
        }


        q= new LinkedList<>();

        for( int i=0; i< m; i++){
            ar[n-1][i]=true;
            q.add(new int[]{n-1, i});
        }
        for( int i=0; i< n; i++){
            ar[i][m-1]=true;
            q.add(new int[]{i, m-1});
        }

//        for( int i=0; i< n; i++){
//            ar[i][0]=true;
//            q.add(new int[]{i, 0});
//        }



        while( q.isEmpty()==false){

            int len= q.size();

            for( int k=0; k<len; k++){

                int[] t= q.poll();
                int x=t[0], y=t[1];

                int[][] dir= {{0,1}, {1,0}, {0,-1}, {-1,0}};

                for( int l=0; l<4; l++){
                    int xx= x+ dir[l][0], yy= y+ dir[l][1];

                    if( xx>=0 && yy>=0 && xx<n && yy<m &&
                            ar[xx][yy]==false && mat[x][y] <= mat[xx][yy] ){
                        ar[xx][yy]=true;
                        //System.out.println(x+ " "+y+" ie "+mat[x][y]+
                        //" to "+xx +" "+yy+" ie "+mat[xx][yy]);
                        q.add(new int[]{xx, yy});
                    }
                }
            }
        }

        for( int i=0; i<n; i++){
            for( int j=0; j<m; j++){
                if( ar[i][j] && in[i][j]){
                    ans.add( new ArrayList<Integer>(Arrays.asList(i,j)));
                }
            }

        }

        // System.out.println(Arrays.deepToString(ar));
        // System.out.println();
        // System.out.println(Arrays.deepToString(in));

        return ans;
    }
}
