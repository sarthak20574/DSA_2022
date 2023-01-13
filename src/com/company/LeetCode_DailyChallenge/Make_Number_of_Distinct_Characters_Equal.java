package com.company.LeetCode_DailyChallenge;

public class Make_Number_of_Distinct_Characters_Equal {

    //2531. Make Number of Distinct Characters Equal
    //https://leetcode.com/problems/make-number-of-distinct-characters-equal/description/

    public boolean isItPossible(String word1, String word2) {

        int[] w1= new int[26];
        int[] w2= new int[26];

        for( char i: word1.toCharArray()){
            w1[i-'a']++;
        }

        for( char i: word2.toCharArray()){
            w2[i-'a']++;
        }

        for( int i=0; i<26; i++){
            if(w1[i]==0)continue;

            for( int j=0; j<26; j++){
                if(w2[j]==0)continue;

                w1[i]--;
                w2[j]--;

                w1[j]++;
                w2[i]++;

                if( equal(w1, w2)==true) return true;

                w1[i]++;
                w2[j]++;

                w1[j]--;
                w2[i]--;
            }
        }

        return false;
    }

    boolean equal( int[] x1, int[] x2){

        int ans= 0;

        for( int i=0; i<26; i++){
            if( x1[i]>0) ans++;
            if( x2[i]>0) ans--;
        }

        return ans==0;
    }
}
