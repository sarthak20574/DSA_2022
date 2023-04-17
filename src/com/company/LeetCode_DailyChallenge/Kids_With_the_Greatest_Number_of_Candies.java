package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Kids_With_the_Greatest_Number_of_Candies {

    //1431. Kids With the Greatest Number of Candies
    //https://leetcode.com/problems/kids-with-the-greatest-number-of-candies

    public List<Boolean> kidsWithCandies(int[] candies, int e) {

        List<Boolean> ans= new ArrayList<>();

        int maxx=0;
        for( int i: candies){
            maxx= Math.max( maxx, i);
        }

        for( int i=0; i<candies.length; i++){
            ans.add( i, candies[i] + e >= maxx);
        }

        return ans;
    }

}
