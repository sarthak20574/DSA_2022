package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Successful_Pairs_of_Spells_and_Potions {

    //2300. Successful Pairs of Spells and Potions
    //https://leetcode.com/problems/successful-pairs-of-spells-and-potions/description/

    public int[] successfulPairs(int[] s, int[] p, long success) {

        Arrays.sort(p);

        int n= p.length;

        int[] ans= new int[s.length];

        for( int i=0; i<s.length; i++ ){

            int cur=n, low= 0, high= n-1, mid;

            while( low<= high){

                mid= low+ (high- low)/2;
                //System.out.println( "mid="+ mid);

                if( valid( p[mid],s[i], success) ){

                    cur= mid;
                    high= mid-1;
                }
                else{
                    low= mid+1;
                }

            }

            //System.out.println( cur);

            ans[i]= n-cur;

        }

        return ans;
    }


    boolean valid( int a, int b, long success){

        // System.out.println( "a= "+a+ " b= "+b);

        return (long)a  * (long)b >= success;
    }

}
