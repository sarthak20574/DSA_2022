package com.company.LeetCode_DailyChallenge;

public class Node_With_Highest_Edge_Score {

    //2374. Node With Highest Edge Score
    //https://leetcode.com/problems/node-with-highest-edge-score/

    /*

remeber to use long array/maxx vatriable and not int as the test cases are huge and will lead to overflow...

    we store the score of each value node in the answer array( ans[i] is the score of the node 'i')
    we keep a check of the index with the maxx score using the maxx varaible,
    at the end we search for the node whose score is equal to the maxx score

    */

    public int edgeScore(int[] edges) {

        int n= edges.length;


        // score array
        long[] ans= new long[n];

        // variable to store max score
        long maxx= -1;

        //calcualting the score of each node and keeping a check of the max. score
        for( int i=0; i<n; i++){
            ans[edges[i]]=ans[edges[i]]+i;
            maxx= Math.max(maxx, ans[edges[i]]);
        }


        // search the node with the max score
        for( int i=0; i<n; i++){
            if( ans[i]==maxx)return i;
        }

        //just to stope the compiler from throwing "missing return statement error"
        return -1;

    }
}
