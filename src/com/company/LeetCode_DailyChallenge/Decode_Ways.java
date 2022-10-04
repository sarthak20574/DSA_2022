package com.company.LeetCode_DailyChallenge;

public class Decode_Ways {

    //Decode ways
    //https://leetcode.com/problems/decode-ways/description/
    //https://www.youtube.com/watch?v=cQX3yHS0cLo&ab_channel=KevinNaughtonJr.

    public int numDecodings(String s) {


        int[] dp=new int[ s.length()+1];


        // base cases

        //"" can be decoded in 1 way,ie, ""

        dp[0]=1;

        // for s=0 => 0 ways but for s=1 to 9 =>1 way
        if( s.charAt(0)=='0') dp[1]= 0;
        else dp[1]=1;

        for( int i=2; i<=s.length(); i++){

            //taking the last digit,ie, 4 in 134
            int one=Integer.valueOf(s.substring(i-1, i));

            // taking the last 2 digits,ie, 34 in 134
            int two= Integer.valueOf(s.substring(i-2, i));


            // if the last digit> 0 then we can decode in the same nubmer of ways as the  same string without the last digit, so we add the ways to decode the string without the last digit(dp[i-1])
            if( one>=1)
                dp[i]+=dp[i-1];

            // if the last 2 digits>=11 && <=26 then we can decode in the same nubmer of ways as the same string without the last 2 digit, so we add the ways to decode the string without the last 2 digit(dp[i-2])
            if( two>=10 && two<=26)
                dp[i]+=dp[i-2];
        }

        return dp[s.length()];
    }
}
