package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Matchsticks_to_Square {

    public boolean makesquare(int[] m) {

        int n= m.length;
        if( m.length<4)return false;

        int add=0;
        int maxx=0;
        for( int i=0; i<n ; i++){
            add+=m[i];
            maxx= Math.max( maxx,m[i]);
        }
        if( add%4!=0) return false;

        if( maxx>add/4) return false;

        Arrays.sort(m);

        return fn( 0,0,0 ,0 ,m,n-1, add/4);
    }


    boolean fn( int s1,int s2,int s3,int s4, int[] m, int i,int t){

        if( s1>t || s2>t || s3>t || s4>t) return false;
        if( i==-1) {
            if( s1==t && s2==t && s3==t)
                return true;
            else return false;
        }

        return (fn( s1+m[i],s2,s3,s4,m, i-1,t)||fn( s1,s2+m[i],s3,s4,m, i-1,t)
                || fn( s1,s2,s3+m[i],s4,m, i-1,t ) ||fn( s1,s2,s3,s4+m[i],m, i-1,t));



    }
}
