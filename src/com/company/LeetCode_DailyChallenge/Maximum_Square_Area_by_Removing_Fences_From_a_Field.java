package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Maximum_Square_Area_by_Removing_Fences_From_a_Field {

    //2975. Maximum Square Area by Removing Fences From a Field
    //https://leetcode.com/problems/maximum-square-area-by-removing-fences-from-a-field/description/
    // https://www.youtube.com/watch?v=XYYRLiLtH1M&ab_channel=AryanMittal

    public int maximizeSquareArea(int m, int n, int[] h, int[] v) {

        Arrays.sort( h);
        Arrays.sort( v);
        Set<Integer> s= new HashSet<>();

        int c, c1, l= h.length;

        for( int i=-1; i<l+1; i++){
            for( int j=i; j<l+1; j++){
                if( i==-1) c=1;
                else if( i==l) c=m;
                else c=h[i];

                if(j==-1) c1=1;
                else if( j==l) c1=m;
                else c1=h[j];

                s.add( c1-c);
            }
        }

        long ans=0, ll=v.length;;

        long mod = 1000000007;

        for( int i=-1; i<ll+1; i++){
            for( int j=i; j<ll+1; j++){
                if( i==-1) c=1;
                else if( i==ll) c=n;
                else c=v[i];

                if(j==-1) c1=1;
                else if( j==ll) c1=n;
                else c1=v[j];

                if( s.contains(c1-c)){
                    ans= Math.max( c1-c, ans);
                }
            }
        }

        if( ans==0) return -1;
        else return (int)((ans* ans)%mod);
    }
}
