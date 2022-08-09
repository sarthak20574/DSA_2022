package com.company;

public class Egg_Dropping_Puzzle {


    //Egg Dropping Puzzle
    //https://practice.geeksforgeeks.org/problems/egg-dropping-puzzle-1587115620/1

    //https://www.youtube.com/watch?v=iOaRjDT0vjc&ab_channel=BackToBackSWE
    //https://www.youtube.com/watch?v=3hcaVyX00_4&ab_channel=TusharRoy-CodingMadeSimple

    static int eggDrop(int n, int k)
    {
        int[][] dp= new int[n+1][k+1];
        // rows= eggs columns= floors

        // base cases= fpor 0 floors or 0 eggs we need 0 moves
        // for 1 egg and N floor we need  N moves
        //for 1 floor and N eggs we need 1 move


        for( int i=1; i<k+1; i++){
            dp[1][i]= i;
        }

        //
        for( int i=1; i<n+1; i++){
            dp[i][1]= 1;
        }


        for(int i=2; i<n+1; i++){

            for( int j=2; j<k+1; j++){

                int ans=j;// drop 1 egg everywhere

                for( int x=1; x<=j; x++){
                    int t= 1+ Math.max(dp[i-1][x-1], dp[i][j-x]);
                    ans= Math.min( t, ans);
                }
                dp[i][j]=ans;

            }
        }

        return dp[n][k];
    }
}
