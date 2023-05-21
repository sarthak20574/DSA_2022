package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Pairs_of_Songs_With_Total_Durations_Divisible_by_60 {

    //1010. Pairs of Songs With Total Durations Divisible by 60
    //https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/description/

    public int numPairsDivisibleBy60(int[] time) {


        Map<Integer, Integer> m= new HashMap<>();


        int ans=0;

        for(int i: time){


            i= i%60;

            if( i==0) ans+=m.getOrDefault(0, 0);
            else if( m.containsKey(60-i)){

                ans+= m.get(60-i);
            }
            m.put( i, m.getOrDefault(i, 0)+1);

        }

        return ans;
    }
}
