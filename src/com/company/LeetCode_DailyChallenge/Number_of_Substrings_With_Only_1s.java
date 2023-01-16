package com.company.LeetCode_DailyChallenge;

public class Number_of_Substrings_With_Only_1s {


    //1513. Number of Substrings With Only 1s
    //https://leetcode.com/problems/number-of-substrings-with-only-1s/description/

    public int numSub(String s) {

        long no=0, ans=0;

        int mod= 1000000007;
        for( char c: s.toCharArray()){

            if( c=='1'){
                no++;
            }
            else{
                ans+=((no *(no+1)%mod )%mod)/2;
                no=0;
            }
        }

        ans+=((no *(no+1)%mod )%mod)/2;

        return (int)ans;
    }

}
