package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Find_minimum_number_of_Laptops_required {

    //Find minimum number of Laptops required
    //https://practice.geeksforgeeks.org/problems/af49b143a4ead583e943ca6176fbd7ea55b121ae/1

    public int minLaptops(int n, int[] s, int[] e) {
        // 1 2 5    2 3 6


        int ans=1, cur=1;

        Arrays.sort(s);
        Arrays.sort(e);

        int pre=s[0], nxt=e[0], i=1, j=0;

        while(i<n && j<n){

            if( e[j]>s[i]){
                i++;
                cur++;
            }
            else{
                j++;
                cur--;
            }
            ans= Math.max( ans, cur);
        }

        return ans;

    }
}
