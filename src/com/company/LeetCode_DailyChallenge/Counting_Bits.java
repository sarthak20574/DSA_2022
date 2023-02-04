package com.company.LeetCode_DailyChallenge;

public class Counting_Bits {

    //338. Counting Bits
    //https://leetcode.com/problems/counting-bits/description/
    //can see neetcode's video

    public int[] countBits(int n) {

        int[] ans= new int[n+1];



        if( n>=1) ans[1]=1;
        if( n>=2) ans[2]=1;
        if( n>=3) ans[3]=2;
        //if( n>=2) d[4]=1;

        int round=0, size= 2;

        for( int i=4; i<=n; i++){

            //System.out.println(i+": "+round+" "+ size);
            ans[i]=ans[i-size] + round/size;
            round++;

            if( round==size*2){
                round=0;
                size*=2;
            }
        }

        return ans;
    }
}
