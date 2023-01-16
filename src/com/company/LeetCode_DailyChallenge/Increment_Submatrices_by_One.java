package com.company.LeetCode_DailyChallenge;

public class Increment_Submatrices_by_One {


//2536. Increment Submatrices by One
//https://leetcode.com/problems/increment-submatrices-by-one/description/

    public int[][] rangeAddQueries(int n, int[][] queries) {

        int[][] ans= new int[n][n];

// [r1 c1 r2 c2]

        for( int[] q: queries ){

            int r1=q[0], c1= q[1], r2= q[2], c2=q[3];
            for( int i=r1; i<=r2; i++){
                ans[i][c1]++;

                if( c2+1<n){
                    ans[i][c2+1]--;
                }

            }
        }

        for( int i=0; i<n; i++){

            for( int j=1; j<n; j++){
                ans[i][j]+=ans[i][j-1];

            }
        }

        return ans;

    }
}
