package com.company.LeetCode_DailyChallenge;

public class Plus_One {

    //66. Plus One
    //https://leetcode.com/problems/plus-one/description/

    public int[] plusOne(int[] digits) {

        int n= digits.length;

        for( int i=n-1; i>=0; i--){
            if( digits[i]!=9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }

        int[] ans= new int[n+1];
        for( int i=0; i<n+1; i++){
            if( i==0) ans[i]=1;
            else ans[i]=0;
        }
        return ans;
    }
}
