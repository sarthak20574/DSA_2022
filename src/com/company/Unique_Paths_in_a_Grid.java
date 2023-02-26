package com.company;

public class Unique_Paths_in_a_Grid {

    //Unique Paths in a Grid
    //https://practice.geeksforgeeks.org/problems/96161dfced02d544fc70c71d09b7a616fe726085/1
    static int uniquePaths(int n, int m, int[][] grid) {

        int mod= 1000000007;
        int[][] dp= new int[n][m];


        if( grid[0][0]==0) return 0;
        else dp[0][0]= grid[0][0];


        for( int i=1; i<n; i++){

            if( grid[i][0]==1)

                dp[i][0]= (dp[i-1][0]);
        }

        for( int i=1; i<m; i++){
            if( grid[0][i]==1)
                dp[0][i]= dp[0][i-1];
        }


        for( int i=1; i<n; i++){

            for( int j=1; j<m; j++){

                if( grid[i][j]==1)
                    dp[i][j]= (dp[i-1][j] + dp[i][j-1])%mod;
            }
        }




        return dp[n-1][m-1];
    }

}
