package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Koko_Eating_Bananas {

    //875. Koko Eating Bananas
    //https://leetcode.com/problems/koko-eating-bananas/description/
    // can see NeetCode's video

    public int minEatingSpeed(int[] piles, int h) {


        int low=1, high=1_000_000_000, mid, ans=1_000_000_000;

        while(low<=high){

            mid= low + (high- low)/2;


            if(valid(piles, mid, h) ){

                ans= mid;
                high= mid-1;
            }
            else{
                // need more speed
                low=mid+1;
            }

        }

        return ans;
    }

    boolean valid(int piles[], int k, int h){

        long cur = 0;
        for(int p : piles){
            cur += p/k;

            if(p % k != 0) cur++;
        }

        return cur <= h;
    }


}
