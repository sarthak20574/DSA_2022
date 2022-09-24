package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Bag_of_Tokens {

    //https://leetcode.com/problems/bag-of-tokens/description/

    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);


        // i and j are the left and the right pointers pointing towards the smallest and the largest items in the array

        // cur is the current score and ans is the best ever score
        int i=0,j=tokens.length-1, cur=0,ans=0;

        // we try to convert as many smallest tokens as possible into scores greedily as soon as we run out of power we try to use 1 score to get the largest possible power and try converting that to score by choosing the next smallest tokens, untill we just don't have enough score to convert to power...

        while( i<=j){
            if(power>= tokens[i]){
                cur++;
                power-=tokens[i];
                i++;
                ans= Math.max( ans, cur);

            }
            else{
                if(cur>0){
                    cur--;
                    power+=tokens[j];
                    j--;
                }
                else break;
            }
        }

        return ans;
    }
}
