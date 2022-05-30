package com.company.LeetCode_DailyChallenge;

public class Maximum_Product_of_Word_Lengths {
    //318. Maximum Product of Word Lengths
    //https://leetcode.com/problems/maximum-product-of-word-lengths/
    //https://www.youtube.com/watch?v=3XHAikDnB2w

    public int maxProduct(String[] words) {

        int n= words.length;
        int[] states= new int[n];

        for( int i=0; i<n ; i++)
            states[i]= calcStates(words[i]);

        int ans=0;
        for( int i=0; i<n ; i++){

            for(int j=i+1; j<n; j++){
                if( (states[i] & states[j])==0){
                    ans= Math.max( words[i].length() * words[j].length(),ans);
                }
            }
        }
        return ans;
    }

    private int calcStates(String word){
        int n= word.length();
        int ans=0;
        for( int i=0; i<n; i++){

            //left shift
            ans|=1<<(word.charAt(i)-'a');
        }

        return ans;
    }
}
