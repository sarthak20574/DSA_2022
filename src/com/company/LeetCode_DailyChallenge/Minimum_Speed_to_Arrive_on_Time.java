package com.company.LeetCode_DailyChallenge;

public class Minimum_Speed_to_Arrive_on_Time {

    //1870. Minimum Speed to Arrive on Time
    //https://leetcode.com/problems/minimum-speed-to-arrive-on-time/description/

    public int minSpeedOnTime(int[] dist, double hour) {


        int n= dist.length;

        int beg=1, end= 1_000_000_001, ans=-1, mid;

        if( n-1>hour) return -1;

        while( beg<=end){

            mid= beg+ (end-beg)/2;

            // System.out.println("mid= "+mid);

            // too fast try to lessen the speed
            if( fn(dist, mid)<=hour){
                ans= mid;
                end = mid-1;

                // System.out.println("success ans="+mid);
            }
            else{
                // taking too much time more speed
                beg= mid+1;
                //System.out.println("fail mid="+mid);
            }

            // if( beg==end) break;
        }

        //  System.out.println(fn( dist, 1.0));

        // System.out.println(fn( dist, 1.0));
        return (int)ans;
    }


    double fn( int[] dist, double cur){

        double t=0;

        for( int i=0; i<dist.length-1; i++){
            t+=Math.ceil(((double)dist[i])/((double)cur));
        }
        t+=((double)dist[dist.length-1])/((double)cur);
        //  System.out.println("t="+t+" speed="+cur);

        //  System.out.println("ceil= "+Math.ceil(1.7));
        return t;
    }
}
