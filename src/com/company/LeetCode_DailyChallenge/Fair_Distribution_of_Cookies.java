package com.company.LeetCode_DailyChallenge;

public class Fair_Distribution_of_Cookies {


    //2305. Fair Distribution of Cookies
    //https://leetcode.com/problems/fair-distribution-of-cookies/description/

    int ans=Integer.MAX_VALUE;

    public int distributeCookies(int[] coo, int k) {

        int[] x= new int[k];

        ans=Integer.MAX_VALUE;

        fn(coo,x,k, 0, coo.length);

        return ans;
    }

    void fn( int[] coo, int[] x, int k, int i, int n){

        if( i==n){
            int cur= -1;

            for( int ll: x){
                cur= Math.max(ll, cur);
            }
            ans= Math.min(cur, ans);
            return;
        }


        for( int l=0; l<k; l++){
            x[l]+=coo[i];
            fn(coo, x, k, i+1, n);
            x[l]-=coo[i];
        }

    }

}
