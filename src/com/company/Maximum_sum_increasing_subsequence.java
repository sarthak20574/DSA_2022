package com.company;

public class Maximum_sum_increasing_subsequence {
    //my way:
    // if( s1[i]>s2[j])
    // ans=max(arr[i]+dp[j],ans){
    //
    // }



    public int maxSumIS(int arr[], int n) {
        int ans=0;
        int dp[]=new int[n];

        for( int i=0 ; i< n ;i++){
            dp[i]=arr[i];
        }

        for( int i =0; i< n; i++){

            for(int j=0; j<=i; j++){

                if( arr[i]>arr[j]){
                    dp[i]= Math.max(arr[i]+dp[j], dp[i]);
                }

            }
            ans= Math.max(ans, dp[i]);
        }

        return ans;
    }
}
