package com.company.LeetCode_DailyChallenge;

public class Zigzag_Conversion {

    //6. Zigzag Conversion
    //https://leetcode.com/problems/zigzag-conversion/description/

    public String convert(String s, int n) {


        int dir= 1, len=s.length(), cur=0;
        StringBuilder[] ans= new StringBuilder[n];

        for( int i=0; i<n; i++){
            ans[i]= new StringBuilder();
        }

        while( cur<len){

            if( dir==1){
                for( int k=0; k<=n-1 && cur<len; k++){
                    ans[k].append(s.charAt(cur++));
                }

                dir=-1;
            }

            if( dir==-1){
                for( int k=n-2; k>=1 && cur<len; k--){
                    ans[k].append( s.charAt(cur++));
                }

                dir=1;
            }

        }


        StringBuilder ret= new StringBuilder();

        for( StringBuilder x: ans){
            ret.append(x.toString());
        }

        return ret.toString();

    }
}
