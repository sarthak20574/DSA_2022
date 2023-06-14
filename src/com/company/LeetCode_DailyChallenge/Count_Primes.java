package com.company.LeetCode_DailyChallenge;

public class Count_Primes {

    //204. Count Primes
    //https://leetcode.com/problems/count-primes/description/?envType=list&envId=r94it777

    public int countPrimes(int n) {

        boolean[] p=new boolean[n+1];

        // if true then not prime
        p[0]= true;
        if(n>=1)p[1]=true;

        int ans=0;

        for( int i=2; i<n; i++){

            if( p[i]==false){
                ans++;
                for( int j=i+i; j<=n; j+=i){
                    p[j]=true;
                }
            }

        }

        return ans;
    }

    public int[] primesum(int n) {
        boolean[] p=new boolean[n+1];

        // if true then not prime
        p[0]= true;
        if(n>=1)p[1]=true;

        int[] ans=new int[2];

        for( int i=2; i<n; i++){

            if( p[i]==false){
                for( int j=i+i; j<=n; j+=i){
                    p[j]=true;
                }
            }

        }

        for( int i=2; i<n; i++){
            if( p[i]==false){
                if( p[n-i]==false){
                    ans= new int[]{i, n-i};
                    return ans;
                }
            }
        }

        return ans;

    }
}
