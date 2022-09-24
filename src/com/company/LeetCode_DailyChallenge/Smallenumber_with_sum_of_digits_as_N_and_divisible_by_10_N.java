package com.company.LeetCode_DailyChallenge;

public class Smallenumber_with_sum_of_digits_as_N_and_divisible_by_10_N {

    //https://practice.geeksforgeeks.org/problems/smallest-number-with-sum-of-digits-as-n-and-divisible-by-10n4032/1
    public String digitsNum(int n)
    {
        int nn=n;

        StringBuilder ans= new StringBuilder();

        while(nn>0){
            if( nn>=9){
                ans.append("9");
                nn-=9;
            }
            else{
                ans.append(nn);
                nn=0;
            }
        }

        ans.reverse();
        for( int i=0; i<n; i++){
            ans.append("0");
        }

        return ans.toString();
    }
}
