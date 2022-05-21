#include<bits/stdc++.h>
using namespace std;

//322. Coin Change
//https://leetcode.com/problems/coin-change/
//https://www.youtube.com/watch?v=H9bfqozjoqs

        int coinChange(vector<int>& coins, int amount) {
             int n= coins.size();

             vector<int> dp(amount+1,amount+1);
                 dp[0]=0;
             for( int i=1; i<=amount; i++){
                 int min_temp=INT_MAX;
                 for( int j=0; j<n;j++){
                     if( i-coins[j]>=0){
                          dp[i]= min(dp[i],1+dp[i-coins[j]]);
                     }
                 }
             }
             return dp[amount]>amount?-1:dp[amount];
           }