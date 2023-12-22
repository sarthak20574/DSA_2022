package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Number_of_Ways_to_Divide_a_Long_Corridor {

    //2147. Number of Ways to Divide a Long Corridor
    //https://leetcode.com/problems/number-of-ways-to-divide-a-long-corridor/

    long mod= 1_000_000_007L;

    public int numberOfWays(String c) {

        int n=c.length();
        long s=0L, ans=1L, cur=1;

        for( int i=0; i<n; i++){
            s+=c.charAt(i)=='S'?1:0;

            if( s>1 && s%2==0 && c.charAt(i)=='P') cur++;

            if( c.charAt(i)=='S' && s%2==0){
                // System.out.println(cur+" "+ s);

                ans= (ans*cur)%mod;
                cur=1;
            }

            ans= ans%mod;

            // System.out.println(cur+" "+ s+" "+ c.charAt(i));
        }

        if( s==2) return 1;
        if( s<2) return 0;
        return (int)(s%2==0?ans:0);
    }
    class Solution {

        long[][] dp;
        long mod= 1_000_000_007L;
        public int numberOfWays(String c) {

            int n=c.length();
            dp= new long[n+1][3];

            for( int i=0; i<n+1; i++){
                Arrays.fill( dp[i], -1L);
            }

            // int s=0;
            // for( char k: c.toCharArray()){
            //     if( k=='S') s++;
            // }
            // if( s==2) return 1;
            // if( s<=1) return 0;

            return (int)fn(0, 0, c);
        }

        long fn( int i, int s, String corr){

            int n= corr.length();

            // if( s>2) return 0L;

            if( i==n){
                if( s==2)  return 1L;
                else return 0L;
            }

            if( dp[i][s]!=-1L) return dp[i][s];

            long ans=0l;

            if( s==2){
                if( corr.charAt(i)=='P'){
                    ans=( ans +fn( i+1,s, corr))%mod ;
                    ans=( ans +fn( i+1,0, corr))%mod ;
                }
                else{
                    ans=( ans +fn( i+1,1, corr))%mod;
                }
            }
            else{
                ans=( ans +fn( i+1,s+(corr.charAt(i)=='S'?1:0), corr))%mod;
            }

            dp[i][s]=ans;

            return ans;
        }
    }
}
