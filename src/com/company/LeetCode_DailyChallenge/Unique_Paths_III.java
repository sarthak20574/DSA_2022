package com.company.LeetCode_DailyChallenge;

public class Unique_Paths_III {

    //980. Unique Paths III
    //https://leetcode.com/problems/unique-paths-iii/description/
    //https://www.youtube.com/watch?v=FNwH3r5WYTc&t=594s&ab_channel=CodewithAlisha

    int ans=0, rem=1;
    public int uniquePathsIII(int[][] grid) {

        //origin
        rem=1;

        int n= grid.length, m= grid[0].length, sr_x=0, sr_y=0;

        for( int i=0; i<n; i++){
            for( int j=0; j<m; j++ ){

                if( grid[i][j]==0) rem++;
                else if( grid[i][j]==1){
                    sr_x=i;
                    sr_y=j;
                }
            }
        }

        ans=0;

        fn( grid, n, m, sr_x, sr_y);

        return ans;
    }

    void fn( int[][] grid, int n, int m, int i, int j){

        // valid
        if((i>=0 && j>=0 && i<n && j<m)==false) return;

        if( grid[i][j]==-1) return;



        if( grid[i][j]==2){
            if(rem==0){
                ans++;
            }
            return;
        }

        rem--;
        grid[i][j]=-1;

        fn( grid, n, m, i+1, j);
        fn( grid, n, m, i-1, j);
        fn( grid, n, m, i, j+1);
        fn( grid, n, m, i, j-1);

        rem++;
        grid[i][j]=0;

    }
}
