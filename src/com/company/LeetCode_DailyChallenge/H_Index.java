package com.company.LeetCode_DailyChallenge;

public class H_Index {

    //274. H-Index
    //https://leetcode.com/problems/h-index/

    public int hIndex(int[] c) {


        //maxx= 5

        // 0    0
        // 1    1
        // 2
        // 3    3
        // 4
        // 5    5 6

        // 1 2 2 3 3 5


        int n= c.length;


        int[] arr= new int[n+1];

        for( int i: c){
            int cur= Math.min(n, i);
            arr[cur]++;
        }

        int[] pre= new int[n+1];
        pre[n]=arr[n];

        for( int i=n-1; i>=0; i--){
            pre[i]= pre[i+1]+arr[i];
        }

        //  System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(pre));
        //  System.out.println();

        int ans=0;

        for( int i=1; i<n;i++){

            if( i >= pre[i]) return Math.min(i, pre[i]);
        }
        // System.out.println("inn");

        return ans;
    }


}
