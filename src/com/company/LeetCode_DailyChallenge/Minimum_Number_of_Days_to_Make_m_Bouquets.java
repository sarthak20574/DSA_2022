package com.company.LeetCode_DailyChallenge;

public class Minimum_Number_of_Days_to_Make_m_Bouquets {

    //1482. Minimum Number of Days to Make m Bouquets
    //https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/description/

    public int minDays(int[] b, int m, int k) {

        if( k*m> b.length){
            return -1;
        }

        int low=1, high= 1_000_000_000, mid, ans=1_000_000_001;

        while( low<= high){

            mid= low+ ( high- low)/2;

            if( valid(b, m, k, mid)){
                ans= mid;
                high= mid-1;
            }
            else{

                low= mid+1;
            }

        }

        return ans==1_000_000_001?-1:ans;
    }

    boolean valid( int[] b, int m, int k, int mid){

        int i=0,cur=0, n= b.length;
        while(i<n ){

            if(b[i]>mid){
                cur=0;
            }
            else{
                cur++;
            }
            if( cur==k){
                m--;
                cur=0;
            }

            i++;
        }

        return m<=0;
    }
}
