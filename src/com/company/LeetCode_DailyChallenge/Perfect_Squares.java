package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Perfect_Squares {

    //279. Perfect Squares
    //https://leetcode.com/problems/perfect-squares/description/
    // similar to coin change

    public int numSquares(int n) {

        List<Integer> arr= new ArrayList<>();

        int size=0;

        for(size=1; size*size<=n; size++){
            arr.add(size*size);
        }
        System.out.println(arr.toString());
        size= arr.size();


        int[] dp= new int[n+1];



        Arrays.fill( dp, Integer.MAX_VALUE);

        dp[0]= 0;

        for( int i=0; i<size; i++){

            for( int j=1; j<n+1; j++){
                if(j-arr.get(i)>=0)
                    dp[j]=Math.min(1+ dp[j-arr.get(i)],dp[j]);
                else
                    dp[j]=dp[j];
            }
        }

        return dp[n];


    }

}
