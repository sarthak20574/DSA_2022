package com.company;

import java.util.Collections;

public class MinimumNumberOfInsertionIn_a_StringToMakeIt_a_palindrome_DP {

    // abcd you can either delete a=or insert 3 items
    // palindrome s1= abcd s2= dcba
    // now get the longest common subsequence
    // no_of_deletions=string_length-lcs
    //

    int findMinInsertions(String S){

        String s1=S;
        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(S);

        // reverse StringBuilder input1
        input1.reverse();

        String s2= input1.toString();

        int lcss=lcs(s1.length(),s2.length(),s1,s2);

        return s1.length()-lcss;


    }

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
}
