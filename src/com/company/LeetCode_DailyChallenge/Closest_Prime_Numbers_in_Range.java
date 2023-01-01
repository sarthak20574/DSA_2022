package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Closest_Prime_Numbers_in_Range {

    //2523. Closest Prime Numbers in Range
    //https://leetcode.com/problems/closest-prime-numbers-in-range/description/

    public int[] closestPrimes(int left, int right) {

        int R= right;
        int L=left;
        boolean[] p= new boolean[R+1];

        Arrays.fill(p, true);

        p[0]=p[1]=false;

        for(int i=2; i<R+1; i++){

            if( p[i]==true){

                for( int j=i+i; j<R+1; j+=i){
                    p[j]=false;
                }
            }
        }


        int ans=Integer.MAX_VALUE, prev= Integer.MIN_VALUE, prev_n=-1, nxt_n= -1;

        for( int k=L; k<=R; k++){

            // 1 is neighter primes nor composite so skip

            if( k==1)continue;

            if( p[k]==true) {
                if( prev!=Integer.MIN_VALUE){
                    if( ans> k-prev){
                        ans=Math.min(ans, k-prev);
                        prev_n= prev;
                        nxt_n=k;
                    }

                }
                prev=k;
            }
        }

        return new int[]{prev_n, nxt_n};
    }
}
