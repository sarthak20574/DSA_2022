package com.company;

public class Minimum_Days {

    //Minimum Days
    //https://practice.geeksforgeeks.org/problems/f4d22b1f9d62e8bee0ff84e9fa51dc66eb5005ec/1

    public static int getMinimumDays(int n, String S, int[] P) {
        // code here

        // aaaaaaaaaaaaaaaaaaaaab
        // aaaabbbbbc

        char[] s= S.toCharArray();

        int j=0, i=0;

        while( i<n-1){

            if(s[i]=='?' || s[i]!=s[i+1]){
                i++;
            }
            else{
                s[P[j++]]='?';
            }

            //System.out.println("i="+i+", j="+j+",  "+Arrays.toString(s));
        }

        return j;
    }


}
