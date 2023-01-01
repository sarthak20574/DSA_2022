package com.company.LeetCode_DailyChallenge;

public class Minimum_Falling_Path_Sum {

    //931. Minimum Falling Path Sum
    //https://leetcode.com/problems/minimum-falling-path-sum/description/

    public int minFallingPathSum(int[][] mat) {

        int n= mat.length, m= mat[0].length;
        int[][] dp= new int[n+1][m];

        for( int i=1; i<=n; i++){
            for( int j=0; j<m; j++){
                if(j==0){
                    dp[i][j]= dp[i-1][j] +mat[i-1][j];

                    if( j+1<m)
                        dp[i][j]=Math.min(dp[i][j], dp[i-1][j+1] +mat[i-1][j] );

                }
                else if( j==m-1){
                    dp[i][j]= Math.min( dp[i-1][j] +mat[i-1][j],
                            dp[i-1][j-1] +mat[i-1][j] );
                }
                else{
                    dp[i][j]= Math.min( dp[i-1][j] +mat[i-1][j],
                            dp[i-1][j-1] +mat[i-1][j]);
                    dp[i][j]= Math.min( dp[i][j], dp[i-1][j+1]+mat[i-1][j]);
                }
            }
        }

        int ans= Integer.MAX_VALUE;
        for( int j=0; j<m; j++){
            ans= Math.min( ans, dp[n][j]);
        }

        //System.out.println(Arrays.deepToString(dp));
        return ans;
    }
}
