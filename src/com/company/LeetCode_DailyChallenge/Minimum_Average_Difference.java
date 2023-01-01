package com.company.LeetCode_DailyChallenge;

public class Minimum_Average_Difference {

    //2256. Minimum Average Difference
    //https://leetcode.com/problems/minimum-average-difference/description/

    public int minimumAverageDifference(int[] nums) {

        long s=0;
        int n= nums.length, ans_i=0;

        long[] pre= new long[n];

        for( int i=0; i<n;i++){
            s+=nums[i];
            pre[i]=s;
        }

        long ans=Long.MAX_VALUE;

        for( int i=0; i<n-1; i++){
            if( ans>Math.abs((s-pre[i])/(n-i-1) -(pre[i])/(i+1))){
                ans_i=i;
                ans=Math.abs((s-pre[i])/(n-i-1) -(pre[i])/(i+1));
            }

            //System.out.println( (s-pre[i])+" "+(n-i-1)+" " +(pre[i])+" "+(i+1)  );
        }

        if( ans>s/n){
            ans_i=n-1;
            ans=s/n;
        }

        return ans_i;
    }

}
