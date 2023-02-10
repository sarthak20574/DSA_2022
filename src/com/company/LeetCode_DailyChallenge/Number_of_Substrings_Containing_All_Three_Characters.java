package com.company.LeetCode_DailyChallenge;

public class Number_of_Substrings_Containing_All_Three_Characters {

    //1358. Number of Substrings Containing All Three Characters
    //https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/description/

    public int numberOfSubstrings(String s) {


        /*
        a
        ab
        abc 1
        abca  bca 2
        abcab bcab cab 3
        abcabc bcabc cabc abc 4

        */

        int j=0, no=0, n= s.length(), ans=0;

        int[] freq=new int[3];


        for( int i=0; i<n; i++){

            int ind=s.charAt(i)-'a';
            freq[ind]++;
            if( freq[ind]==1)no++;

            while( freq[s.charAt(j)-'a']-1>0){
                freq[s.charAt(j)-'a']--;
                j++;
            }

            if( no==3){
                ans+=j+1;
            }

        }
        return ans;
    }

}
