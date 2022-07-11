package com.company;

public class Longest_Common_Subsequence_DP {
    // in abcdaf adn acbcf, ans=abcf
    //https://www.youtube.com/watch?v=NnD96abizww

    static int lcs(int x, int y, String s1, String s2) {

        int[][] dp= new int[x+1][y+1];

        for ( int i=0; i< x+1; i++){

            for( int j=0; j<y+1; j++){
                if( j==0||i==0) dp[i][j]=0;

                else if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else {
                    dp[i][j]= Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[x][y];
    }

    //https://www.youtube.com/watch?v=on2hvxBXJH4&ab_channel=takeUforward

    /*
     int lengthOfLIS(vector<int>& nums) {

        int ans=1;
        vector<int> dp;

        int n= nums.size();

        dp.push_back(nums[0]);

        for( int i=1; i<n ;i++ ){

            if( dp.back()<nums[i]){
                dp.push_back(nums[i]);
                ans++;
            }
            else{
                int x= (lower_bound( dp.begin(),dp.end(), nums[i])-dp.begin());
                dp[x]= nums[i];
            }
        }

        return ans;

    }
     */

}
