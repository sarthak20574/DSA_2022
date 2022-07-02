package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Maximum_Units_on_a_Truck {

    //1710. Maximum Units on a Truck
    //https://leetcode.com/problems/maximum-units-on-a-truck/

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int ans=0;

        Arrays.sort( boxTypes,(a,b)->b[1]-a[1]);

        int i=0;
        while (i<boxTypes.length){
            if( truckSize>=boxTypes[i][0]) {
                ans+= boxTypes[i][1]*boxTypes[i][0];
                truckSize-=boxTypes[i][0];
            }
            else {
                ans+= boxTypes[i][1]*truckSize;
                break;
            }
            i++;
        }

        return ans;
    }
}
