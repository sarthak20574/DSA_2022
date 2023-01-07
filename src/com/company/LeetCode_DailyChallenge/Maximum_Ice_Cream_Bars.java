package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Maximum_Ice_Cream_Bars {

    //1833. Maximum Ice Cream Bars
    //https://leetcode.com/problems/maximum-ice-cream-bars/description/

    public int maxIceCream(int[] costs, int coins) {

        Arrays.sort(costs);
        int ans=0,n = costs.length;
        while( coins>0 && ans<n){
            if( coins>=costs[ans]){

                coins-=costs[ans];
                ans++;
            }
            else{
                break;
            }
        }

        return ans;

    }


}
