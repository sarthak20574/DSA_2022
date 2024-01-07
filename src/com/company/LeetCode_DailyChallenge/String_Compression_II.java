package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class String_Compression_II {

    //1531. String Compression II
    //https://leetcode.com/problems/string-compression-ii/description/?envType=daily-question&envId=2023-12-28
    //https://www.youtube.com/watch?v=ISIG3o-Xofg&ab_channel=NeetCodeIO

    long[][][][] dp;
    public int getLengthOfOptimalCompression(String s, int k) {
        int n = s.length();
        dp= new long[n+1][k+1][27][n+1];

        for( int i=0; i<n+1; i++){
            for( int j=0; j<k+1; j++){
                for( int l=0; l<27; l++){
                    Arrays.fill( dp[i][j][l], -1L)
                    ;                }
            }
        }
        return (int)fn(0, k, s,0, (char)('a'+26));
    }

    long fn(int i, int k, String s, int cur, char prev){

        if( k<0) return s.length();

        if( i==s.length()){
            return 0L;
        }

        if( dp[i][k][prev-'a'][cur]!=-1L)
            return dp[i][k][prev-'a'][cur];

        Set<Integer> o= new HashSet<>();
        o.add(2);
        o.add(10);
        o.add(100);

        long ans;

        if( s.charAt(i)==prev){
            if( o.contains(cur+1))
                ans= 1+fn(i+1, k, s, cur+1, prev);
            else ans=fn(i+1, k, s, cur+1, prev);
        }
        else {
            ans= Math.min(1+fn(i+1, k, s, 1, s.charAt(i)),
                    fn(i+1, k-1, s, cur, prev));
        }

        dp[i][k][prev-'a'][cur]= ans;
        return ans;

    }
}
