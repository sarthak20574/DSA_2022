package com.company.LeetCode_DailyChallenge;

public class Shortest_Common_Supersequence {

    //1092. Shortest Common Supersequence
    //https://leetcode.com/problems/shortest-common-supersequence/
    //https://www.youtube.com/watch?v=xElxAuBcvsU&ab_channel=takeUforward

    public String shortestCommonSupersequence(String t1, String t2) {
        int n= t1.length(), n2= t2.length();


        int[][] dp= new int[n+1][n2+1];


        for( int i=1; i<n+1; i++){

            for( int j=1; j<n2+1;j++){
                if(t1.charAt(i-1)==t2.charAt(j-1)){
                    dp[i][j]= 1+ dp[i-1][j-1];
                }
                else{
                    dp[i][j]= Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }

        System.out.println(dp[n][n2]);

        StringBuilder ans= new StringBuilder();

        int cur=dp[n][n2];

        int i=n, j=n2;

        while(i>=1 && j>=1 ){
            if(t1.charAt(i-1)==t2.charAt(j-1)){
                ans.append(t1.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i-1][j]==dp[i][j]){
                ans.append(t1.charAt(i-1));
                i--;
            }
            else{
                ans.append(t2.charAt(j-1));
                j--;
            }
        }

        while(i>=1){
            ans.append(t1.charAt(i-1));
            i--;
        }
        while(j>=1){
            ans.append(t2.charAt(j-1));
            j--;
        }

        ans.reverse();
        return ans.toString();
    }

}
