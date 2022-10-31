package com.company;

public class Chicks_in_a_Zoo {

    //Chicks in a Zoo
    //https://practice.geeksforgeeks.org/problems/chicks-in-a-zoo1159/1

    public long NoOfChicks(int N)
    {

        //dp refers to the no of newborns on ith day

        long[] dp= new long[N+1];
        dp[1]=1;

        long alive=1;
        for( int i=2; i<N+1; i++){

            if( i>6 ){

                //died
                alive-= dp[i-6];
            }

            //new births are 2 times the alive
            dp[i]=  alive*2;

            alive= alive + dp[i];

            // System.out.println(i+" : "+dp[i]);
        }

        return alive;
    }
}
