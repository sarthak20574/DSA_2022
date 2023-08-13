package com.company.LeetCode_DailyChallenge;

public class Surrounded_Regions {

    //130. Surrounded Regions
    //https://leetcode.com/problems/surrounded-regions/description/

    int[][] dirs= {{0,1}, {0,-1}, {1,0}, {-1,0}};

    public void solve(char[][] b) {

        int n=b.length, m= b[0].length;

        for( int i=0; i<n; i++){
            if( b[i][m-1]=='O'){
                b[i][m-1]='1';
                dfs(i, m-1, n, m, b);
            }
            if( b[i][0]=='O'){
                b[i][0]='1';
                dfs(i, 0, n, m, b);
            }
        }

        for( int i=0; i<m; i++){
            if( b[n-1][i]=='O'){
                b[n-1][i]='1';
                dfs(n-1, i, n, m, b);
            }
            if( b[0][i]=='O'){
                b[0][i]='1';
                dfs(0, i, n, m, b);
            }
        }


        for( int i=0; i<n; i++){

            for( int j=0; j<m; j++){
                if( b[i][j]=='O'){
                    b[i][j]='X';
                }
                else if( b[i][j]=='1'){
                    b[i][j]='O';
                }
            }

        }

    }

    void dfs(int i, int j, int n, int m, char[][] b){

        int[][] dirs= {{0,1}, {0,-1}, {1,0}, {-1,0}};
        //System.out.println(i+" "+j);

        for( int k=0; k<4; k++){
            int x= i+ dirs[k][0], y= j+ dirs[k][1];

            if( x>=0 && y>=0 && x<n && y<m && b[x][y]=='O'){
                b[x][y]='1';
                //   System.out.println(x+" "+y);
                dfs(x, y,n, m, b);
            }
        }
    }

}
