package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Put_Marbles_in_Bags {

    //2551. Put Marbles in Bags

    //https://leetcode.com/problems/put-marbles-in-bags/description/
    //https://www.youtube.com/watch?v=hjyFkhXKowc&ab_channel=BroCoders

    public long putMarbles(int[] weights, int k) {

    // 1  1     2  2   3  n-1

    //2n-2

    int n= weights.length; long ans1=0, ans2=0;

        if (n == k) return 0;

    long[] arr= new long[n-1];

        for( int i=0; i<n-1; i++){
        arr[i]= weights[i]+ weights[i+1];
    }
        Arrays.sort(arr);

//        System.out.println(k-1);
//        System.out.println(n);
//
//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < k-1; i++){

        ans1 += arr[i];
        ans2 += arr[n-2-i];

    }

        return ans2-ans1;

}
}
