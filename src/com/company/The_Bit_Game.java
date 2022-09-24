package com.company;

public class The_Bit_Game {
    //The Bit Game
    //https://practice.geeksforgeeks.org/problems/the-bit-game2313/1

    public static int swapBitGame(long N) {
        int ans=0;
        while( N !=0){
            N = N & (N-1);
            ans++;
        }
        return ans%2==1?1:2;
    }
}
