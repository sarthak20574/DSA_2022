package com.company.LeetCode_DailyChallenge;

public class Can_Place_Flowers {

    //605. Can Place Flowers
    //https://leetcode.com/problems/can-place-flowers/description/

    public boolean canPlaceFlowers(int[] f, int n) {

        int cur=0, len= f.length;


        for( int i=0; i<len; i++){

            boolean valid=true;

            if( i-1>=0 && f[i-1]==1) valid=false;
            if( f[i]==1) valid=false;
            if( i+1<len && f[i+1]==1) valid=false;


            if( valid==true) {
                f[i]=1;
                cur++;
            }
        }

        return cur>=n;
    }
}
