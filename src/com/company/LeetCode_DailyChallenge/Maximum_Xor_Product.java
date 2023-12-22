package com.company.LeetCode_DailyChallenge;

public class Maximum_Xor_Product {

    //2939. Maximum Xor Product
    //https://leetcode.com/problems/maximum-xor-product/
    //https://www.youtube.com/watch?v=V3p46NDkFGg&t=1798s&ab_channel=AryanMittal

    long mod= 1_000_000_007l;
    public int maximumXorProduct(long a, long b, int n) {

        for( long i=n-1; i>=0; i--){

            long x=1l<<i;
            if(( x & a)==(x & b) ){
                a= a|x;
                b= b|x;
            }
            else{
                //
                if( a < b){
                    a=a|x;
                    b=b&(~x);
                }
                else{
                    b=b|x;
                    a=a&(~x);
                }
            }
        }

        a= a%mod;
        b=b%mod;
        b=(a*b)%mod;
        return (int) b;
    }

}
