package com.company.LeetCode_DailyChallenge;

public class Capacity_To_Ship_Packages_Within_D_Days {

    //1011. Capacity To Ship Packages Within D Days
    //https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/
    // see neetcode IO's video

    public int shipWithinDays(int[] w, int days) {

        int low=0, high=0,mid, ans;

        for(int i: w){
            low= Math.max( i, low);
            high+=i;
        }
        ans= high;


        while( low<=high){

            mid= low+ ( high- low)/2;

            if( fn( mid, w, days)==true){
                ans=mid;
                // min
                //ans= Math.min( ans, mid);
                //System.out.println(mid);

                high= mid-1;
            }
            else{
                low= mid+1;
            }

        }

        return ans;
    }


    boolean fn( int cur, int[] w, int d){

        int ship=1, cap=cur;

        for( int i=0; i<w.length; i++){

            //System.out.println(cap+" "+ ship);

            if(cap-w[i]<0){
                ship++;
                cap=cur;
            }

            cap-=w[i];
        }

        // System.out.println();

        return ship<=d;
    }

}
