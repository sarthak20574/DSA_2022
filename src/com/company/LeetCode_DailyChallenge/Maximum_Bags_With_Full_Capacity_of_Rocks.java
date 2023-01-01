package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Maximum_Bags_With_Full_Capacity_of_Rocks {

    //2279. Maximum Bags With Full Capacity of Rocks
    //https://leetcode.com/problems/maximum-bags-with-full-capacity-of-rocks/description/

    public int maximumBags(int[] cap, int[] rocks, int add) {

        int n= cap.length;
        int[] a= new int[n];

        for( int i=0; i<n; i++){
            a[i]= cap[i]- rocks[i];
        }

        Arrays.sort( a);

        int ans=0;

        for( int i=0; i<n; i++){
            if(add>=a[i]){
                add-=a[i];
                ans++;
            }
            else{
                break;
            }
        }

        return ans;
    }
}
