package com.company;

public class Count_all_possible_paths_from_top_left_to_bottom_right {

    //Count all possible paths from top left to bottom right
    //https://practice.geeksforgeeks.org/problems/count-all-possible-paths-from-top-left-to-bottom-right3011/1

    long numberOfPaths(int m, int n)
    {
        int[][] arr= new int[m][n];

        for( int i=0; i<m; i++){
            arr[i][0]=1;
        }

        for( int i=0; i<n; i++){
            arr[0][i]=1;
        }

        for( int i=1; i<m; i++){
            for( int j=1; j<n; j++){
                arr[i][j]= (arr[i-1][j]+arr[i][j-1])%1_000_000_007;
            }
        }

        return arr[m-1][n-1];
    }
}
