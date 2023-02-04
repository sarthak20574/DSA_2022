package com.company.LeetCode_DailyChallenge;

public class Permutation_in_String {

    //567. Permutation in String
    //https://leetcode.com/problems/permutation-in-string/description/

    public boolean checkInclusion(String s1, String s2) {

        int[] freq1= new int[26];

        for( char c: s1.toCharArray()){
            freq1[c-'a']++;
        }

        int[] freq2= new int[26];

        int i=0, j=s1.length(), n= s2.length();

        if( n<j) return false;

        for( int k=0; k<j; k++){
            freq2[s2.charAt(k)-'a']++;
        }

        // System.out.println()

        if( equal(freq2, freq1)==true) return true;

        while( j<n){

            freq2[s2.charAt(j)-'a']++;
            freq2[s2.charAt(i)-'a']--;

            i++;
            j++;
            if( equal(freq2, freq1)==true) return true;
        }

        return false;
    }


    boolean equal( int[] freq1, int[] freq2){

        for( int i=0; i<26; i++){

            if( freq1[i]!=freq2[i]) return false;
        }

        return true;
    }

}
