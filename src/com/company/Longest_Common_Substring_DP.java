package com.company;

public class Longest_Common_Substring_DP {
    // in abcdaf and zbcdf ans=3(bcd)
    //https://www.youtube.com/watch?v=BysNXJHzCEs

    int longestCommonSubstr(String S1, String S2, int n, int m){

        int[][] dp= new int[n+1][m+1];
        int ans=0;

        for(int i=0;i<n+1; i++){

            for( int j=0; j<m+1; j++){
                if( j==0||i==0)  dp[i][j]=0;

                else if(S1.charAt(i-1)==S2.charAt(j-1))
                    dp[i][j]=1+dp[i-1][j-1];

                else
                    dp[i][j]=0;
                ans=Math.max(dp[i][j],ans);
            }
        }
        return ans;
    }
}
