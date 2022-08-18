package com.company;

public class Optimal_Strategy_for_a_Game {


    //Pots of Gold Game
    //https://practice.geeksforgeeks.org/problems/pots-of-gold-game/1
    //https://www.youtube.com/watch?v=ww4V7vRIzSk&ab_channel=Pepcoding


    public static int maxCoins(int A[],int n)
    {


        int[][] dp= new int[n][n];

        for( int g=0; g<n; g++){
            for( int i=0, j=g; j<n;i++,j++){


                if( g==0) dp[i][j]= A[i];
                else if( g==1){
                    dp[i][j]= Math.max(A[i], A[j]);
                }
                else{
                    // we took i, opponent can choose i+1 or j,
                    //so leaving us with i+2,j or i+1, j-1
                    int ci=A[i]+ Math. min(dp[i+2][j], dp[i+1][j-1]);

                    //choose j, opp can choose i or j-1
                    int cj=A[j]+ Math.min(dp[i+1][j-1], dp[i][j-2]);

                    dp[i][j]= Math.max( ci, cj);
                }
            }
        }

        return dp[0][n-1];

    }

}
