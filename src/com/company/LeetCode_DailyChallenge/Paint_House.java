package com.company.LeetCode_DailyChallenge;

public class Paint_House {

    //Paint House
    //Walls Coloring or Paint House
    //https://practice.geeksforgeeks.org/problems/51b266505221b97522b1d2c86ddad1868a54831b/1
    // or on lintcode
    //https://www.lintcode.com/problem/515/
    //https://www.youtube.com/watch?v=-w67-4tnH5U&ab_channel=NeetCode

    int minCost(int [][] costs, int n){
        //if( n==0) return 0;

        for( int i=1; i<n; i++){

        costs[i][2]+=Math.min(costs[i-1][0], costs[i-1][1]);
        costs[i][1]+=Math.min(costs[i-1][0], costs[i-1][2]);
        costs[i][0]+=Math.min(costs[i-1][2], costs[i-1][1]);
    }
        return Math.min( costs[n-1][0], Math.min(costs[n-1][1],costs[n-1][2]) );
}

}
