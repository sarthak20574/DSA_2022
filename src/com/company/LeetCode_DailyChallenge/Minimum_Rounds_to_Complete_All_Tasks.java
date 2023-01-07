package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Minimum_Rounds_to_Complete_All_Tasks {

    //2244. Minimum Rounds to Complete All Tasks
    //https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/description/


    public int minimumRounds(int[] tasks) {

        //1
        // 2 -1
        // 3  -1
        // 4  -2
        // 5  - 2
        // 6 -2
        // 7 - min   5 + 2 or 4 + 3    =3   3 +4
        // 8 - 6+2 or 5 +3             = 3
        // 9                          =3
        // 10 %3 =1 so  /3-1  10-6 +4 %2  6 + 2 +2
        // 11 %3=9 +2
        // 12                 4   /3 + %3/2
        // 13 9 +4            5   4 1/2
        // 14 12 + 2          5   4 1
        // 15 15              5
        // 16 12 + 4          6   5 1
        //17 15 + 2           6
        // ans = /3 +1

        Map<Integer, Integer> m= new HashMap<>();

        for( int i: tasks){
            m.put( i, m.getOrDefault(i,0)+1);
        }


        int ans=0;

        for( int i: m.values()){
            if( i==1) return -1;
            int r= i%3;
            ans+=i/3;
            if( r!=0) ans++;
        }

        return ans;
    }
}
