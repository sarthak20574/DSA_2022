package com.company.LeetCode_DailyChallenge;

public class Longest_Palindromic_Substring {


    // brute force
    //generate all substrings in n_square then check if they are palindromr in o(n) total in ncube

    //
    //https://www.youtube.com/watch?v=y2BD4MJqV20
    // expand from mid

    public String longestPalindrome(String s) {

        int n= s.length();

        //if( n==0 ) return "";
        int beg=0, end= 0;
        for( int i=0; i< n; i++){

            int l= Math.max(palin_expanding_from_mid(i, i+1, s , n), palin_expanding_from_mid(i, i, s, n));

            if( l> end-beg ){
                beg= i- ((l-1)/ 2);
                end= i+l/2;
            }
        }

        return s.substring(beg, end+1);// in substring the end index in not included
    }
    int  palin_expanding_from_mid(int lft, int ryt, String s, int n){

        //if( lft> ryt) return 0;

        while ( lft>=0 && ryt<n && s.charAt(lft) == s.charAt(ryt)){
            lft--;
            ryt++;
        }
        return ryt- lft - 1;
    }

}
