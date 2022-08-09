package com.company.LeetCode_DailyChallenge;

public class Find_the_Winner_of_the_Circular_Game {

    public int findTheWinner(int n, int k) {

        //1823. Find the Winner of the Circular Game
        //https://leetcode.com/problems/find-the-winner-of-the-circular-game/
        //https://www.youtube.com/watch?v=fZ3p2Iw-O2I&ab_channel=GeeksforGeeks


        // suppose prev_ans is the winner with n-1 people
        //for n people, the winner will be the postion of the sword with n-1
        //people shifted by k, since its a circular game we mod it by the no of people left in the game

        //  ans(n)= (ans(n-1) +k)%n



        return fn( n, k)+1;// adding one to convert 0 based indexing to 1 based indexing
    }

    int fn( int n, int k){

        // base case if we have only ans that is the winner
        if( n==1)return 0;

        int prev_ans= fn( n-1, k);
        return (prev_ans+k)%n;
    }
}
