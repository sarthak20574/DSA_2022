package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Maximize_Area_of_Square_Hole_in_Grid {

    //2943. Maximize Area of Square Hole in Grid
    //https://leetcode.com/problems/maximize-area-of-square-hole-in-grid/
    public int maximizeSquareHoleArea(int n, int m, int[] h, int[] v) {

        int max_v= Math.min( fn(h), fn(v));
        return max_v* max_v;

    }
    int fn( int[] a){

        Arrays.sort(a);
        int ans=1, n= a.length, cur;
        if( n>=1) ans=2;

        for( int i=1; i<n; i++){
            cur=1;
            while( i<n && a[i-1]+1== a[i]){
                //  System.out.println( i);
                cur++;
                i++;
            }
            if( cur!=1)i--;
            ans= Math.max( ans, cur+1);
        }
        //System.out.println();
        return ans;
    }
}
