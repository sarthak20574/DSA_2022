package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Word_Subsets {
    //916. Word Subsets
    //https://leetcode.com/problems/word-subsets/
    //https://www.youtube.com/watch?v=tvioNeOXRUg&ab_channel=NickWhite

    public List<String> wordSubsets(String[] words1, String[] words2) {

        List<String> ans= new ArrayList<>();



        int[] freqs= new int[26];
        for( int i=0; i<words2.length; i++){

            int[] temp= freq(words2[i],words2[i].length());
            for( int j=0;j<26;j++){

                freqs[j]=Math.max(freqs[j], temp[j]);
            }
        }


        for( int i=0; i<words1.length; i++){

            boolean k=true;
            int[] temp= freq(words1[i], words1[i].length());

            for( int j=0; j<26; j++){
                if( freqs[j]>temp[j]){
                    k=false;
                    break;
                }
            }

            if(k==true)
                ans.add(words1[i]);

        }
        return ans;
    }




    int[] freq(String x, int n){

        int[] arr= new int[26];

        for( int i=0; i<n; i++){
            arr[x.charAt(i)-'a']++;
        }

        return arr;

    }
}
