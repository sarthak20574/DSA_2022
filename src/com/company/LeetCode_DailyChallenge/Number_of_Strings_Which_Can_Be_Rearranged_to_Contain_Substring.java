package com.company.LeetCode_DailyChallenge;

public class Number_of_Strings_Which_Can_Be_Rearranged_to_Contain_Substring {

    //2930. Number of Strings Which Can Be Rearranged to Contain Substring
    //https://leetcode.com/problems/number-of-strings-which-can-be-rearranged-to-contain-substring/description/
    //https://www.youtube.com/watch?v=EVyn-OVpuEg&t=2380s&ab_channel=AryanMittal

    long mod= 1_000_000_007L;
    public int stringCount(int n) {

        long ans;

        long x=fn( 26, n), y= ((n+75)* fn(25, n-1))%mod,
                z=( (2*n+72)*fn(24, n-1))%mod, k=((n+23)*fn( 23, n-1))%mod;

        ans= x- y+z-k;
        ans%=mod;
        ans= (ans+mod)%mod;
        return (int)ans;
    }

    long fn( long x, long p){

        long ans=1;
        while( p>0){
            if( p%2==0){
                x=(x*x)%mod;
                p/=2;
            }
            else{
                ans=( ans *x)%mod;
                p--;
            }
        }

        return ans;
    }
}
