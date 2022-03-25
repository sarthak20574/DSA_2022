package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class TwoCityScheduling {
    //https://leetcode.com/problems/two-city-scheduling/

    // relative cost to fly city A than B
    // for A,B = 10, 20 its 10( save 10 from flying to city A than B)
    //30, 200, its 170
    // 400, 50 its -350
    // 30, 20  its -10

    public int twoCitySchedCost(int[][] costs) {

        Arrays.sort(costs, (a,b)->(a[0]-a[1])-(b[0]-b[1]));

        int ans=0;
        int n= costs.length;

        for( int i=0; i< n; i++){
            if(i< n/2){
                ans+=costs[i][0];
            }
            else {
                ans+=costs[i][1];
            }
        }
        return ans;
    }

}
