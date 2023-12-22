package com.company.LeetCode_DailyChallenge;

public class Minimum_Moves_to_Spread_Stones_Over_Grid {

    //2850. Minimum Moves to Spread Stones Over Grid
    //https://leetcode.com/problems/minimum-moves-to-spread-stones-over-grid/

    public int minimumMoves(int[][] g) {
        int l=0;

        for( int i=0; i<3; i++)
            for( int j=0; j<3; j++)
                if( g[i][j]==0) l++;


        //base
        if( l==0) return 0;

        int ans= Integer.MAX_VALUE;


        for( int i=0; i<3; i++){
            for( int j=0; j<3; j++){

                if( g[i][j]==0){

                    for( int ii=0; ii<3; ii++){
                        for( int jj=0; jj<3;jj++){
                            if(g[ii][jj]>1){
                                g[i][j]++;
                                g[ii][jj]--;
                                ans=
                                        Math.min( ans,
                                                Math.abs(ii-i)+
                                                        Math.abs(jj-j)
                                                        +minimumMoves( g));
                                g[i][j]--;
                                g[ii][jj]++;
                            }
                        }
                    }
                }
            }
        }

        return ans;
    }
}
