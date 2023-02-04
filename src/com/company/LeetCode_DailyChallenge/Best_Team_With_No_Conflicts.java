package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Best_Team_With_No_Conflicts {

    //1626. Best Team With No Conflicts
    //https://leetcode.com/problems/best-team-with-no-conflicts/description/

    public int bestTeamScore(int[] scores, int[] ages) {
        // 1 8 9 10
        // 5 1 2 3
        // 5 1 3 6

        // 1 1 2 2
        // 5 5 4 6
        // 5 10 4 16

        int n= scores.length;

        int[][] arr= new int[n][2];

        for( int i=0; i<n; i++){
            arr[i]= new int[]{ages[i], scores[i]};
        }



        // sort by age
        Arrays.sort(arr, (a, b)->a[0]==b[0]? a[1]-b[1]: a[0]-b[0]);

        //System.out.println(Arrays.deepToString(arr));

        int[] dp =new int[n];

        for( int i=0; i<n; i++){
            dp[i]=arr[i][1];
        }

        int ans=dp[0];

        for( int i=1; i<n; i++){

            for( int j=0; j<i; j++){

                if( arr[j][0]==arr[i][0]){
                    dp[i]= Math.max( dp[i], dp[j]+ arr[i][1]);
                }
                else if( arr[j][1]<=arr[i][1]){
                    dp[i]= Math.max( dp[i], dp[j]+ arr[i][1]);
                }
            }
            ans= Math.max( ans, dp[i]);
        }
        //System.out.println(Arrays.toString(dp));

        return ans;
    }

}
