package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Flip_String_to_Monotone_Increasing {

    //926. Flip String to Monotone Increasing
    //https://leetcode.com/problems/flip-string-to-monotone-increasing/description/

    public int minFlipsMonoIncr(String s) {

        int n=s.length();
        int ans=n;
        int[] zeros_after= new int[n];
        //boolean[] used=new boolean[n];


        int zeros=0;
        for( int i=n-1; i>=0; i--){
            zeros_after[i]=zeros;
            if( s.charAt(i)=='0') zeros++;
        }

        //System.out.println(Arrays.toString(zeros_after));


        // zeros = when all zeros flipped to 1
        ans= Math.min(zeros, ans);

        int ones=0;
        for( int i=0; i<n; i++){
            if(s.charAt(i)=='0'){

                // flipping 0 to 1 so will have to do so for all the next zeros


                ans= Math.min(ans, ones+ zeros_after[i]);
            }
            else {
                //1 then we flip it to a zero

                ones++;
            }
            //System.out.println( "1s="+ ones );
        }

        // when all the ones are flipped to zeros
        ans= Math.min( ans, ones);


        return ans;
    }
}
