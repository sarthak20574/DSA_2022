package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Reducing_Dishes {

    //1402. Reducing Dishes
    //https://leetcode.com/problems/reducing-dishes/description/


    // the greedy soln
    public int maxSatisfaction(int[] satisfaction) {

        int ans=0, pre=0, n= satisfaction.length;

        Arrays.sort(satisfaction);

        for( int i=n-1; i>=0; i--){



            pre+=satisfaction[i];

            System.out.println(pre);

            if( pre<0) break;
            ans+=pre;
        }
        return ans;
    }


    // dp soln
    int[][] dp;
    public int maxSatisfaction_DP(int[] s) {

        Arrays.sort( s);
        // destroy or keep the dishes

        //=9 =8 -1 0 5

        int n= s.length;

        dp= new int[n+1][n+1];

        for( int i=0; i<n+1; i++){
            Arrays.fill(dp[i], -1);
        }

        return dfs(0, s,n ,1);
    }

    int dfs(int i, int[] s, int n, int no){

        if( i==n){
            return 0;
        }

        if(dp[i][no]!=-1) return dp[i][no];

        int res=0;
        res= Math.max(dfs(i+1, s, n, no+1)+ no* s[i],
                dfs( i+1, s, n,no ));

        dp[i][no]=res;
        return res;
    }
}
