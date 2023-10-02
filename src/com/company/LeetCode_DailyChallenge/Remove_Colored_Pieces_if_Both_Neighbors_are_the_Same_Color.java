package com.company.LeetCode_DailyChallenge;

public class Remove_Colored_Pieces_if_Both_Neighbors_are_the_Same_Color {

    //2038. Remove Colored Pieces if Both Neighbors are the Same Color
    //https://leetcode.com/problems/remove-colored-pieces-if-both-neighbors-are-the-same-color/description/?envType=daily-question&envId=2023-10-02
    //https://www.youtube.com/watch?v=T54GScWobZ4

    public boolean winnerOfGame(String c) {
        int a=0, b=0, n=c.length();

        for( int i=1; i<n-1; i++){
            if(c.charAt(i-1)=='A' && c.charAt(i)=='A'
                    && c.charAt(i+1)=='A' ){
                a++;
            }
            else if(c.charAt(i-1)=='B' && c.charAt(i)=='B'
                    && c.charAt(i+1)=='B' ){
                b++;
            }
        }
        if( a==0 && b==0) return false;

        return a>b? true: false;
    }
}
