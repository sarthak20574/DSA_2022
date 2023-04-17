package com.company.LeetCode_DailyChallenge;

import java.util.HashSet;
import java.util.Set;

public class Minimum_Cost_For_Tickets {


    //983. Minimum Cost For Tickets
    //https://leetcode.com/problems/minimum-cost-for-tickets/description/

    public int mincostTickets(int[] days, int[] costs) {

        Set<Integer> a= new HashSet<>();

        int n=0;

        for( int i: days){
            a.add(i);
            n= Math.max( i, n);
        }


        int[] ans= new int[n+1+30];
        ans[0]=0;


        for( int i=1; i<n+1+30; i++){

            if( a.contains(i)){

                ans[i]= ans[i-1]+ costs[0];

                if( i-7>=0){
                    ans[i]= Math.min(ans[i], ans[i-7]+ costs[1]);
                }


                if( i-30>=0){
                    ans[i]= Math.min(ans[i], ans[i-30]+ costs[2]);
                }
            }
            else{

                ans[i]= ans[i-1];

                if( i-7>=0){
                    ans[i]= Math.min(ans[i], ans[i-7]+ costs[1]);
                }


                if( i-30>=0){
                    ans[i]= Math.min(ans[i], ans[i-30]+ costs[2]);
                }



            }
        }

        //System.out.println(Arrays.toString(ans));
        return ans[n+30];
    }

}
