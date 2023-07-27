package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Maximum_Running_Time_of_N_Computers {

    //2141. Maximum Running Time of N Computers
    //https://leetcode.com/problems/maximum-running-time-of-n-computers/description/

    //greedy
    public long maxRunTime(int n, int[] b) {

        Arrays.sort(b);

        int len= b.length; long sum=0;

        for( int i: b){
            sum+=i;
        }

        // long avg= sum/n;

        // System.out.println( "sum,avg ="+sum+","+avg);

        int k=0;


        while( sum/(n-k)<b[len-1-k]){
            sum-=b[len-1-k];
            k++;
        }


        // System.out.println( " sum,len ="+sum+","+len);

        //10, 10, 1
        return sum/(n-k);

    }


    // using binary search
    public long maxRunTime1(int n, int[] b) {

        int len= b.length; long sum=0;

        for( int i: b){
            sum+=i;
        }

        long avg= sum/n;

        long beg=1,end= avg, mid, ans=-1;

        while( beg<=end){
            mid= beg+ (end-beg)/2;

            // valid so lets try for even more minutes
            if( fn( mid, n, b)){
                ans= mid;
                beg= mid+1;
            }
            else{
                end= mid-1;
            }
        }
        return ans;
    }

    boolean fn(long mid,int n, int[] b){

        long sum=0, k=0;
        for(int i=0;i<b.length; i++){
            if( b[i]>=mid){
                k++;
            }
            else{
                sum+=b[i];
            }
        }
        return sum>= mid*(n-k);

        //3
    }

}
