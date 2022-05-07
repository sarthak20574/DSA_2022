package com.company;

public class Best_Sightseeing_Pair {

    //

    //brute force
    /*
    int maxScoreSightseeingPair(vector<int>& values) {

        int n= values.size();

        vector<int> dp(n);
        int ans= 0;
        for( int i=0; i< n ; i++){

            for( int j=0; j<i; j++){
                dp[i]= max(dp[i], values[i] + values[j] - i + j);
            }
            ans= max( ans, dp[i]);
        }

         for( int i=0; i< n ; i++){
         cout<<dp[i]<<" ";
         }

        return ans;
    }

    //O(n)
    //https://www.youtube.com/watch?v=LeXxsRtxPY0&ab_channel=CodewithAlisha
    int maxScoreSightseeingPair(vector<int>& values) {
        int n= values.size();
        int ans= INT_MIN;
        int ai_plus_i= values[0]+0;

        for(  int j=1; j<n; j++){
            ans= max(ai_plus_i+ values[j]-j,ans);
            ai_plus_i=max( ai_plus_i, j+values[j]);
        }
       return ans;
    }


     */
}
