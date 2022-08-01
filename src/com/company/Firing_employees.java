package com.company;

public class Firing_employees {
    //Firing employees
    //https://practice.geeksforgeeks.org/problems/firing-employees5306/1
    //https://www.youtube.com/watch?v=haZlf14clrQ&ab_channel=Let%27sPracticeTogether
    //https://www.youtube.com/watch?v=-L55Ig2st-o&ab_channel=SagarMalhotra

    static int firingEmployees(int arr[], int n) {

        int[] dp= new int[n];

        int ans=0;
        for( int i=0; i<n; i++){
            if( arr[i]==0)continue;
            dp[i]=dfs(arr,n,i, dp);
            if( is_prime(dp[i] +i+1)) ans++;
        }
        return ans;
    }

    static int dfs(int arr[], int n, int i, int[] dp){
        if( arr[i]==0) return 0;

        if( dp[i]!=0) return dp[i];
        return dp[i]= 1+dfs(arr, n, arr[i]-1, dp);
    }

    static boolean is_prime(int x){

        if( x<=1) return false;
        else if ( x==2) return true;
        else if ( x%2==0) return false;

        for( int i=3; i<=Math.sqrt(x); i+=2){
            if( x%i==0){
                return false;
            }

        }
        return true;
    }
}
